import * as React from 'react';
import Chart from '../model/Chart';
import SharedViewProps from './SharedViewProps';
import UnionValue from '../model/UnionValue';
import ChartRenderer, {
    ChartSeriesData,
    ChartData,
    ChartRendererProps
} from '../chart/ChartRenderer';
import {
    PlotlyLineChart,
    PlotlyBarChart,
    PlotlyPieChart,
    PlotlyRadarChart,
    PlotlyScatterChart,
    PlotlyBubbleChart,
    // PlotlyGaugeChart,
    PlotlyDoughnutChart
} from '../chart/PlotlyCharts';
import GaugeChart from '../chart/GaugeChart';
import  { VariantType }  from '../model/Variant';
import RenameAsset from '../action/RenameAsset';
import Action from '../action/Action';
import UpdateChart from '../action/UpdateChart';
import classnames from "classnames";
import './ChartView.css';

interface ChartViewProps extends SharedViewProps<ChartView> {
    chart: Chart;
    renderer?: ChartRenderer;
    className?: string;
}

interface ChartViewState {
    data: ChartData;
}

class ChartView extends React.Component<ChartViewProps, ChartViewState>{
    constructor(props: ChartViewProps) {
        super(props);

        this.state = this.createInitialState(props);

        this.applyAction = this.applyAction.bind(this);
    }

    public componentDidMount() {
        if (typeof this.props.herald !== 'undefined') {
            this.props.herald.subscribe(this.applyAction);
        }
    }

    public componentWillUnmount() {
        if (typeof this.props.herald !== 'undefined') {
            this.props.herald.unsubscribe(this.applyAction);
        }
    }

    public componentDidUpdate(prevProps: ChartViewProps) {
        if (this.props.chart !== prevProps.chart) {
            this.setState(this.createInitialState(this.props));
        }
    }

    protected createInitialState(props: ChartViewProps): ChartViewState {
        const data = this.extractData(props.chart);
        return { data };
    }

    protected extractData(chart: Chart): ChartData {
        const data: ChartData = {
            type: chart.type,
            name: chart.name,
            title: chart.title.toString(),
            categories: [],
            series: [],
            xAxis: chart.xAxis,
            yAxis: chart.yAxis,
            zAxis: chart.zAxis,
        };
        const categories = chart.categories;
        if (!categories.isBlank()) {
            const catList = categories.listValue();
            for (let i = 0; i < catList.length; i++) {
                if (catList[i].valueType() === VariantType.DATE) {
                    data.categories[i] = catList[i].dateValue();
                } else {
                    data.categories[i] = catList[i].toString();
                }
            }
        }
        for (const ser of chart.series) {
            const sName = ser.name.toString();
            const sXValues = this.extractSeriesValues(ser.xValues);
            const sYValues = this.extractSeriesValues(ser.yValues);
            const sZValues = this.extractSeriesValues(ser.zValues);
            data.series.push({
                name: sName,
                xValues: sXValues,
                yValues: sYValues,
                zValues: sZValues,
            });
        }
        return data;
    }

    protected extractSeriesValues(seriesValues: UnionValue): number[] {
        const values: number[] = [];
        if (typeof seriesValues === 'undefined' || seriesValues === null) {
            return values;
        }
        if (seriesValues.isBlank()) {
            return values;
        }
        if (seriesValues.valueType() === VariantType.LIST) {
            const list = seriesValues.listValue();
            for (let i = 0; i < list.length; i++) {
                values[i] = (list[i].isBlank() ||
                    list[i].valueType() !== VariantType.DECIMAL) ?
                    NaN : list[i].numberValue();
            }
        } else if (seriesValues.valueType() === VariantType.DECIMAL) {
            values[0] = seriesValues.numberValue();
        } else {
            // throw new Error("Illegal series values: " + seriesValues);
        }
        return values;
    }

    protected getChartRenderer(type: string): ChartRenderer {
        if (typeof this.props.renderer !== 'undefined') {
            return this.props.renderer;
        }

        switch (type) {
            case 'Line':
                return PlotlyLineChart;
            case 'Bar':
                return PlotlyBarChart;
            case 'Pie':
                return PlotlyPieChart;
            case 'Doughnut':
                return PlotlyDoughnutChart;
            case 'Radar':
                return PlotlyRadarChart;
            case 'Scatter':
                return PlotlyScatterChart;
            case 'Bubble':
                return PlotlyBubbleChart;
            case 'Gauge':
                return GaugeChart;
            default:
                return UnknownRenderer;
        }
    }

    protected applyAction(action: Action) {
        if (!action.isAssetAction() ||
            action.targetAsset() !== this.props.chart.name) {
            return;
        }
        if (typeof action.renameAsset !== 'undefined') {
            this.applyRenameAsset(action.renameAsset);
        } else if (typeof action.updateChart !== 'undefined') {
            this.applyUpdateChart(action.updateChart);
        }
    }

    protected applyRenameAsset(renameAsset: RenameAsset) {
        this.props.chart.name = renameAsset.newAssetName;
        this.setState(this.createInitialState(this.props));
    }

    protected applyUpdateChart(updateChart: UpdateChart) {
        Object.assign(this.props.chart, updateChart.chart);
        this.setState(this.createInitialState(this.props));
    }

    public render() {
        const className = classnames(
            "chart-view",
            "type-" + this.props.chart.type,
            this.props.className);

        const data = this.state.data;

        const Renderer = this.getChartRenderer(data.type);

        return (
            <div className={className}>
                <div className="title">
                    <h3>{data.title}</h3>
                </div>
                <div className="content">
                    <Renderer style={{flex:"1 1"}} data={data} />
                </div>
            </div>
        );
    }
}

function UnknownRenderer(props: ChartRendererProps) {
    return (
        <p className="alert">Unknown chart type: {props.data.type}</p>
    );
}

export default ChartView;
export { ChartData, ChartSeriesData, ChartRendererProps, ChartViewProps };

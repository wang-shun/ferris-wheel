import * as React from 'react';
import classnames from 'classnames';
import './Toolbar.css';

interface GroupProps extends React.ClassAttributes<any> {
    className?: string,
    children?: React.ReactNode;
}

function Group(props: GroupProps) {
    const className = classnames("tool-group", props.className);

    return (
        <div className={className}>
            {props.children}
        </div>
    );
}

interface ToolbarProps extends React.ClassAttributes<Toolbar> {
    className?: string;
}

class Toolbar extends React.Component<ToolbarProps> {

    public render() {
        const className = classnames("toolbar", this.props.className);

        return (
            <div className={className}>
                {this.props.children}
            </div>
        );
    }
}

export default Toolbar;
export { ToolbarProps, Group };

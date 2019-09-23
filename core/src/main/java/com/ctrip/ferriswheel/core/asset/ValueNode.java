package com.ctrip.ferriswheel.core.asset;

import com.ctrip.ferriswheel.common.variant.*;
import com.ctrip.ferriswheel.core.formula.Formula;
import com.ctrip.ferriswheel.core.formula.FormulaElement;
import com.ctrip.ferriswheel.core.formula.eval.FormulaEvaluator;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class ValueNode extends AssetNode implements VariantNode {
    private DynamicValue data;
    private Formula formula;

    ValueNode(AssetManager assetManager, Value value, String formulaString) {
        super(assetManager);
        this.data = new DynamicValue(formulaString, value);
        this.formula = (formulaString == null || formulaString.isEmpty()) ? null : new Formula(formulaString);
    }

    ValueNode(AssetManager assetManager, DynamicVariant data) {
        super(assetManager);
        this.data = new DynamicValue(data);
        this.formula = data.isFormula() ? new Formula(data.getFormulaString()) : null;
    }

    ValueNode(AssetNode parent, Value value, String formulaString) {
        super(parent);
        this.data = new DynamicValue(formulaString, value);
        this.formula = (formulaString == null || formulaString.isEmpty()) ? null : new Formula(formulaString);
    }

    @Override
    public EvaluationState doEvaluate(EvaluationContext context) {
        if (!isFormula()) {
            return EvaluationState.DONE;
        }
        if (getFormulaElements() == null) {
            throw new IllegalArgumentException();
        }
        SheetAssetNode sheet = parent(SheetAssetNode.class);
        FormulaEvaluator evaluator = context.getFormulaEvaluator();
        evaluator.setCurrentSheet(sheet.getSheet());
        evaluator.setCurrentAsset(sheet);
        Variant value = evaluator.evaluate(getFormulaElements());
        if (!value.equals(getData())) {
            doUpdateValue(value);
        }
        return EvaluationState.DONE;
    }

    protected void doUpdateValue(Variant newValue) {
        setValue(newValue);
    }

    @Override
    public boolean isVolatile() {
        return isFormula() && formula.isVolatile();
    }

    public boolean isFormula() {
        return data.isFormula();
    }

    public DynamicValue getData() {
        return data;
    }

    protected void setValue(Variant value) {
        this.data.setVariant(value);
        markDirty();
    }

    public String getFormulaString() {
        return data.getFormulaString();
    }

    protected Formula getFormula() {
        return formula;
    }

    protected void setFormula(Formula formula) {
        this.data.setFormulaString(formula == null ? null : formula.getString());
        this.formula = formula;
        markDirty();
        resolveFormulaIfNeeded();
    }

    protected void setDynamicVariant(DynamicVariant variable) {
        this.data = new DynamicValue(variable);
        if (variable != null && variable.isFormula()) {
            this.formula = new Formula(variable.getFormulaString());
        } else {
            this.formula = null;
        }
        markDirty();
        resolveFormulaIfNeeded();
    }

    private void resolveFormulaIfNeeded() {
        if (isAttached()) {
            getAssetManager().getReferenceMaintainer().resolveFormula(this);
        }
    }

//    public boolean isDirty() {
//        return getEvaluatedRevision() < getCurrentRevision();
//    }

    protected FormulaElement[] getFormulaElements() {
        return getFormula() == null ? null : getFormula().getElements();
    }

    protected void erase() {
        setFormula(null);
        setValue(Value.BLANK);
    }

    @Override
    protected void afterAttached() {
        getAssetManager().getReferenceMaintainer().resolveFormula(this);
    }

    @Override
    public VariantType valueType() {
        return data.valueType();
    }

    @Override
    public boolean isValid() {
        return data.isValid();
    }

    @Override
    public boolean isBlank() {
        return data.isBlank();
    }

    @Override
    public ErrorCode errorValue() {
        return data.errorValue();
    }

    @Override
    public int intValue() {
        return data.intValue();
    }

    @Override
    public long longValue() {
        return data.longValue();
    }

    @Override
    public float floatValue() {
        return data.floatValue();
    }

    @Override
    public double doubleValue() {
        return data.doubleValue();
    }

    @Override
    public BigDecimal decimalValue() {
        return data.decimalValue();
    }

    @Override
    public boolean booleanValue() {
        return data.booleanValue();
    }

    @Override
    public Date dateValue() {
        return data.dateValue();
    }

    @Override
    public String strValue() {
        return data.strValue();
    }

    @Override
    public List<Variant> listValue() {
        return data.listValue();
    }

    @Override
    public int itemCount() {
        return data.itemCount();
    }

    @Override
    public Variant item(int i) {
        return data.item(i);
    }

    @Override
    public int columnCount() {
        return data.columnCount();
    }

    @Override
    public int rowCount() {
        return data.rowCount();
    }

    @Override
    public int compareTo(Variant o) {
        return data.compareTo(o);
    }
}

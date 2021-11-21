package com.lab111.labwork8;

public class Variable extends BaseAlgebraicExpression {

    private final char representation;

    public Variable(char representation) {
        this.representation = representation;
        ListOfVariablesSingleton.getInstance().register(this);
    }

    @Override
    public String represent() {
        return String.valueOf(representation);
    }

    @Override
    public int hashCode() {
        int result = this.representation;
        result = 31 * result;
        return result;
    }

    @Override
    public boolean equals(Object other){
        if (this == other) return true;
        if (!(other instanceof Variable)) return false;
        final Variable that = (Variable) other;
        return this.representation == that.representation;
    }
}

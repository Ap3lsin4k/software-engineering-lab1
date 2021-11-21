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
}

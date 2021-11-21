package com.lab111.labwork8;

public class Constant extends BaseAlgebraicExpression {
    public int x;

    public Constant(int x) {
        this.x = x;
    }

    @Override
    public String represent() {
        return Integer.toString(this.x);
    }
}

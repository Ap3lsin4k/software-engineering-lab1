package com.lab111.labwork8;

/**
 * class to represent constant in algebraic expression, alternative to variable
 */
public class Constant extends BaseAlgebraicExpression {
    public int x;

    /**
     * initialize a constant of integer type
     * @param x
     */
    public Constant(int x) {
        this.x = x;
    }

    /**
     * convert integer to a string
     * @return string
     */
    @Override
    public String represent() {
        return Integer.toString(this.x);
    }
}

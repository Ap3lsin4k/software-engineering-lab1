package com.lab111.labwork8;

/**
 * represent concrete composite
 */
public class Summation extends Operation {
    public Summation(AlgebraicExpresion... components) {
        super(" + ", components);
    }
}


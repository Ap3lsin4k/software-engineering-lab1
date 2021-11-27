package com.lab111.labwork8;

/**
 * reperesents variable in algebraic expression, as opposed to constant
 */
public class Variable extends BaseAlgebraicExpression {
    /**
     * class to remember name of a variable
     */
    private final char representation;

    /**
     * constructor, and register variable in global singeleton
     * @param representation
     */
    public Variable(char representation) {
        this.representation = representation;
        ListOfVariablesSingleton.getInstance().register(this);
    }

    /**
     * represent name of variable
     * @return name of variable
     */
    @Override
    public String represent() {
        return String.valueOf(representation);
    }

    /**
     * to store Variable in a set
     * @return hash code
     */
    @Override
    public int hashCode() {
        int result = this.representation;
        result = 31 * result;
        return result;
    }

    /**
     * to store Variable in a set
     * @param other
     * @return bool
     */
    @Override
    public boolean equals(Object other){
        if (this == other) return true;
        if (!(other instanceof Variable)) return false;
        final Variable that = (Variable) other;
        return this.representation == that.representation;
    }
}

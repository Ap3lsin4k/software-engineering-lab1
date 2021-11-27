package com.lab111.labwork8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;

/**
 * composite operation for working with variables and constants
 */
public class Operation extends BaseAlgebraicExpression {
    /**
     * list of variables, constants or operations
     */
    protected List<AlgebraicExpresion> children = new ArrayList<>();
    /**
     * to remember sign of operation
     */
    String operation;

    /**
     * @param operation - string representation of operation
     * @param components - components to apply selected operation
     */
    public Operation(String operation, AlgebraicExpresion... components) {
        super();
        this.operation = operation;
        add(components);
    }

    public void add(AlgebraicExpresion component) {
        children.add(component);
    }

    /**
     * add all components
     * @param components
     */
    public void add(AlgebraicExpresion... components) {
        children.addAll(Arrays.asList(components));
    }

    public void remove(AlgebraicExpresion child) {
        children.remove(child);
    }

    public void remove(AlgebraicExpresion... components) {
        children.removeAll(Arrays.asList(components));
    }

    public void clear() {
        children.clear();
    }

    /**
     * join all algebraic expressions with selected sign
     * @return nice string with operations
     */
    @Override
    public String represent() {
        if (children.size() == 0) {
            return "0";
        }
        StringJoiner plusJoiner = new StringJoiner(this.operation);
        for (AlgebraicExpresion child : children) {
            plusJoiner.add(child.represent());
        }
        return String.format("(%s)", plusJoiner.toString());
    }

}

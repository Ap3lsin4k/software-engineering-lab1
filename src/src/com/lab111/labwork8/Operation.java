package com.lab111.labwork8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;

public class Operation extends BaseAlgebraicExpression {
    protected List<AlgebraicExpresion> children = new ArrayList<>();
    String operation;

    public Operation(String operation, AlgebraicExpresion... components) {
        super();
        this.operation = operation;
        add(components);
    }

    public void add(AlgebraicExpresion component) {
        children.add(component);
    }

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

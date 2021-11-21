package com.lab111.labwork8;

public class Demo {
    public static void main(String[] args) {
        AlgebraicExpresion algExpresion = new Multiplication(new Constant(10), new Constant(10));
        AlgebraicExpresion algExpresion2 = new Summation(
                new Variable('x'),
                new Variable('x')
        );
        AlgebraicExpresion algExpresion3 = new Multiplication(
                        new Constant(200),
                        new Variable('x'),
                        new Summation(new Variable('y'), new Constant(2))
                );

        System.out.println("algebraic expression1 = " + algExpresion.represent());
        System.out.println("algebraic expression2 = " + algExpresion2.represent());
        System.out.println("algebraic expression3 = " + algExpresion3.represent());
        System.out.println("Num of variables " + ListOfVariablesSingleton.getInstance().listOfVariables.size());
    }
}
package com.lab111.labwork8;

/**
 * @author Andy
 * @version 4.06
 */
public class Demo {
    /**
     * main function to show how client of algebraic expression
     * @param args
     */
    public static void main(String[] args) {
        AlgebraicExpresion algExpresion = new Multiplication(new Constant(10), new Constant(10));
        AlgebraicExpresion algExpresion2 = new Summation(
                new Variable('x'),
                new Multiplication(new Variable('x'), new Variable('z')),
                new Multiplication(new Constant(2), new Variable('z'))
        );
        AlgebraicExpresion algExpresion3 = new Multiplication(
                        new Constant(200),
                        new Variable('x'),
                        new Summation(new Variable('y'), new Constant(2), new Variable('x')),
                        new Variable('z')
                );

        System.out.println("algebraic expression1 = " + algExpresion.represent());
        System.out.println("algebraic expression2 = " + algExpresion2.represent());
        System.out.println("algebraic expression3 = " + algExpresion3.represent());
        System.out.println("Num of variables " + ListOfVariablesSingleton.getInstance().listOfVariables.size());
        System.out.println("List of variables: ");
        for (BaseAlgebraicExpression var : ListOfVariablesSingleton.getInstance().listOfVariables) {
            System.out.print(var.represent()+"\t");
        }
    }
}
package com.lab111.labwork2;

public class Cl2 extends Cl1 implements If2 {
    /**
     * The Cl2 class aggregates the If3 class by means of the fieldIf3 field
     */
    public If3 fieldIf3;

    @Override
    public void meth1() {
        System.out.println("In Class Cl2 method meth1() from If1");
    }

    @Override
    public void meth2() {
        System.out.println("In Class Cl2 method meth2() from If2");
    }

    @Override
    public void meth3() {
        System.out.println("In Class Cl2 method meth3() from If3");

    }
}

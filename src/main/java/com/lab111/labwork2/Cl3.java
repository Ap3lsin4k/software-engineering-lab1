package com.lab111.labwork2;

public class Cl3 implements If3 {
    /**
     * The Cl3 class aggregates the If1 class by means of the fieldIf1 field
     */
    public If1 fieldIf1;

    @Override
    public void meth1() {
        System.out.println("In Class Cl3 method meth1() from If3");
    }

    @Override
    public void meth3() {
        System.out.println("In Class Cl3 method meth3() from If3");
    }

    /**
     * Designer of class without parameters
     * appropriates the value of null to the fieldCl3 field
     */
    // TODO add constructor
}

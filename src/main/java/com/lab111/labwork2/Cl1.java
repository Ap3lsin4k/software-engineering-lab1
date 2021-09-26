package com.lab111.labwork2;

public class Cl1 implements If1 {
    /** The Cl1 class aggregates the Cl3 class by means of the fieldCl3 field
     */
    public Cl3 fieldCl3;

    @Override
    public void meth1() {
        System.out.println("In Class Cl1 method meth1() from If1");
    }
}

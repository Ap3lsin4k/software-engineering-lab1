package com.lab111.labwork2;

/**
 * @author Andy
 * @version 2.14
 */
public class Cl1 implements If1 {
    /** The Cl1 class aggregates the Cl3 class by means of the fieldCl3 field
     */
    public Cl3 fieldCl3;

    /** Realization of meth1 method from If1 Interface in the Cl1 class
    */
    @Override
    public void meth1() {
        System.out.println("In Class Cl1 method meth1() from If1");
    }

    /**
     * Designer of class without parameters
     * appropriates the value of null to the fieldCl3 field
     */
    public Cl1() {
        this.fieldCl3 = null;
    }
}

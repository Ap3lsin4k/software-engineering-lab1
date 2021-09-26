package com.lab111.labwork2;


/**
 * @author Andy
 * @version 2.14
 */
public class Cl3 implements If3 {
    /**
     * The Cl3 class aggregates the If2 class by means of the fieldIf2 field
     */
    public If2 fieldIf2;


    /** Realization of meth1 method from If1 Interface in the Cl3 class
     */
    @Override
    public void meth1() {
        System.out.println("In Class Cl3 method meth1() from If3");
    }

    /** Realization of meth3 method from If3 Interface in the Cl3 class
     */
    @Override
    public void meth3() {
        System.out.println("In Class Cl3 method meth3() from If3");
    }

    /**
     * Designer of class without parameters
     * appropriates the value of null to the fieldCl2 field
     */
    public Cl3() {
        this.fieldIf2 = null;
    }
}

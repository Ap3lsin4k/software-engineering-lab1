package com.lab111.labwork2;

/**
 * @author Andy
 * @version 2.14
 */
public class Cl2 extends Cl1 implements If2 {
    /**
     * The Cl2 class aggregates the If3 class by means of the fieldIf3 field
     */
    public If3 fieldIf3;

    /** Realization of meth1 method from If1 Interface in the Cl2 class
     */
    @Override
    public void meth1() {
        System.out.println("In Class Cl2 method meth1() from If1");
    }

    /** Realization of meth2 method from If2 Interface in the Cl2 class
     */
    @Override
    public void meth2() {
        System.out.println("In Class Cl2 method meth2() from If2");
    }

    /** Realization of meth3 method from If3 Interface in the Cl2 class
     */
    @Override
    public void meth3() {
        System.out.println("In Class Cl2 method meth3() from If3");

    }

    /**
     * Designer of class without parameters
     * appropriates the value of null to the fieldCl3 field
     */
    public Cl2() {
        this.fieldIf3 = null;
    }
}

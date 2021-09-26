package com.lab111.labwork2;
/**
 * 1st class - test class holds void method main that executes all class methods
 * @author Andy
 * @version 2.14
 */
public class Test14 {
    /**
     * main - Invokes at application startup.
     * @param args - Parameters from command line
     */
    public static void main(String[] args) {
        Cl1 class1 = new Cl1(); class1.meth1();
        Cl2 class2 = new Cl2(); class2.meth1(); class2.meth2(); class2.meth3();
        Cl3 class3 = new Cl3(); class3.meth3();
    }
}


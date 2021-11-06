package com.lab111.labwork5;

import com.lab111.labwork5.ConcreteCollection;
import com.lab111.labwork5.Iterator;

/**
 * client code to show Iterator design pattern
 * @author Andy
 * @version 5.01
 */
// Java program to draw a line in Applet

public class Main {
    public static void main(String[] a) {
        int[] list = { 3, 4, 5, 2, 1, 1, 12, 6, 9, 7, 8, 14 };
        ConcreteCollection l = new ConcreteCollection(list);
        Iterator i = l.createSortedIterator();
        while (i.hasMore()) {
            System.out.println(i.currentItem());
            i.next();
        }
        Iterator i2 = l.createNormalIterator();
        while (i2.hasMore()) {
            System.out.println(i2.currentItem());
            i2.next();
        }
    }
}

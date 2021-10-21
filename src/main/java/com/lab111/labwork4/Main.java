package com.lab111.labwork4;

/**
 * Class to test how our proxy works
 * @author Andy
 * @version 3.04
 */
// Java program to draw a line in Applet

import javax.swing.*;


public class Main {
    public static void main(String[] a)
    {
        JFrame window = WindowSingleton.getInstance().window;
        LinePrimitive line = new LinePrimitive();

        RectangleComposite rect = new RectangleComposite(new PointFromCenter(0, 0), 20, 40);
        rect.draw();


    }

}

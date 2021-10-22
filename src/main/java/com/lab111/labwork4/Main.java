package com.lab111.labwork4;

/**
 * Class to test how our proxy works
 * @author Andy
 * @version 3.04
 */
// Java program to draw a line in Applet

public class Main {
    public static void main(String[] a)
    {
        RectangleComposite rect = new RectangleComposite(new PointFromCenter(0, 0), 100, 100);
        rect.drawFromCenter();
        RectangleComposite rect2 = new RectangleComposite(new PointFromCenter(50, 120), 50, 50);
        rect2.drawFromCenter();

        LinePrimitive line = new LinePrimitive();
        line.drawFromTopLeft(new PointFromTopLeft(0, 0), new PointFromTopLeft(20, 40));
    }

}

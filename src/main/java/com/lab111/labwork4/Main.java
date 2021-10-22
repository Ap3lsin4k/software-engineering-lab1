package com.lab111.labwork4;

/**
 * Class to draw primitix
 * @author Andy
 * @version 4.06
 */
// Java program to draw a line in Applet

public class Main {


    /**
     * @param a
     */
    public static void main(String[] a) {
        RectangleComposite big = new RectangleComposite(new PointFromCenter(0, 0), 100, 100);
        RectangleComposite small = new RectangleComposite(new PointFromCenter(50, 120), 50, 50);

        clientCode(new RectangleComposite[]{big, small});

        LinePrimitive line = new LinePrimitive();
        line.drawFromTopLeft(new PointFromTopLeft(0, 0), new PointFromTopLeft(20, 40));
    }

    /**
     * client Code only works with Target interface. Client draw can draw from center. It doesn't know about LinePrimitive.
     * @param shapes
     */
    public static void clientCode(Target[] shapes) {
        for (Target drawable : shapes) {
            drawable.drawFromCenter();
        }
    }
}

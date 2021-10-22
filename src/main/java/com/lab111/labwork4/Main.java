package com.lab111.labwork4;

import java.util.List;

/**
 * Class to draw primitix
 * @author Andy
 * @version 4.06
 */
// Java program to draw a line in Applet

public class Main {
    public static void main(String[] a)
    {
        RectangleComposite rect = new RectangleComposite(new PointFromCenter(0, 0), 100, 100);
        RectangleComposite rect2 = new RectangleComposite(new PointFromCenter(50, 120), 50, 50);

        clientCode(new RectangleComposite[]{rect, rect2});

        LinePrimitive line = new LinePrimitive();

        line.drawFromTopLeft(new PointFromTopLeft(0, 0), new PointFromTopLeft(20, 40));

    }

    public static void clientCode(Target[] shapes) {
        for (Target drawable : shapes) {
            drawable.drawFromCenter();
        }
    }
}

package com.lab111.labwork4;

import javax.swing.*;
import java.awt.*;

public class LinePrimitive extends JComponent {
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    LinePrimitive() {
        x2 = 30;
        y2 = 100;
    }

    void draw(PointFromTopLeft begin, PointFromTopLeft end) {
        this.x1 = begin.x;
        this.y1 = begin.y;
        this.x2 = end.x;
        this.y2 = end.y;
        WindowSingleton.getInstance().window.getContentPane().add(this);
    }

    public void paint(Graphics g)
    {
        System.out.printf("Drawing a line from %d, %d to %d, %d", x1, y1, x2, y2);
        g.drawLine(x1, y1, x2, y2);
        System.out.printf("Drawing a line from %d to %d", x1, x2);

    }
}
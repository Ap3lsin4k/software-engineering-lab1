package com.lab111.labwork4;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

class Canvas extends JPanel {
    public List<LinePrimitive> lines;

    Canvas() {
        lines = new ArrayList<>();
    }

    /**
     * saves LinePrimitive which will be drawn using coordinate system with origin at left top
     * @param line
     */
    public void draw(LinePrimitive line) {
        lines.add(line);
    }

    /**
     * real implementation to draw lines on the screen in coordinate system with origin at top left
     * @param g
     */
    @Override
    public void paintComponent(Graphics g) {
        for (LinePrimitive line : lines) {
            PointFromTopLeft begin = line.begin;
            PointFromTopLeft end = line.end;
            System.out.printf("Drawing a line from %d, %d to %d, %d\n", begin.x, begin.y, end.x, end.y);
            g.drawLine(begin.x, begin.y, end.x, end.y);
        }
    }
}

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

    public void draw(LinePrimitive line) {
        lines.add(line);
    }

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

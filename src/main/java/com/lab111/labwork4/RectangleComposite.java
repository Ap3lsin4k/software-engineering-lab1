package com.lab111.labwork4;


import java.util.ArrayList;
import java.util.List;

public class RectangleComposite implements Target {
    ArrayList<com.lab111.labwork4.LineAdapter> lines;
    int width;
    int height;

    RectangleComposite(PointFromCenter point, int width, int height) {
        lines = new ArrayList<>();
        PointFromCenter p1 = point;
        p1.y -= height / 2;
        p1.x -= width / 2;

        PointFromCenter p2 = new PointFromCenter(width + p1.x, p1.y);
        PointFromCenter p3 = new PointFromCenter(width + p1.x, height + p1.y);
        PointFromCenter p4 = new PointFromCenter(p1.x, height + p1.y);

        lines.add(new LineAdapter(p1, p2));
        lines.add(new LineAdapter(p2, p3));
        lines.add(new LineAdapter(p3, p4));
        lines.add(new LineAdapter(p4, p1));
    }


    @Override
    public void draw() {
        for (LineAdapter line : lines) {
            line.draw();
        }
    }
}

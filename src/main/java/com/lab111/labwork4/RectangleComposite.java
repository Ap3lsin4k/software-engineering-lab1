package com.lab111.labwork4;


import java.util.ArrayList;

/**
 * Client could draw Rectangle directly, because it implements Target intefrace
 * @author Andy
 * @version 4.06
 */
public class RectangleComposite implements Target {
    ArrayList<LineAdapter> lines;
    int width;
    int height;

    /**
     *
     * @param center position of center rectangle in Cartesian coordinate system
     * @param width of a rectangle
     * @param height of a rectangle
     */
    RectangleComposite(PointFromCenter center, int width, int height) {
        lines = new ArrayList<>();
        PointFromCenter p1 = center;
        p1.y -= height / 2;
        p1.x -= width / 2;

        PointFromCenter p2 = new PointFromCenter(width + p1.x, p1.y);
        PointFromCenter p3 = new PointFromCenter(p2.x, height + p1.y);
        PointFromCenter p4 = new PointFromCenter(p1.x, height + p1.y);

        lines.add(new LineAdapter(p1, p2));
        lines.add(new LineAdapter(p2, p3));
        lines.add(new LineAdapter(p3, p4));
        lines.add(new LineAdapter(p4, p1));
    }


    @Override
    public void drawFromCenter() {
        for (LineAdapter line : lines) {
            line.drawFromCenter();
        }
    }
}

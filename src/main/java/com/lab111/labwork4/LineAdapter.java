package com.lab111.labwork4;

/**
 * This is object adapter as oposed to class adapter. adaptee is an instance variable, but if we had subclassed LinePrimitive, LineAdapater would be called a class adapter.
 */
public class LineAdapter implements Target {
    /**
     * LinePrimitive accepts PointFromTopLeft, but our client wants to work with PointFromCenter, so we wrap LinePrimitive adaptee, and client doesn't notice a difference
     */
    LinePrimitive adaptee;
    PointFromCenter begin, end;

    /**
     * client wants to set the line information in constructor, since LinePrimitive has empty constructor, we save attributes to convert and pass them later
     * @param begin
     * @param end
     */
    LineAdapter(PointFromCenter begin, PointFromCenter end) {
        adaptee = new LinePrimitive();
        this.begin = begin;
        this.end = end;
    }

    /**
     * Client knows only how to call drawFromCenter(), but LineAdapter adapts LinePrimitive, without changing functional of LinePrimitive
     * Knowing the center of the screen is essential to convert from one coordinate system to another.
     * We implicitly use integer division, 200 / 2 = 100 will return an integer.
     */
    public void drawFromCenter() {
        int width = WindowSingleton.getInstance().window.getBounds().width;
        int height = WindowSingleton.getInstance().window.getBounds().height;
        adaptee.drawFromTopLeft(new PointFromTopLeft(begin.x + width/2, -begin.y + height/2), new PointFromTopLeft(end.x + width/2, -end.y + height/2));
    }


}

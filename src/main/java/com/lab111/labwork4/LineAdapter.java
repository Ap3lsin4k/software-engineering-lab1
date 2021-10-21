package com.lab111.labwork4;

public class LineAdapter implements Target {
    LinePrimitive adaptee;
//    private int x1, y1, x2, y2;
    PointFromCenter begin, end;

    LineAdapter(PointFromCenter begin, PointFromCenter end) {
        adaptee = new LinePrimitive();
        this.begin = begin;
        this.end = end;
//        window.getContentPane().add(new LinePrimitive(1,1, 30, 50)
    }

    public void draw() {
        int width = WindowSingleton.getInstance().window.getBounds().width;
        int height = WindowSingleton.getInstance().window.getBounds().height;

        adaptee.draw(new PointFromTopLeft(begin.x + width/2, begin.y += height/2), new PointFromTopLeft(end.x + width/2, end.y += height/2));
    }


}

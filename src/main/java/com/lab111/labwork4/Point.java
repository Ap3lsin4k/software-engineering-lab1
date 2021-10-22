package com.lab111.labwork4;

/**
 * Basic point on a window. To initialize a Point use PointFromCenter or PointFromTopLeft to provide reference system
 * @author Andy
 * @version 4.06
 */
public abstract class Point {
    public int x, y;
    Point(int x, int y) {
        this.x= x;
        this.y = y;
    }
}

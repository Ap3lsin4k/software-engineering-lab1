package com.lab111.labwork4;

import javax.swing.*;
import java.awt.*;


/**
 * LinePrimitive draws line only in coordinate system starting from top left corner of a window, with inverse Y-axis
 * @author Andy
 * @version 4.06
 */
public class LinePrimitive extends JComponent {
    public PointFromTopLeft begin, end;

    /**
     * draws a line on window
     * @param begin of a line
     * @param end of a line
     */
    void drawFromTopLeft(PointFromTopLeft begin, PointFromTopLeft end) {
        this.begin = begin;
        this.end = end;
        WindowSingleton.getInstance().canvas.draw(this);
    }


}
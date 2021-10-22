package com.lab111.labwork4;

import javax.swing.*;
import java.awt.*;

public class LinePrimitive extends JComponent {
    public PointFromTopLeft begin, end;

    void drawFromTopLeft(PointFromTopLeft begin, PointFromTopLeft end) {
        this.begin = begin;
        this.end = end;
        WindowSingleton.getInstance().canvas.draw(this);
    }


}
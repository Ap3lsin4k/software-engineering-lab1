package com.lab111.labwork7.memento.example;

import com.lab111.labwork7.memento.example.editor.Editor;
import com.lab111.labwork7.memento.example.shapes.Circle;
import com.lab111.labwork7.memento.example.shapes.CompoundShape;
import com.lab111.labwork7.memento.example.shapes.Dot;
import com.lab111.labwork7.memento.example.shapes.Rectangle;

import java.awt.*;

/**
 * client code to show Memento design pattern with Composite and Serilization
 * @author Andy
 * @version 7.0
 */
public class Demo {

    /**
     * create three shapes and show editor
     * @param args
     */
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.loadShapes(
                new Circle(10, 10, 10, Color.BLUE),

                new CompoundShape(
                        new Circle(110, 110, 50, Color.RED),
                        new Circle(144, 144, 16, Color.RED),
                        new Dot(160, 160, Color.RED)
                ),

                new CompoundShape(
                        new Rectangle(250, 250, 100, 100, Color.GREEN),
                        new Dot(240, 240, Color.GREEN),
                        new Dot(240, 360, Color.GREEN),
                        new Dot(360, 360, Color.GREEN),
                        new Dot(360, 240, Color.GREEN)
                ),
                new CompoundShape(
                        new Rectangle(100, 250, 100, 80, Color.ORANGE),
                        new Circle(100, 240, 32, Color.ORANGE),
                        new Circle(120, 280, 16, Color.ORANGE),
                        new Circle(190, 270, 8, Color.ORANGE)
                )
        );
    }
}

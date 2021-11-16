package com.lab111.labwork7.memento.example.commands;

import com.lab111.labwork7.memento.example.editor.Editor;
import com.lab111.labwork7.memento.example.shapes.Shape;

import java.awt.*;

/**
 * command to color a shape in the editor (right mouse click)
 */
public class ColorCommand implements Command {
    private Editor editor;
    private Color color;

    public ColorCommand(Editor editor, Color color) {
        this.editor = editor;
        this.color = color;
    }

    @Override
    public String getName() {
        return "Colorize: " + color.toString();
    }

    @Override
    public void execute() {
        for (Shape child : editor.getShapes().getSelected()) {
            child.setColor(color);
        }
    }
}

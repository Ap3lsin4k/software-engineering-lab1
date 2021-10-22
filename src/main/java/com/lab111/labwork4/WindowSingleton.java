package com.lab111.labwork4;

import javax.swing.*;

public class WindowSingleton {
    public final JFrame window;
    private static WindowSingleton instance;
    public Canvas canvas;

    private WindowSingleton() {

        // creating object of JFrame(Window popup)
        window = new JFrame();

        // setting closing operation
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // setting size of the pop window
        window.setBounds(300, 300, 300, 400);
        canvas = new Canvas();

        // set visibility
        window.setVisible(true);
        window.getContentPane().add(canvas);

    }

    /**
     * get window drawer from any place in our code. To draw something use getInstace().canvas.draw(LinePrimitive)
     * @return
     */
    static WindowSingleton getInstance() {
        if (instance == null) {
            instance = new WindowSingleton();
        }
        return instance;
    }

}

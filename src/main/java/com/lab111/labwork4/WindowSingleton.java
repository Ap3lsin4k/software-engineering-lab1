package com.lab111.labwork4;

import javax.swing.*;

public class WindowSingleton {
    public final JFrame window;
    private static WindowSingleton instance;

    private WindowSingleton() {

        // creating object of JFrame(Window popup)
        window = new JFrame();

        // setting closing operation
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // setting size of the pop window
        window.setBounds(100, 100, 200, 200);

        // set visibility
        window.setVisible(true);

    }

    static WindowSingleton getInstance() {
        if (instance == null) {
            instance = new WindowSingleton();
        }
        return instance;
    }
}

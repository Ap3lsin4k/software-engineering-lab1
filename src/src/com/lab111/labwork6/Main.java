package com.lab111.labwork6;

import java.awt.*;

/**
 * client code to show Iterator design pattern
 * @author Andy
 * @version 5.01
 */
// Java program to draw a line in Applet

public class Main {
    public static void main(String[] a) {

        PanelComposite window = new PanelComposite(true);
        PanelComposite menu = new PanelComposite(true);
        PanelComposite imageBox = new PanelComposite(false);
        ButtonLeaf button1 = new ButtonLeaf();
        ButtonLeaf button2 = new ButtonLeaf();
        window.add(imageBox);
        ImageLeaf image1 = new ImageLeaf(imageBox);
        imageBox.add(image1);

        window.add(menu);
        menu.add(button1);
        menu.add(button2);


        image1.mouseHover();
        System.out.println();

        button1.mouseHover();
        System.out.println();

        button2.mouseHover();
        System.out.println();

        menu.mouseHover();
        window.mouseHover();
    }
}

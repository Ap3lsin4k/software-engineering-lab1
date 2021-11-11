package com.lab111.labwork6;

import java.util.ArrayList;
import java.util.List;

/**
 * Class of a button
 */
public class ButtonLeaf extends HandlerComponent {

    /**
     * Constructor that defines the reacting on a mouse
     */
    public ButtonLeaf() {
        super();
        canHandle = true;
    }

    @Override
    protected void handle() {
        System.out.println("Mouse pointer is over the button " + this.toString());
    }

}

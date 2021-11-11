package com.lab111.labwork6;

/**
 * Class of a button
 */
public class ButtonLeaf extends HandlerComponent {

    /**
     * Constructor of a button
     */
    public ButtonLeaf() {
        super();
        canHandle = true;
    }

    @Override
    protected void handle() {
        System.out.println("Mouse is over the button " + this);
    }

}

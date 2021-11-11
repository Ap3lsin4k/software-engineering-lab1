package com.lab111.labwork6;

/**
 * @author Andy
 * @version 6.4
 */
public abstract class HandlerComponent {

    public PanelComposite parent;
    public boolean canHandle;

    /**
     * Method to handle a request or redirect
     */
    public void mouseHover() {
        if (canHandle)
            handle();
        else {
            if (parent != null) {
                System.out.println(this+" cannot handle mouse hover");
                parent.mouseHover();
            }
            else {
                System.out.println(this + " cannot handled. Mouse hover is unhandled.");
            }
        }
    }

    /**
     * Reaction of a certain component
     */
    protected abstract void handle();
}

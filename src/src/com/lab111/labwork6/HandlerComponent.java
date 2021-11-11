package com.lab111.labwork6;

/**
 * @author TRudenko
 * @version 6.4
 */
public abstract class HandlerComponent {

    public PanelComposite parent;
    public boolean canHandle;

    /**
     * Method of reacting on a mouse pointer over the component
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

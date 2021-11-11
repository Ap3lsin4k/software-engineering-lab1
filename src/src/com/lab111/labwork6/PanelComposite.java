/**
 * Main class that represents the work of Chain of Responsibility and Composite design patterns
 */
package com.lab111.labwork6;

/**
 * Abstract class of components of user interface
 */

/**
 * Class of a panel(composite)
 */

import java.util.ArrayList;
import java.util.List;
/**
 * @author TRudenko
 * @version 6.4
 */
public class PanelComposite extends HandlerComponent {

    public List<HandlerComponent> children = new ArrayList<HandlerComponent>();
    /**
     * Constructor that defines the reacting on a mouse pointer and the parent object
     */
    public PanelComposite(boolean canHandle){
        super();
        this.canHandle = canHandle;
    }
    /**
     * Adds a new child object to a panel
     */
    public void add(HandlerComponent child){
        children.add(child);
        child.parent = this;
    }
    /**
     * Removes a child object from a panel
     */
    public void remove(HandlerComponent child) {
        children.remove(child);
        child.parent = null;
    }

    @Override
    protected void handle() {
        if (canHandle) {
            System.out.println(this+" is handling mouse hover.");
        }
        else {
            System.out.println(this +" cannot handle mouse hover.");
            if (parent != null) {
                parent.handle();
            }
        }
    }

}

package com.lab111.labwork6;

import java.util.ArrayList;
import java.util.List;

/**
 * Class of a button
 */
public class ImageLeaf extends HandlerComponent {


    /**
     * Constructor that defines the reacting on a mouse
     */
    public ImageLeaf(PanelComposite parent) {
        super();
        canHandle = false;
        this.parent = parent;
    }

    @Override
    protected void handle() {
        parent.handle();
    }

}

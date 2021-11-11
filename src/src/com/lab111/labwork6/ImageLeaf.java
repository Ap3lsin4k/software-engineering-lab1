package com.lab111.labwork6;

import java.util.ArrayList;
import java.util.List;

/**
 * Class of an image
 */
public class ImageLeaf extends HandlerComponent {


    /**
     * Constructor that defines that image is not interactive, thus cannot handle mouse events
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

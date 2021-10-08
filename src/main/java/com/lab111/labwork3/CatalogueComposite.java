package com.lab111.labwork3;

import java.util.ArrayList;
import java.util.List;

public class CatalogueComposite extends SizedComponent {
    protected List<SizedComponent> children = new ArrayList<>();

    void add(SizedComponent component) {
        children.add(component);
    }

    void remove(SizedComponent component) {
        children.remove(component);
    }

    @Override
    int getSize() {
        int total = 0;
        for (SizedComponent child : children) {
            total += child.getSize();
        }
        return total;
    }
}

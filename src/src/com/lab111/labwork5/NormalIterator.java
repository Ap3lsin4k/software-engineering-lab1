package com.lab111.labwork5;

/**
 * iterator for normal triverse
 *
 * @author Andy
 */
public class NormalIterator implements Iterator {
    /**
     * collection
     */
    private ConcreteCollection concreteCollection;
    /**
     * current index
     */
    private int pivot;

    public NormalIterator(ConcreteCollection concreteCollection) {
        this.concreteCollection = concreteCollection;
        pivot = 0;
    }

    public void first() {
        pivot = 0;
    }

    public void next() {
        if (hasMore())
            pivot++;
    }

    public boolean hasMore() {
        return concreteCollection.length() != pivot;
    }

    public int currentItem() {
        return concreteCollection.get(pivot);
    }
}

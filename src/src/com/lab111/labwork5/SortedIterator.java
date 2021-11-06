package com.lab111.labwork5;

/**
 * iterator in sorted traverse
 *
 * @author Andy
 */
public class SortedIterator implements Iterator {
    /**
     * список
     */
    private ConcreteCollection concreteCollection;
    /**
     *  current position
     */
    private int pos;
    private int pivot;

    public SortedIterator(ConcreteCollection concreteCollection) {
        this.concreteCollection = concreteCollection;
        this.pos = 0;
        first();
    }

    public void next() {
        if (hasMore()) {
            pos++;
            int pmin = concreteCollection.get(pivot);

            for (int i = pivot + 1; i < concreteCollection.length(); i++)
                if (pmin == concreteCollection.get(i)) {
                    pivot = i;
                    return;
                }

            int n = 0;
            int min = 0;
            boolean flag = false;

            for (int i = 0; i < concreteCollection.length(); i++)
                if (i != pivot && pmin < concreteCollection.get(i)) {
                    if (flag) {
                        if (min > concreteCollection.get(i)) {
                            min = concreteCollection.get(i);
                            n = i;
                        }
                    } else {
                        min = concreteCollection.get(i);
                        n = i;
                        flag = true;
                    }
                }
            pivot = n;
        }
    }

    public boolean hasMore() {
        return concreteCollection.length() != pos;
    }

    public int currentItem() {
        return concreteCollection.get(pivot);
    }

    public void first() {
        int n = 0;
        int min = concreteCollection.get(0);
        for (int i = 1; i < concreteCollection.length(); i++)
            if (min > concreteCollection.get(i)) {
                n = i;
                min = concreteCollection.get(n);
            }
        pivot = n;
    }
}

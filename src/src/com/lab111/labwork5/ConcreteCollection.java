package com.lab111.labwork5;


/**
 * Aggregate
 *
 * @author Andy
 *
 */
public class ConcreteCollection {
    /**
     * array of integers
     */
    private int[] array;
    /**
     * size of an array
     */
    private int size;

    /**
     * create normal iterator
     */
    public Iterator createNormalIterator() {
        System.out.println("Creating normal iterator");
        return new NormalIterator(this);
    }

    /**
     * create iterator for sorted list traverse
     */
    public Iterator createSortedIterator() {
        System.out.println("Creating sorted iterator");
        return new SortedIterator(this);
    }

    /**
     * @param numbers
     */
    public ConcreteCollection(int[] numbers) {
        array = numbers;
    }

    /**
     * @return size
     */
    public int length() {
        return array.length;
    }

    /**
     * @param index
     * @return value
     */
    public int get(int index) {
        return array[index];
    }

}

package com.lab111.labwork5;

/**
 * Interface for Iterator
 *
 * @author Andy
 */
public interface Iterator {
    /**
     * next
     */
    void next();

    /**
     * проверяет конец списка
     *
     * @return да, если уже конец
     */
    boolean hasMore();

    /**
     * возвращает значение текущей позиции
     *
     * @return значение
     */
    int currentItem();

    /**
     * перемещает текущую позицию в первую
     */
    void first();
}



/**
 * определяет интерфейс итератора для доступа и обхода елементов
 *
 * @author Ruslan Popenko
 *
 */
public interface Iterator {
    /**
     * переходит на слудующий елемент
     */
    public void next();

    /**
     * проверяет конец списка
     *
     * @return да, если уже конец
     */
    public boolean isDone();

    /**
     * возвращает значение текущей позиции
     *
     * @return значение
     */
    public int currentItem();

    /**
     * перемещает текущую позицию в первую
     */
    public void first();
}
/**
 *
 */


/**
 * итератор для последовательного обхода
 *
 * @author Ruslan Popenko
 *
 */
public class Iterator1 implements Iterator {
    /**
     * список
     */
    private List list;
    /**
     * текущая позиция
     */
    private int pos;

    public Iterator1(List list) {
        this.list = list;
        pos = 0;
    }

    public void first() {
        pos = 0;
    }

    public void next() {
        if (!isDone())
            pos++;
    }

    public boolean isDone() {
        if (pos > list.count() - 1)
            return true;
        else
            return false;
    }

    public int currentItem() {
        return list.getValue(pos);
    }
}
/**
 *
 */


/**
 * итератор для последовательного обхода в упорядоченой структуре
 *
 * @author Ruslan Popenko
 *
 */
public class Iterator2 implements Iterator {
    /**
     * список
     */
    private List list;
    /**
     * текущая позиция
     */
    private int pos;
    private int cpos;

    public Iterator2(List list) {
        this.list = list;
        this.pos = 0;
        minimum();
    }

    public void next() {
        if (!isDone()) {
            pos++;
            int pmin = list.getValue(cpos);
            // проверяем одинаковые значения
            for (int i = cpos + 1; i < list.count(); i++)
                if (pmin == list.getValue(i)) {
                    cpos = i;
                    return;
                }
            int n = 0;
            int min = 0;
            boolean flag = false;
            for (int i = 0; i < list.count(); i++)
                if (i != cpos && pmin < list.getValue(i)) {
                    if (flag) {
                        if (min > list.getValue(i)) {
                            min = list.getValue(i);
                            n = i;
                        }
                    } else {
                        min = list.getValue(i);
                        n = i;
                        flag = true;
                    }
                }
            cpos = n;
        }
    }

    public boolean isDone() {
        if (pos > list.count() - 1)
            return true;
        else
            return false;
    }

    public int currentItem() {
        return list.getValue(cpos);
    }

    public void first() {
        minimum();
    }

    public void minimum() {
        int n = 0;
        int min = list.getValue(n);
        for (int i = 1; i < list.count(); i++)
            if (min > list.getValue(i)) {
                n = i;
                min = list.getValue(n);
            }
        cpos = n;
    }
}
/**
 *
 */


/**
 * агрегат, хранит челые числа создает итераторы
 *
 * @author Ruslan Popenko
 *
 */
public class List {
    /**
     * список целых чисел
     */
    private int[] list;
    /**
     * размер списка
     */
    private int size;

    /**
     * создает итератор для последовательного обхода
     */
    public Iterator createIterator1() {
        return new Iterator1(this);
    }

    /**
     * создает итератор для последовательного обхода в упорядоченом списке
     */
    public Iterator createIterator2() {

        return new Iterator2(this);
    }

    /**
     * конструктор создет список из 1 значения
     *
     * @param value
     *            знячение
     */
    public List(int value) {
        list = new int[1];
        size = 1;
        list[0] = value;
    }

    /**
     * конструктор
     *
     * @param values
     *            список
     */
    public List(int[] values) {
        list = values;
        size = list.length;
    }

    /**
     * возвращяет размер
     *
     * @return размер
     */
    public int count() {
        return size;
    }

    /**
     * добавляет значение
     *
     * @param value
     *            значение
     */
    public void append(int value) {
        size++;
        int[] buf = new int[size];
        buf[size - 1] = value;
        for (int i = 0; i < size - 1; i++)
            buf[i] = list[i];
        list = buf;
    }

    /**
     * удаляет значение
     *
     * @param value
     */
    public void remove(int value) {
        int[] buf;
        for (int i = 0; i < list.length; i++) {
            if (list[i] == value) {
                size--;
            }
        }
        buf = new int[size];
        int j = 0;
        for (int i = 0; i < list.length; i++)
            if (list[i] != value) {
                buf[j] = list[i];
                j++;
            }
        list = buf;
    }

    /**
     * возврящает значение
     *
     * @param pos
     *            позиция
     * @return значение
     */
    public int getValue(int pos) {
        return list[pos];
    }

    /**
     * возвращает список
     *
     * @return список
     */
    public int[] getList() {
        return list;
    }
}
/**
 *
 */


/**
 * @author Ruslan Popenko
 *
 */
public class Lab5 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        int[] list = { 2, 1, 5, 7, 3, 4, 1, 10, 10 };
        List l = new List(list);
        l.append(19);
        l.remove(1);
        Iterator i = l.createIterator2();
        while (!i.isDone()) {
            System.out.println(i.currentItem());
            i.next();
        }
    }
}

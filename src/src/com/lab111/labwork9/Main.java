package com.lab111.labwork9;

/**
 * @author Andy
 * @version 8.6
 *
 * client code for Demo
 */
public class Main {
    private static int universallyUniqueIdentifier = 0;
    public static void main(String[] args) {
        perform(AbstractFactory.getFactory(RepositoryType.DB));
        perform(AbstractFactory.getFactory(RepositoryType.File));
    }

    /**
     * each call generates a new ID
     * @return universally unique identifier
     */
    static int getUniversallyUniqueIdentifier() {
        Main.universallyUniqueIdentifier++;
        return Main.universallyUniqueIdentifier;
    }

    /**
     * perform actions on an abstract factory
     * @param factory
     */
    static void perform(AbstractFactory factory) {
        ValueObject obj = factory.createValueObject();
        Query request = factory.createQuery();
        obj.setID(Main.getUniversallyUniqueIdentifier());
        request.setID(Main.getUniversallyUniqueIdentifier());
        obj.showValue();
        request.showQuery();
    }
}

class FileQuery extends Query {
    /**
     * show request
     */
    public void showQuery() {
        System.out.println(this.getClass().getName()+".id: " + getID());
    }
}
class FileObject extends ValueObject {
    public void showValue() {
        System.out.println(this.getClass().getName()+".id: " + getID());
    }
}
class FileFactory extends AbstractFactory {
    public ValueObject createValueObject() {
        return new FileObject();
    }
    public Query createQuery() {
        return new FileQuery();
    }
}
class DBQuery extends Query {
    public void showQuery() {
        System.out.println(this.getClass().getName()+".id: " + getID());
    }
}
class DBObject extends ValueObject {
    public void showValue() {
        System.out.println(this.getClass().getName()+".id: " + getID());
    }
}
class DataBaseFactory extends AbstractFactory {
    public ValueObject createValueObject() {
        return (new DBObject());
    }
    public Query createQuery() {
        return (new DBQuery());
    }
}
abstract class Query {
    private int id;

    public int getID() {
        return id;
    }

    public void setID(int id) {
        this.id = id;
    }

    public abstract void showQuery();
}

abstract class ValueObject {
    private int id;

    public int getID() {
        return id;
    }
    public void setID(int id) {
        this.id = id;
    }

    public abstract void showValue();
}

enum RepositoryType {
    DB, File
}

abstract class AbstractFactory {
    public static AbstractFactory getFactory(RepositoryType type) {
        if (type == RepositoryType.File) {
            return new FileFactory();
        }
        return new DataBaseFactory();
    }

    public abstract ValueObject createValueObject();
    public abstract Query createQuery();
}
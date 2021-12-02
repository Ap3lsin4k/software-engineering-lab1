package com.lab111.labwork9;

/**
 * @author Andy
 * @version 8.6
 *
 * client code for Demo
 */
public class Main {
    private static int universallyUniqueIdentifier = 0;

    /**
     * provides concrete factory, to create concrete objects
     * @param args
     */
    public static void main(String[] args) {
        execute(AbstractFactory.getFactory(RepositoryType.DB));
        execute(AbstractFactory.getFactory(RepositoryType.File));
        execute(AbstractFactory.getFactory(RepositoryType.WebService));
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
     * @param factory - creates object from factory, given by abstract factory
     */
    static void execute(AbstractFactory factory) {
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
     * show query
     */
    public void showQuery() {
        System.out.println(this.getClass().getName()+".id: " + getID());
    }
}
class FileObject extends ValueObject {
    /**
     * it shows only ID but in the future will show value
     */
    @Override
    public void showValue() {
        System.out.println(this.getClass().getName()+".id: " + getID());
    }
}
class FileFactory extends AbstractFactory {
    /**
     * creates file value object
     * @return
     */
    public ValueObject createValueObject() {
        return new FileObject();
    }

    /**
     * create query for reading/writing to a file
     * @return
     */
    public Query createQuery() {
        return new FileQuery();
    }
}
class DBQuery extends Query {
    /**
     * it prints ID, but in the future will show the query
     */
    public void showQuery() {
        System.out.println(this.getClass().getName()+".id: " + getID());
    }
}
class DBObject extends ValueObject {
    /**
     * TODO show value, and not only ID
     */
    public void showValue() {
        System.out.println(this.getClass().getName()+".id: " + getID());
    }
}
class DataBaseFactory extends AbstractFactory {
    /**
     * create value object
     * @return value object
     */
    public ValueObject createValueObject() {
        return (new DBObject());
    }

    /**
     * create query
     * @return query
     */
    public Query createQuery() {
        return (new DBQuery());
    }
}

class WebServiceFactory extends AbstractFactory {
    /**
     * create value object
     * @return value object
     */
    public ValueObject createValueObject() {
        return (new WebService());
    }

    /**
     * create query
     * @return query
     */
    public Query createQuery() {
        return new WebServiceRequest();
    }
}

/**
 * value query abstract class
 */
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

/**
 * value object abstract class
 */
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

/**
 * client can choose type of repository using this enumerator
 */
enum RepositoryType {
    DB, File, WebService
}

/**
 * client sees this factory, and the exact factory is not known until runtime, which is good
 */
abstract class AbstractFactory {
    /**
     * get factory class based on enum
     * @param type - enum
     * @return factory
     */
    public static AbstractFactory getFactory(RepositoryType type) {
        if (type == RepositoryType.File) {
            return new FileFactory();
        }
        else if (type == RepositoryType.DB) {
            return new DataBaseFactory();
        }
        return new WebServiceFactory();
    }

    public abstract ValueObject createValueObject();
    public abstract Query createQuery();
}
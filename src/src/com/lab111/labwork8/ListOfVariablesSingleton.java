package com.lab111.labwork8;

import java.util.HashSet;
import java.util.Set;

public final class ListOfVariablesSingleton {
    /**
     * The field must be declared volatile so that double check lock would work correctly.
      */
    private static volatile ListOfVariablesSingleton instance;

    Set<Variable> listOfVariables = new HashSet<>();

    private ListOfVariablesSingleton() {}

    /**
     * The approach taken here is called double-checked locking (DCL).
     * It exists to prevent race condition between multiple threads that may
     * attempt to get singleton instance at the same time, creating
     * separate instances as a result.
     * @return itself
     */
    public static ListOfVariablesSingleton getInstance() {
        ListOfVariablesSingleton result = instance;
        if (result != null) {
            return result;
        }
        synchronized(ListOfVariablesSingleton.class) {
            if (instance == null) {
                instance = new ListOfVariablesSingleton();
            }

            return instance;
        }
    }

    /**
     * register a variable from algebraic expression if it is new, or ignore
     * @param variable
     */
    public void register(Variable variable) {
        listOfVariables.add(variable);
    }

    /**
     * keep track of registered variables and remove duplicates
     * @param variable
     * @return
     */
    public boolean hasBeenRegistered(Variable variable) {
        return listOfVariables.contains(variable);
    }
}
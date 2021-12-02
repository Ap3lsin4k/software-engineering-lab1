package com.lab111.labwork9;

public class  WebServiceRequest extends Query {
    @Override
    public void showQuery() {
        System.out.println(this.getClass().getName()+".id: " + getID());
    }
}

package com.lab111.labwork9;

public class WebService extends ValueObject {
    @Override
    public void showValue() {
        System.out.println(this.getClass().getName()+".id: " + getID());
    }
}


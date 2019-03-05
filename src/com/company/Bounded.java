package com.company;

public class Bounded<T extends Number> {

    private T object;
    Bounded(T object)
    {
        this.object=object;
    }
    void showMethod()
    {
        System.out.println("Object Name:"+ this.object.getClass().getName());
    }
    T getObject()
    {
        return this.object;
    }
}

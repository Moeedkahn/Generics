package com.company;

public class Simple <T> {
    private T object;

    Simple(T object)
    {
        this.object=object;
    }
    void showMethod()
    {
        System.out.println("Object Name:"+ this.object.getClass().getName());
    }

    T getObject()
    {
        return object;
    }
}

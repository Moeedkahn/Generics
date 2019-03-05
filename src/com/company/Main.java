package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Bounded<Integer> myIntList=new Bounded<>(20);
        myIntList.showMethod();

        Bounded<Float> myFloatList=new Bounded<>(20.0f);
        myFloatList.showMethod();

        Simple<String> myStringList=new Simple<>("Hello World");
        myStringList.showMethod();
    }
}

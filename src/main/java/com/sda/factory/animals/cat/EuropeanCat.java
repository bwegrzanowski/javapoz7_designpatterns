package com.sda.factory.animals.cat;

public class EuropeanCat implements com.sda.factory.animals.cat.Cat {

    @Override
    public void sleep() {
        System.out.println("sleeping on the roof");
    }

    @Override
    public void eat() {
        System.out.println("eating mouse");
    }
}

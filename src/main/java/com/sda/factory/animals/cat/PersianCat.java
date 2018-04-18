package com.sda.factory.animals.cat;

public class PersianCat implements com.sda.factory.animals.cat.Cat {
    @Override
    public void sleep() {
        System.out.println("sleeping on a sofa");
    }

    @Override
    public void eat() {
        System.out.println("eating beef");
    }
}

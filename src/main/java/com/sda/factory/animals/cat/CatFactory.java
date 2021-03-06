package com.sda.factory.animals.cat;

public class CatFactory {
    public com.sda.factory.animals.cat.Cat createCat(String status) {
        switch (status) {
            case "poor":
                return new EuropeanCat();
            case "rich":
                return new PersianCat();
            default:
                return null;
        }
    }
}

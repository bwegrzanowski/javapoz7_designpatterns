package com.sda.factory.animals.dog;

public class DogFactory {
    public com.sda.factory.animals.dog.Dog creat(String size) {
        if ("small".equals(size)) {
            return new com.sda.factory.animals.dog.Beagle();
        } else if ("big".equals(size)) {
            return new Mastif();
        } else {
            return null;
        }
    }
}

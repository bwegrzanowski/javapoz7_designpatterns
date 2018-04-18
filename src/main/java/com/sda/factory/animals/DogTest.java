package com.sda.factory.animals;

import com.sda.factory.animals.dog.Dog;
import com.sda.factory.animals.dog.DogFactory;

public class DogTest {
    public static void main(String[] args) {
        DogFactory dogFactory = new DogFactory();

        Dog small = dogFactory.creat("small");
        small.fetch();

        Dog big= dogFactory.creat("big");
        big.fetch();

    }
}

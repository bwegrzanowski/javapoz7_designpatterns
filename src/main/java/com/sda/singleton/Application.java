package com.sda.singleton;

public class Application {
    public static void main(String[] args) {
        MyQueue myQueue = MyQueue.instanceOf();
        myQueue.push("Szymon");
        myQueue.push("Anna");
        myQueue.push("Jan");
        Consumer consumer = new Consumer();
        consumer.consume();
    }

}

package com.sda.singleton;

public class Consumer {
    private MyQueue myQueue;

    public Consumer() {
        myQueue = MyQueue.instanceOf();
    }

    public void consume() {
        System.out.println(MyQueue.instanceOf().pop());
        System.out.println(MyQueue.instanceOf().pop());
        System.out.println(MyQueue.instanceOf().pop());
    }
}

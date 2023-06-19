package com.queue.constructor;

public class Main {
    public static void main(String[] args) {
        QueueConstructor myQueue = new QueueConstructor(4);
        System.out.println("EXPECTED OUTPUT:");
        System.out.println("----------------");
        myQueue.getFirst();
        myQueue.getLast();
        myQueue.getLength();
        System.out.println("Queue:");
        myQueue.printQueue();
    }
}

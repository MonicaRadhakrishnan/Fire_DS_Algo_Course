package com.queue.enqueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        QueueEnqueue myQueue = new QueueEnqueue(2);

        System.out.println("Before enqueue():");
        System.out.println(" --------------");
        myQueue.getFirst();
        myQueue.getLast();
        myQueue.getLength();
        System.out.println("Queue:");
        myQueue.printQueue();

        myQueue.enqueue(1);

        System.out.println("After enqueue():");
        System.out.println(" --------------");
        myQueue.getFirst();
        myQueue.getLast();
        myQueue.getLength();
        System.out.println("Queue:");
        myQueue.printQueue();
    }
}

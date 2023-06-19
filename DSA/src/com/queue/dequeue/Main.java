package com.queue.dequeue;

public class Main {
    public static void main(String[] args) {
        QueueDequeue myQueue = new QueueDequeue(2);
        myQueue.enqueue(1);

        // (2) Items - Returns 2 Node
        System.out.println(myQueue.dequeue().value);
        // (1) Item - Returns 1 Node
        System.out.println(myQueue.dequeue().value);
        // (0) Items - Returns null
        System.out.println(myQueue.dequeue());
    }
}

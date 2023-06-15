package com.linkedlist.removeFirst;

public class Main {
    public static void main(String[] args) {
        LinkedListRemoveFirst myLinkedList = new LinkedListRemoveFirst(2);
        myLinkedList.append(1);

        // (2) Items - Returns 2 Node
        System.out.println(myLinkedList.removeFirst().value);
        // (1) Item - Returns 1 Node
        System.out.println(myLinkedList.removeFirst().value);
        // (0) Items - Returns null
        System.out.println(myLinkedList.removeFirst());
    }
}

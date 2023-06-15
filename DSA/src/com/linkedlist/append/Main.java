package com.linkedlist.append;

import com.linkedlist.constructor.LinkedListConstructor;

public class Main {
    public static void main(String[] args) {
        LinkedListAppend linkedList = new LinkedListAppend(1);

        linkedList.makeEmpty();
        linkedList.append(1);
        linkedList.append(2);
        linkedList.getHead();
        linkedList.getTail();
        linkedList.getLength();

        System.out.println("\nLinked List:");
        linkedList.printList();
    }
}
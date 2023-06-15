package com.linkedlist.constructor;

public class Main {
    public static void main(String[] args){
        LinkedListConstructor linkedList = new LinkedListConstructor(4);
        linkedList.getHead();
        linkedList.getTail();
        linkedList.getLength();
        System.out.println("\nLinked List:");
        linkedList.printList();
    }
}

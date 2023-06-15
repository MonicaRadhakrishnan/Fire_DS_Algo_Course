package com.linkedlist.prepend;

public class Main {
    public static void main(String[] args) {
    LinkedListPrepend myList = new LinkedListPrepend(2);
        myList.append(3);
        System.out.println("Before prepend(): ");
        System.out.println("\n-----------------");
        myList.getHead();
        myList.getTail();
        myList.getLength();
        System.out.println("\n Linked List: ");
        myList.printList();
        myList.prepend(1);
        System.out.println("After prepend(): ");
        System.out.println("\n-----------------");
        myList.getHead();
        myList.getTail();
        myList.getLength();
        System.out.println("\n Linked List: ");
        myList.printList();
    }
}

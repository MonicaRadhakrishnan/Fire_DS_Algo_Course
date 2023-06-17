package com.linkedlist.setByIndex;

public class Main {
    public static void main(String[] args) {
        LinkedListSetByIndex myLinkedList = new LinkedListSetByIndex(0);
        myLinkedList.append(1);
        myLinkedList.append(2);
        myLinkedList.append(3);
        System.out.println("Linked List before set():");
        myLinkedList.printList();

        myLinkedList.setByIndex(2, 99);

        System.out.println("\nLinked List after set():");
        myLinkedList.printList();
    }
}

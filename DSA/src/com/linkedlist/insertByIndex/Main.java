package com.linkedlist.insertByIndex;

public class Main {
    public  static void main(String[] args){
        LinkedListInsertByIndex myLinkedList = new LinkedListInsertByIndex(1);
        myLinkedList.append(3);

        System.out.println("LL before insert():");
        myLinkedList.printList();

        myLinkedList.insertByIndex(1, 2);

        System.out.println("\nLL after insert(2) in middle:");
        myLinkedList.printList();

        myLinkedList.insertByIndex(0, 0);

        System.out.println("\nLL after insert(0) at beginning:");
        myLinkedList.printList();

        myLinkedList.insertByIndex(4, 4);

        System.out.println("\nLL after insert(4) at end:");
        myLinkedList.printList();

    }
}

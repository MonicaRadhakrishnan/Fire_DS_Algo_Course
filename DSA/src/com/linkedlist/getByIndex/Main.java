package com.linkedlist.getByIndex;

public class Main {
    public static void main(String[] args) {
        LinkedListGetByIndex myLinkedList = new LinkedListGetByIndex(0);
        myLinkedList.append(1);
        myLinkedList.append(2);
        myLinkedList.append(3);
        System.out.println(myLinkedList.getByIndex(3).value);
    }
}

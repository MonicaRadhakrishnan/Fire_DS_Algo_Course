package com.linkedlist.leetcodeProblems.findMiddleNode;

public class Main {
    public static void main(String[] args) {
        LinkedListFindMiddleNode myLinkedList = new LinkedListFindMiddleNode(1);
        myLinkedList.append(2);
        myLinkedList.append(3);
        myLinkedList.append(4);
        myLinkedList.append(5);
        myLinkedList.append(6);
        myLinkedList.printList();

        System.out.println("Middle Node:");
        System.out.println( myLinkedList.findMiddleNode().value);
    }
}

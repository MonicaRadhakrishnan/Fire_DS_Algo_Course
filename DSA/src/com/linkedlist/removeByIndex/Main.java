package com.linkedlist.removeByIndex;

public class Main {
    public  static void main(String[] args){
        LinkedListRemoveByIndex myLinkedList = new LinkedListRemoveByIndex(1);
        myLinkedList.append(2);
        myLinkedList.append(3);
        myLinkedList.append(4);
        myLinkedList.append(5);

        System.out.println("LL before remove():");
        myLinkedList.printList();

        System.out.println("\nRemoved node:");
        System.out.println(myLinkedList.removeByIndex(2).value);
        System.out.println("LL after remove() in middle:");
        myLinkedList.printList();

        System.out.println("\nRemoved node:");
        System.out.println(myLinkedList.removeByIndex(0).value);
        System.out.println("LL after remove() of first node:");
        myLinkedList.printList();

        System.out.println("\nRemoved node:");
        System.out.println(myLinkedList.removeByIndex(2).value);
        System.out.println("LL after remove() of last node:");
        myLinkedList.printList();
    }
}

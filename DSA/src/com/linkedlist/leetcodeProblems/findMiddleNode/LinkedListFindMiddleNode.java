package com.linkedlist.leetcodeProblems.findMiddleNode;

import com.linkedlist.append.LinkedListAppend;

public class LinkedListFindMiddleNode {
    private Node head;
    private Node tail;
    private int length;

        class Node {
        int value;
        Node next;
        Node(int value){
            this.value = value;
        }
    }
    public LinkedListFindMiddleNode(int value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1 ;
    }

    public void printList(){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }
    public void getHead() {
        if(head != null) {
            System.out.println("Head: " + head.value);
        }else{
            System.out.println("Head is Null ");
        }
    }

    public void getTail() {
        if(tail != null) {
            System.out.println("Tail: " + tail.value);
        }else{
            System.out.println("Tail is Null ");
        }
    }

    public void getLength() {
        if(length > 0) {
            System.out.println("Length: " + length);
        }else{
            System.out.println("Length is 0 ");
        }
    }
    public void append(int value){
        Node newNode1 = new Node(value);
        if(length == 0){
            head = newNode1;
            tail = newNode1;
        }else{
            tail.next = newNode1;
            tail = newNode1;
        }
        length++;
    }
    public void makeEmpty() {
        head = null;
        tail = null;
        length = 0;
    }
    public Node findMiddleNode() {
            Node slow = head;
            Node fast = head;
            while(slow != null && fast.next != null){
                if(fast.next.next != null) {
                    fast = fast.next.next;
                    System.out.println("Fast = " +fast.value);
                }else{
                    fast.next =null;
                    System.out.println("Fast = " +null);
                }

                slow = slow.next;
                System.out.println("Slow = " +slow.value);
            }
         System.out.println("Return Slow = " +slow.value);
            return slow;
    }
}

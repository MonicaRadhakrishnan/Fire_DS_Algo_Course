package com.linkedlist.prepend;

public class LinkedListPrepend {
    private Node head;
    private Node tail;
    private int length;
    class Node{
        int value;
        Node next;
        public Node(int value){
            this.value = value;
        }
    }
    public LinkedListPrepend(int value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }
    public  void printList(){
        Node temp = head;
        while (temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }
    public void getHead() {
        if (head == null) {
            System.out.println("Head: null");
        } else {
            System.out.println("Head: " + head.value);
        }
    }

    public void getTail() {
        if (head == null) {
            System.out.println("Tail: null");
        } else {
            System.out.println("Tail: " + tail.value);
        }
    }

    public void getLength() {
        System.out.println("Length: " + length);
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
    public Node removeLast(){
        if(length == 0) return null;
        Node temp = head;
        Node prev = head;
        while(temp.next != null){
            prev = temp;
            temp = temp.next;
        }
        tail = prev;
        tail.next = null;
        length--;
        if(length == 0){
            head= null;
            tail = null;
        }
        return temp;
    }
    public void prepend(int value){
        Node newNode2 = new Node(value);
        if(length == 0) {
            head = newNode2;
            tail = newNode2;
        }else{
           newNode2.next = head;
            head = newNode2;
        }
        length++;
    }
}

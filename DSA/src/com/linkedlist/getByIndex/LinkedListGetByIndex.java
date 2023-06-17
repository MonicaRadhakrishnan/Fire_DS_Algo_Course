package com.linkedlist.getByIndex;

public class LinkedListGetByIndex {
    private Node head;
    private Node tail;
    private int length;
    class Node {
        int value;
        Node next;
        public Node(int value){
            this.value = value;
        }
    }
    public LinkedListGetByIndex(int value){
        Node newNode1 = new Node(value);
        head = newNode1;
        tail = newNode1;
        length =1;
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
    public void  printList(){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }
    public void append(int value){
        Node newNode2 = new Node(value);
        if(length == 0) {
            head = newNode2;
            tail = newNode2;
        }else{
            tail.next = newNode2;
            tail = newNode2;
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
        tail.next=null;
        length --;
        if(length == 0){
            head = null;
            tail = null;
        }
        return temp;

    }
    public void prepend(int value){
        Node newNode3 = new Node(value);
        if(length == 0){
            head = newNode3;
            tail = newNode3;
        }else{
            newNode3.next = head;
            head = newNode3;
        }
        length++;
    }
    public Node removeFirst(){

        if(length == 0) return null;
        Node temp = head;
        head = head.next;
        temp.next = null;
        length--;
        if(length ==0){
            tail = null;
        }
        return temp;
    }
    public Node getByIndex(int index){

        if(index < 0 || index >= length)  return null;
        Node temp = head;
        for(int i =0;i < index; i++){
            temp = temp.next;
        }
        return temp;
    }
}

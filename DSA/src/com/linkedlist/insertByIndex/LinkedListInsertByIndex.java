package com.linkedlist.insertByIndex;

import com.linkedlist.setByIndex.LinkedListSetByIndex;

public class LinkedListInsertByIndex {
    private Node head;
    private Node tail;
    private int length;
    class Node{
        int value;
        Node next = null;
        public Node(int value){
            this.value = value;
        }
    }
    public LinkedListInsertByIndex(int value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
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
        Node newNode = new Node(value);
        if(length == 0){
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            tail = newNode;
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
        length--;
        if(length == 0){
            head = null;
            tail = null;
        }
        return temp;
    }
    public void prepend(int value){
        Node newNode = new Node(value);
        if(length == 0){
            head = newNode;
            tail = newNode;
        }else{
            newNode.next = head;
            head = newNode;
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
    public boolean setByIndex(int index, int value){
        Node temp = getByIndex(index);
        if(temp != null){
            temp.value = value;
            return true;
        }
        return false;
    }
    public boolean insertByIndex(int index, int value){
        if(index < 0 && index > length) return false;
        if(index == 0){
            prepend(value);
            return true;
        }
        if(index == length){
            append(value);
            return true;
        }
        Node newNode = new Node(value);
        Node temp = getByIndex(index - 1);
        newNode.next = temp.next;
        temp.next = newNode;
        length++;
        return true;
    }
}

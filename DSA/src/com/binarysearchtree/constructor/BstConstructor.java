package com.binarysearchtree.constructor;

public class BstConstructor {
    Node root;
    class Node{
        public int value;
        public Node left;
        public Node right;
        public Node(int value){
            this.value = value;
        }

    }
  /*  public BstConstructor(int value){
        Node newNode = new Node(value);
        root = newNode;
        root = null;
    }*/
}

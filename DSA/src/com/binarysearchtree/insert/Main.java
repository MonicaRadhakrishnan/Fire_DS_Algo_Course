package com.binarysearchtree.insert;

public class Main {
    public static void main(String[] args) {
        BstInsert myBST = new BstInsert();
        myBST.insert(2);
        myBST.insert(1);
        myBST.insert(3);
        /*
            THE LINES ABOVE CREATE THIS TREE:
                         2
                        / \
                       1   3
        */
        // ROOT MUST BE PUBLIC FOR THESE LINES TO WORK
        System.out.println("Root: " + myBST.root.value);
        System.out.println("\nRoot->Left: " + myBST.root.left.value);
        System.out.println("\nRoot->Right: " + myBST.root.right.value);
    }
}

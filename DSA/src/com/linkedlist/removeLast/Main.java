package com.linkedlist.removeLast;

import com.linkedlist.append.LinkedListAppend;

public class Main {
    public static void main(String[] args) {
        LinkedListRemoveLast linkedList = new LinkedListRemoveLast(1);

        linkedList.append(2);
        // (2) Items - Returns 2 Node
        System.out.println(linkedList.removeLast().value);
        // (1) Item - Returns 1 Node
        System.out.println(linkedList.removeLast().value);
        // (0) Items - Returns null
        System.out.println(linkedList.removeLast());
    }

}

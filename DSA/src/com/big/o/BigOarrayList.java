package com.big.o;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BigOarrayList {
    public static void main(String[] args){
        List<Integer> myList = new ArrayList<Integer>(Arrays.asList(3,5,7,9,11));
        myList.add(13);
        System.out.println("Element Added " +myList);
        myList.remove(5);
        System.out.println("Element Removed " +myList);
        myList.add(1,0);
        System.out.println("Element Removed " +myList);
        myList.remove(1);
        System.out.println("Element Removed " +myList);
    }
}

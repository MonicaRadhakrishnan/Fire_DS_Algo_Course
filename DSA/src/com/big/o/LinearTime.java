package com.big.o;

public class LinearTime {
//O(n) - LinearTime Example
    public  static void printItems(int n){
        for(int i =0; i< n ;i++){
            System.out.println(i);
        }
    }
    public static void main(String[] args){
        printItems(10);
    }
}

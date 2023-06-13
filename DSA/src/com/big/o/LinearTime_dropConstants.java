package com.big.o;

public class LinearTime_dropConstants {
//O(2n) or O(3n)... O(Xn) = Drop Constants and its O(n) - Linear Time Example
    public  static void printItems(int n){
        for(int i =0; i< n ;i++){
            System.out.println(i);
        }
        for(int j =0; j< n ;j++){
            System.out.println(j);
        }
    }
    public static void main(String[] args){

        printItems(10);
    }
}

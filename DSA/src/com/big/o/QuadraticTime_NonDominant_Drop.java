package com.big.o;

public class QuadraticTime_NonDominant_Drop {
    /*O(n2+ n ) = O(n2) ,where + n is dropped
    If n =100, (n2) = 1000 and n = 100
    Here (n2) is Dominant and n is Non – Dominant*/
    public  static void printItems(int n){
        for(int i =0; i< n ;i++){
            for(int j =0; j< n ;j++){
                System.out.println(i + " " +j);
            }
        }
        for( int k = 0; k < n ; k++){
            System.out.println(k);
        }
    }
    public static void main(String[] args){
        printItems(10);
    }
}

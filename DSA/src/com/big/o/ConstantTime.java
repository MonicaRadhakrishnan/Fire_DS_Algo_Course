package com.big.o;

public class ConstantTime {
  /*
   n + n  No of Operations is only one, so O(1)
    As n grows, No of Operations always stays constant*/


    public  static void printItems(int n){
        System.out.println(n+n);
    }
    public static void main(String[] args){

        printItems(10);
    }
}

package com.big.o;

public class DiffTermInputs1 {
    public  static void printItems(int a, int b){
        for(int i =0; i< a ;i++){
            System.out.println(i);
        }
        for(int j =0; j< b ;j++){
            System.out.println(j);
        }
    }
    public static void main(String[] args){

        printItems(5,4);
    }
}

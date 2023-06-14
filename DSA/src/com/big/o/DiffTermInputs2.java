package com.big.o;

public class DiffTermInputs2 {
    public  static void printItems(int a, int b){
        for(int i =0; i< a ;i++){
            for(int j =0; j< b ;j++){
                System.out.println(i + " " +j);
            }
        }
    }
    public static void main(String[] args){

        printItems(5,4);
    }
}

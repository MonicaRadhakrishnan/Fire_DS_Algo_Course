package com.pointers;
import java.sql.SQLOutput;
public class WithoutPointers {
    public static void main(String[] args){
        int num1 = 11;
        int num2 = num1;
        num1 = 22;
        System.out.println(num1);
        System.out.println(num2);
    }
}

package com.classes;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Cookie cookieOne = new Cookie("Yellow");
        Cookie cookieTwo = new Cookie("Red");
        cookieOne.setColor("Pink");
        System.out.println(cookieOne.getColor());
        System.out.println(cookieTwo.getColor());
    }
}
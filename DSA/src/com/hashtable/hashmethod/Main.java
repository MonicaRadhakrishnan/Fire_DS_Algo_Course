package com.hashtable.hashmethod;

public class Main {
    public static void main(String[] args) {

        HtHashMethod myHashTable = new HtHashMethod();

        myHashTable.set("nails", 100);
        myHashTable.set("tile", 50);
        myHashTable.set("lumber", 80);
        myHashTable.set("bolts", 200);
        myHashTable.set("screws", 140);

        myHashTable.printTable();
    }
}

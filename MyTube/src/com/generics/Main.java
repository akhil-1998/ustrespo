package com.generics;

public class Main {
    public static void main(String[] args) {
        var list = new List();
        list.add(1);
        list.add(2);
        list.add(3);
        list.getCount(2);
        new GenericList<Integer>().add(1);
        //var list = new GenericList<User>();



    }
}

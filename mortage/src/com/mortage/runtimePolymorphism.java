package com.mortage;

public class runtimePolymorphism {
    public static void main(String[] args) {
        RunTimePoly obj = new RunTimePoly();
        obj.display();
        RunTimePolySub obj2 = new RunTimePolySub();
        obj2.display();
    }
}

class RunTimePoly {
    public void display() {

        System.out.println("Runtime Polymorphism");
    }
}

class RunTimePolySub extends RunTimePoly {

    public void display() {

        System.out.println("Runtime Polymorphism");
    }
}


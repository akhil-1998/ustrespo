package com.mortage;

public class compiletimePoly {
    public static void main(String[] args) {
        CompileTime obj = new CompileTime();
        obj.display();
        obj.display("Polymorphism");
    }
}

class CompileTime {
    void display() {
        System.out.println("Compile time Polymorphism");
    }

    void display(String value) {
        System.out.println("Compile time " + value);
    }
}
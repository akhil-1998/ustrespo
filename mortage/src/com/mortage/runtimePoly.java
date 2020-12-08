package com.mortage;

class CarMileage{
    public void mileage(){
        System.out.println("Good Mileage");
    }
    class Amaze extends CarMileage{
        public void mileage(){
            System.out.println("Has Mileage of 20kmpl");
        }
    }
}

public class runtimePoly {
    public static void main(String[] args) {
        CarMileage carMileage = new CarMileage();
        CarMileage.Amaze amaze = carMileage.new Amaze();
        amaze.mileage();

    }
}

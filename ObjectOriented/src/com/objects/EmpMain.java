package com.objects;

public class EmpMain {

    public static void main(String[] args) {
        var employee = new Employee(60000, 200);
        var employee2 =  new Employee(5000);
        Employee.setNumberOfEmployees();


        int wage = employee.calculateWage(20);
        System.out.println(wage);
    }
}

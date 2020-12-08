package com.objects;

public class Employee {
    private int baseSalary;
    private int hourlyWage;
    //public int extraHours;
    public static int numberOfEmployees;

    public Employee(int baseSalary, int hourlyWage){
        setBaseSalary(baseSalary);
        setHourlyWage(hourlyWage);
        numberOfEmployees ++;
    }
    public static void setNumberOfEmployees(){
        System.out.println(numberOfEmployees);
    }

    public Employee(int baseSalary){
        this(baseSalary, 0);
    }

    public int calculateWage(int extraHours){

        return baseSalary + (extraHours * hourlyWage);

    }
    public int calculateWage(){

        return calculateWage(0);

    }

    public void setBaseSalary(int baseSalary){
        if(baseSalary <= 0)
            throw new IllegalArgumentException("Salary cannot be 0 or less");
        this.baseSalary = baseSalary;
    }

    public int getBaseSalary(){
        return baseSalary;
    }

    public int getHourlyWage() {
        return hourlyWage;
    }

    private void setHourlyWage(int hourlyWage) {
        if(baseSalary <= 0)
            throw new IllegalArgumentException("Hourly wage cannot be 0 or less");
        this.hourlyWage = hourlyWage;
    }
}

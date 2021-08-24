package com.company;

public class Employee {
    String firstName;
    String lastName;
    double salary;
    int id;
    static int count=0;

    Employee(String firstName,String lastName,double salary){
        this.firstName=firstName;
        this.lastName=lastName;
        this.salary=salary;
        id=count++;
    }

    @Override
    public String toString() {
        return "{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                ", id=" + id +
                '}';
    }
}

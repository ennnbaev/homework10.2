package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Homework {

    public static void main(String[] args) {
        List<Employee> collection=new ArrayList<>();
        collection.add(new Employee("Danil","Enbaev",55000));
        collection.add(new Employee("Liza","Savchenko",9000));
        collection.add(new Employee("Kirill","Kondrat",18500.2));
        collection.add(new Employee("Denis","Maksymenko",18500.1));
        System.out.println(collection);
        EmployeeComparator comparator=new EmployeeComparator();
        Collections.sort(collection,comparator);
        System.out.println(collection);
    }
}

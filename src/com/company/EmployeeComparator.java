package com.company;

import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
      if(o1.salary- o2.salary<=0.5&&o1.salary- o2.salary>0){
          return 1;
        }
      else if(o1.salary- o2.salary>=-0.5&&o1.salary- o2.salary<0){
          return -1;
      }
      else{
        return (int)(o1.salary- o2.salary) ;
    }}
}

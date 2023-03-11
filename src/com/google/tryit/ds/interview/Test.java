package com.google.tryit.ds.interview;

import java.util.ArrayList;
import java.util.List;
public class Test {

    public static void main(String[] args) {
        Employee e = new Employee(1,"ravi","coimbatore");
        Employee e1 = new Employee(1,"ravi","coimbatore");
        Employee e2 = new Employee(1,"ravi","coimbatore");
        List<Employee> employeeLIst = new ArrayList<Employee>();
        employeeLIst.add(e);
        employeeLIst.add(e1);
        employeeLIst.add(e2);
        System.out.println(employeeLIst.size());
    }
}

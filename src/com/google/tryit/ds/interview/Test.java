package com.google.tryit.ds.interview;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {
        Employee e = new Employee(1,"ravi","coimbatore");
        Employee e1 = new Employee(1,"ravi","coimbatore");
        Employee e2 = new Employee(1,"ravi","coimbatore");
        List<Employee> employeeList = new ArrayList<Employee>();

        employeeList.add(e);
        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.stream().forEach((c) -> System.out.println("employeeList->"+c.age+":"+c.address+":"+c.name));
        List<Employee> ditinctemployeeList =employeeList.stream().distinct().collect(Collectors.toList());
        ditinctemployeeList.stream().forEach((c) -> System.out.println("ditinctemployeeList->"+c.age+":"+c.address+":"+c.name));
    }
}

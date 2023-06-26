package com.google.tryit.ds.interview;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {
        Employee e = new Employee(1,"ravi","coimbatore");
        Employee e1 = new Employee(1,"ravi","coimbatore");
        Employee e2 = new Employee(1,"ravi","coimbatore");
        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(e);
        employeeList.add(e1);
        employeeList.add(e2);
        System.out.println("SIze - "+employeeList.size());
        employeeList.stream().forEach((c) -> System.out.println("employeeList->"+c.age+":"+c.address+":"+c.name));
        List<Employee> ditinctemployeeList =employeeList.stream().distinct().collect(Collectors.toList());
        ditinctemployeeList.stream().forEach((c) -> System.out.println("ditinctemployeeList->"+c.age+":"+c.address+":"+c.name));

        Set<Employee> employeeSet = new HashSet<Employee>();

        employeeSet.add(e);
        System.out.println("SIze - "+employeeSet.size());
        employeeSet.add(e1);
        System.out.println("SIze - "+employeeSet.size());
        employeeSet.add(e2);
        System.out.println("SIze - "+employeeSet.size());
        employeeSet.stream().forEach((c) -> System.out.println("employeeSet->"+c.age+":"+c.address+":"+c.name));
        Set<Employee> ditinctemployeeSet =employeeSet.stream().distinct().collect(Collectors.toSet());
        ditinctemployeeSet.stream().forEach((c) -> System.out.println("ditinctemployeeSet->"+c.age+":"+c.address+":"+c.name));
    }
}

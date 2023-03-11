package com.google.tryit.ds.interview;

import java.util.Objects;

public class Employee {

    int age;
    String name;
    String address;

    public Employee(int age, String name, String address) {
        this.age = age;
        this.name = name;
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age && name.equals(employee.name) && address.equals(employee.address);
    }

    @Override
    public int hashCode() {
        return (int) age * name.hashCode() * address.hashCode();
    }
}

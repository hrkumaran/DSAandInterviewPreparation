package com.google.tryit.ds.interview;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class SortPersons {

    // Online Java Compiler
// Use this editor to write, compile and run your Java code online
//Create a class Person with 2 attributes
//- name(string) and age(int).
//Create 5 objects of Person - store in an array.
//Sort the array by name of Persons.

        public static void main(String[] args) {

            int size=5;
            Person[] person = { new Person("Emp1",50),new Person("Emp2",51),
                    new Person("Emp3",52),new Person("Emp4",53),
                    new Person("Emp5",54) };

            for(int i=0;i<size;i++)
            {
                Person p = person[i];
                System.out.println("Results="+p.getName()+" Age="+p.getAge());
            }

            Arrays.sort(person,Comparator.comparing(Person::getName));
            for(int i=0;i<size;i++)
            {
                Person p = person[i];
                System.out.println("Results="+p.getName()+" Age="+p.getAge());
            }


        }
    }
    class Person
    {
        private String name;
        private int age;

        public Person(String name , int age)
        {
            this.name = name;
            this.age = age;
        }

        public String getName()
        {
            return this.name;
        }

        public int getAge()
        {
            return this.age;
        }

   /* public int hashcode(String name)
    {
       return this.name.hashcode()==name.hashcode();
    }

    public Object equals(String name)
    {
       return  this.name.equals(name);
    }*/
    }
package org.example.IO.MAP;

import java.util.TreeSet;

class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person otherPerson) {

        return Integer.compare(this.age, otherPerson.age);
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
}

public class PersonSort {
    public static void main(String[] args) {

        TreeSet<Person> personSet = new TreeSet<>();


        personSet.add(new Person("Sai", 39));
        personSet.add(new Person("Antje", 44));
        personSet.add(new Person("Naomi", 35));


        System.out.println("Sorted Person Objects:");
        for (Person person : personSet) {
            System.out.println(person);
        }
    }
}


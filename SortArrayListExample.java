/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chella;

/**
 *
 * @author hp
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Person p) {
        return this.age - p.age;
    }

    @Override
    public String toString() {
        return name + "(" + age + ")";
    }
}

class PersonComparator implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        return p1.getName().compareTo(p2.getName());
    }
}

public class SortArrayListExample {
    public static void main(String[] args) {
        // Create an ArrayList of Person objects
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person("John", 30));
        list.add(new Person("Mary", 25));
        list.add(new Person("Bob", 40));

        // Sort the list using the Comparable interface
        Collections.sort(list);
        System.out.println("Sorted by age (Comparable): " + list);

        // Sort the list using the Comparator interface
        Comparator<Person> comparator = new PersonComparator();
        Collections.sort(list, comparator);
        System.out.println("Sorted by name (Comparator): " + list);
    }
}

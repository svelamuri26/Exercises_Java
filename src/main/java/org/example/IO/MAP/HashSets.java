package org.example.IO.MAP;

import java.util.HashSet;

public class HashSets {
    public static void main(String[] args) {

        HashSet<Integer> setA = new HashSet<>();
        HashSet<Integer> setB = new HashSet<>();


        setA.add(1);
        setA.add(2);
        setA.add(3);
        setA.add(4);

        setB.add(5);
        setB.add(6);
        setB.add(7);
        setB.add(8);


        HashSet<Integer> unionSet = new HashSet<>(setA);
        unionSet.addAll(setB);


        HashSet<Integer> intersectionSet = new HashSet<>(setA);
        intersectionSet.retainAll(setB);


        HashSet<Integer> differenceSet = new HashSet<>(setA);
        differenceSet.removeAll(setB);


        System.out.println("setA: " + setA);
        System.out.println("setB: " + setB);
        System.out.println("Union of setA and setB: " + unionSet);
        System.out.println("Intersection of setA and setB: " + intersectionSet);
        System.out.println("Difference of setA and setB: " + differenceSet);
    }
}

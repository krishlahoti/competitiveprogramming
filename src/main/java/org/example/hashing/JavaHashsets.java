package org.example.hashing;

import java.util.HashSet;

public class JavaHashsets {

    public static void main(String[] args) {

        HashSet<Integer> intHashSet  = new HashSet<>();

        intHashSet.add(1);
        intHashSet.add(2);
        intHashSet.add(3);
        intHashSet.add(4);

        System.out.println(intHashSet.size());

        HashSet<Integer> clone = (HashSet<Integer>)intHashSet.clone();

        intHashSet.add(9);

        System.out.println(clone.size());
        System.out.println(intHashSet.size());


    }
}

package org.CollectionsFramework;


import java.util.*;

public class SetExample {
    public static void main(String[] args) {


        java.util.Set<String> fruits = new HashSet<>();
        fruits.add("яблоко");
        fruits.add("ананас");
        fruits.add("вишня");
        fruits.add("яблоко");
        System.out.println(fruits);

        java.util.Set<String> fruits2 = new LinkedHashSet<>();
        fruits2.add("яблоко");
        fruits2.add("ананас");
        fruits2.add("вишня");
        fruits2.add("яблоко");
        System.out.println(fruits2);

        java.util.Set<String> fruits3 = new TreeSet<>();
        fruits3.add("яблоко");
        fruits3.add("ананас");
        fruits3.add("вишня");
        fruits3.add("яблоко");
        System.out.println(fruits3);
    }
}

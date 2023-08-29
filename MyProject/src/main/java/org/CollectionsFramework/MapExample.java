package org.CollectionsFramework;


import java.util.*;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> fruits = new HashMap<>();

        fruits.put("яблоко", 6);
        fruits.put("ананас", 5);
        fruits.put("вишня",2);
        fruits.put("яблоко",7);
        System.out.println(fruits);

        Map<String, Integer> fruits2 = new LinkedHashMap<>();
        fruits2.putIfAbsent("яблоко", 8);
        fruits2.putIfAbsent("ананас",5);
        fruits2.putIfAbsent("вишня",7);
        fruits2.putIfAbsent("яблоко",9);
        System.out.println(fruits2);

        Map<String, Integer> fruits3 = new TreeMap<>();
        fruits3.putIfAbsent("яблоко", 8);
        fruits3.putIfAbsent("ананас",5);
        fruits3.putIfAbsent("вишня",7);
        fruits3.putIfAbsent("яблоко",9);
        System.out.println(fruits3);
    }
}

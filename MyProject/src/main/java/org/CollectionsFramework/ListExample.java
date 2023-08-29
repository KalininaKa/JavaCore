package org.CollectionsFramework;

import java.util.*;

public class ListExample {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("яблоко");
        fruits.add("ананас");
        fruits.add("вишня");
        fruits.add("яблоко");
        System.out.println(fruits);
        fruits.add(2, "Вишня");
        fruits.add("яблоко");
        System.out.println(fruits);
    }
}

package org.example;

import java.util.ArrayList;

public class Wrapper {
    public static void main(String[] args) {
        Integer i1 = 123;
        Integer i2 = 123;
        System.out.println(i1==i2);

        Boolean b = true;
        Character c = '@';
        Integer a = 1234;
        Double d = 3.14;
        String s= "str";

        Integer i = 5;
        Integer ii = new Integer(i);
        Integer jj = i;
        int j = jj.intValue();
        int k = jj;

        ArrayList<Integer> Values = new ArrayList<Integer>();
        Values.add(5);
        Values.add(7);
        Values.add(Integer.valueOf("12"));
        System.out.println(Values);
    }

}

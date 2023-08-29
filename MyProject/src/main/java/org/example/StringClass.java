package org.example;

public class StringClass {
    public static void main(String[] args) {
     String str1 = new String("JAva");
     String str2 = "Java";

     System.out.println(str1.charAt(0));
     System.out.println(str1.charAt(1));
     System.out.println(str1.charAt(2));
     System.out.println(str1.charAt(3));

     System.out.println(str1.codePointAt(1));
     System.out.println(str2.length());
     System.out.println(str1.compareTo(str2));
     System.out.println(str2.contains(str1));
     System.out.println(str1.compareToIgnoreCase(str2));
     System.out.println(str1.concat(str2));
     System.out.println(str1.equals(str2));
    }
}

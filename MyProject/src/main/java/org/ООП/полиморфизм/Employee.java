package org.ООП.полиморфизм;
/*Класс Employee наследуется от класса Person с помощью ключевого слова extends.
 Далее, класс-наследник Employee переопределяет поведение метода walk() класса Person.*/
class Employee extends Person {

    void walk() {
        System.out.println("Running Fast...");
    }


    public static void main(String[] arg) {
        Person p = new Employee();
        p.walk();
    }
}

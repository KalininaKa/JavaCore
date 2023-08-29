package org.Сериализация;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject2 {
    public static void main(String[] args) {
        Person person1 = new Person(1,"Bob");
        Person person2 = new Person(2,"Mike");
        Person person3 = new Person(2,"Rob");
        Person[] peoples = {person1, person2, person3};

        try {
            FileOutputStream fos = new FileOutputStream("people.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeInt(peoples.length);
            for (Person person : peoples){
                oos.writeObject(person);
            }
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

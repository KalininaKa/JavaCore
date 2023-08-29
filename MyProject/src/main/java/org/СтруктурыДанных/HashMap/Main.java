package org.СтруктурыДанных.HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        HashMap<Integer, String> passportsAndNames = new HashMap<>();


        passportsAndNames.put(212133, "Лидия Аркадьевна Бубликова");
        passportsAndNames.put(162348, "Иван Михайлович Серебряков");
        passportsAndNames.put(8082771, "Дональд Джон Трамп");
        System.out.println(passportsAndNames);

        passportsAndNames.put(162348, "Виктор Михайлович Стычкин");//повторный ключ

        System.out.println(passportsAndNames);

        String lidiaName = passportsAndNames.get(212133);
        System.out.println(lidiaName);

        passportsAndNames.remove(162348);
        System.out.println(passportsAndNames);

        System.out.println(passportsAndNames.containsKey(11111));
        System.out.println(passportsAndNames.containsValue("Дональд Джон Трамп"));

        Set<Integer> keys = passportsAndNames.keySet();
        System.out.println("Ключи: " + keys);

        ArrayList<String> values = new ArrayList<>(passportsAndNames.values());
        System.out.println("Значения: " + values);

        System.out.println(passportsAndNames.size());
        passportsAndNames.clear();
        System.out.println(passportsAndNames);

        HashMap<Integer, String> passportsAndNames2 = new HashMap<>();

        passportsAndNames.put(212133, "Лидия Аркадьевна Бубликова");
        passportsAndNames.put(162348, "Иван Михайлович Серебряков");
        passportsAndNames.put(8082771, "Дональд Джон Трамп");

        passportsAndNames2.put(917352, "Алексей Андреевич Ермаков");
        passportsAndNames2.put(925648, "Максим Олегович Архаров");


        passportsAndNames.putAll(passportsAndNames2);
        System.out.println(passportsAndNames);

    }
}

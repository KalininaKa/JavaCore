package org.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {
    public static void main(String[] args) {
        String s = "Hallo, я строка для поиска регулярных выражений. 2020 3лдулыдзв олвр  khjрл оПвалыьчВЫСывс 2023";
        String res = s.replaceFirst("\\d{4}", "2030");
        System.out.println(res);

        String s2 = "1999";
        Pattern p = Pattern.compile("\\d\\d\\d\\d");
        Matcher m = p.matcher(s2);
        System.out.println(m.matches());

        String s3 = "kkaa@mail.ru";
        Pattern p2 = Pattern.compile("\\w{3,}@\\w+.\\w{2,3}");
        Matcher m2 = p2.matcher(s3);
        System.out.println(m2.matches());

        Pattern p3 = Pattern.compile("\\d{4}");
        Matcher m3 = p3.matcher(s);
        while (m3.find()) {
            System.out.println(m3.group());
        }


    }
}

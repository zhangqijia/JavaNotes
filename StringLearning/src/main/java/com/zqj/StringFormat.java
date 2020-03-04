package com.zqj;

import java.util.Calendar;

public class StringFormat {

    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        String s = String.format("Duke's Birthday: %1$10tm %1$10te,%1$-10tY,  %2$c %n %3$d", c, 'a', 100);
        System.out.println(s);
    }
}

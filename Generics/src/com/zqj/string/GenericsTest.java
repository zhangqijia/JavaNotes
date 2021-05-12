package com.zqj.string;

import java.util.ArrayList;
import java.util.List;

class GenericsTest {

    public static <T> T getValueFromList(List<? extends T> anyList) {
        T t = anyList.get(0);
        return t;
    }

    public static void main(String[] args) {
        ArrayList<Long> list = new ArrayList<>(1);
        list.add(1L);
        Long value = getValueFromList(list);
        System.out.println(value);
    }

}
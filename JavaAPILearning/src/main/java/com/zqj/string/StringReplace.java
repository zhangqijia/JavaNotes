package com.zqj.string;

/**
 * Hello world!
 */
public class StringReplace {
    public static void main(String[] args) {
        String origin = "aabbccdd,aaeeffgg,hhjjkk";
        String a = origin.replace('a', '.');
        String b = origin.replace("a", "");
        String c = origin.replaceAll("(\\w{2})[^,]*(\\w{2})", "$1****$2");
        String d = origin.replaceFirst("(\\w{2})[^,]*(\\w{2})", "$1****$2");

        System.out.println("replace char: \t" + a);
        System.out.println("replace charSequence: \t" + b);
        System.out.println("replace regex: \t" + c);
        System.out.println("replace regexFirst: \t" + d);

    }
}

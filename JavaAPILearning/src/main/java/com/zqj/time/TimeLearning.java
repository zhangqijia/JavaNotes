package com.zqj.time;


import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.util.Locale;

/**
 * @author Qijia
 * @className Java8TimeTest
 * @description TODO
 * @date 2021/3/30
 */
public class TimeLearning {

    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss", Locale.CHINESE);
        LocalDateTime now = LocalDateTime.now();
        String format = formatter.format(now);
        System.out.println(format);
        now.with(TemporalAdjusters.lastDayOfMonth());
        System.out.println(format);
        ZonedDateTime zonedDateTime = now.atZone(ZoneId.systemDefault());
    }
}

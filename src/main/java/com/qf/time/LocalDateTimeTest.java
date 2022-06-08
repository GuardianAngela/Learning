package com.qf.time;

import java.time.*;
import java.time.format.DateTimeFormatter;

/**
 * @Description: 日期时间
 * @Author: GuardianAngel
 * @Date: 2022/5/27
 * @Version: 1.0
 */
public class LocalDateTimeTest {

    public static void main(String[] args) {
        //当前时间
        LocalDateTime localDateTime = LocalDateTime.now().withNano(0);
        System.out.println("当前时间: " + localDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));

        //自定义日期时间
        LocalDateTime localDateTime2 = LocalDateTime.of(2020, 05, 20, 05, 20, 20);
        System.out.println("当前时间: " + localDateTime2.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));

        //通过Period类处理日期
        LocalDate localDate = LocalDate.of(2020, 05, 20);
        LocalDate localDate2 = LocalDate.of(2020, 05, 20);
        Period period = Period.between(localDate, localDate2);
        System.out.println(period.getDays());

        //通过Duration处理时间
        LocalTime localTime = LocalTime.of(05, 20, 00);
        LocalTime localTime2 = LocalTime.of(05, 20, 00);
        Duration duration = Duration.between(localTime, localTime2);
        System.out.println(duration.getSeconds());
    }
}

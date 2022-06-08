package com.qf.time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/**
 * @Description: 日期
 * @Author: GuardianAngel
 * @Date: 2022/5/27
 * @Version: 1.0
 */
public class LocalDateTest {

    public static void main(String[] args) {
        //获取当前日期
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        //获取日期中的年月日
        int year = localDate.getYear();
        int month = localDate.getMonthValue();
        int day = localDate.getDayOfMonth();
        System.out.println("年:" + year + " 月:" + month + " 日:" + day);

        //日期格式化
        String date = localDate.format(DateTimeFormatter.ofPattern("yyyy年MM月dd日"));
        System.out.println(date);

        //是否为瑞年
        System.out.println(localDate.isLeapYear() ? "瑞年" : "不是瑞年");

        //获取当年月份的天数
        System.out.println("当年月有:" + localDate.lengthOfMonth() + "天");

        //自定义日期方式一
        LocalDate localDate2 = LocalDate.parse("2020-05-20");
        //自定义日期方式二
        LocalDate localDate3 = LocalDate.of(2020, 05, 20);
        //判断日期是否相等
        System.out.println(localDate2.equals(localDate3) ? "日期相等" : "日期不相等");

        //获取一周后的日期
        System.out.println("一周后的日期: " + localDate.plus(2, ChronoUnit.WEEKS));
    }
}

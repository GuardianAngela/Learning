package com.qf.time;

import java.time.LocalTime;

/**
 * @Description: 时间
 * @Author: GuardianAngel
 * @Date: 2022/5/27
 * @Version: 1.0
 */
public class LocalTimeTest {

    public static void main(String[] args) {
        //获取当前时间
        LocalTime localTime = LocalTime.now();
        System.out.println("当前时间: " + localTime);
        //获取当前时间,不含毫秒
        LocalTime localTime2 = LocalTime.now().withNano(0);
        System.out.println("当前时间: " + localTime2);

        //获取一小时后的时间
        LocalTime localTime3 = localTime.plusHours(1).withNano(0);
        System.out.println("一小时后的时间: " + localTime3);

        //自定义时间一
        LocalTime localTime4 = LocalTime.parse("05:20:20");
        //自定义时间二
        LocalTime localTime5 = LocalTime.of(05, 20, 20);
        System.out.println(localTime4.equals(localTime5) ? "时间相等" : "时间不相等");
    }
}

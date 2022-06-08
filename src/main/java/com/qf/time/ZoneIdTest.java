package com.qf.time;

import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * @Description: 时区
 * @Author: GuardianAngel
 * @Date: 2022/5/27
 * @Version: 1.0
 */
public class ZoneIdTest {

    public static void main(String[] args) {
        //获取本地时区时间
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println(zonedDateTime);

        //设定时区为美国洛杉矶
        ZoneId zoneId = ZoneId.of("America/Los_Angeles");
        //获取指定时区时间
        ZonedDateTime zonedDateTime2 = ZonedDateTime.now(zoneId);
        System.out.println(zonedDateTime2);
    }
}

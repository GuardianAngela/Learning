package com.qf.test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

/**
 * @Description:
 * @Author: GuardianAngel
 * @Date: 2022/5/27
 * @Version: 1.0
 */
public class Test {

    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
        Arrays.asList(1,2,3,4,5).forEach(e -> System.out.println(e));
    }
}

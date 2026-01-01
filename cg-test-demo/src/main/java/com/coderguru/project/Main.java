package com.coderguru.project;

import java.time.Duration;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        LocalDateTime todayDateTime = LocalDateTime.now();
        LocalDateTime endDateTime = LocalDateTime.of(2026, 02, 28, 0, 0, 0);

        Duration d = Duration.between(todayDateTime, endDateTime);
        System.out.println(d.toDays());
        var x = d.toDays() - 92;
        System.out.println("109 - 92 = " + x);
    }
}
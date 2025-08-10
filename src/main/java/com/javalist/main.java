package com.javalist;

public class Main {
    public static void main(String[] args) {
        DaysWeek week = new DaysWeek();
        week.createWeekDays();
        System.out.println("Days: " + week.getWeekDays());
        System.out.println("Length: " + week.getLength());
        week.removeDay("Wednesday");
        System.out.println("Without Wednesday: " + week.getWeekDays());
        System.out.println("Day 0: " + week.getDay(0));
        System.out.println("Exists Friday? " + week.existsDay("Friday"));
        week.sortAlphabetically();
        System.out.println("Sorted: " + week.getWeekDays());
        week.clearList();
        System.out.println("Empty, length: " + week.getLength());
    }
}

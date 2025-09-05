package com.ninabornemann;

public enum DaysOfWeek {
    MONDAY("Monday"),
    TUESDAY("Tuesday"),
    WEDNESDAY("Wednesday"),
    THURSDAY("Thursday"),
    FRIDAY("Friday"),
    SATURDAY("Weekend"),
    SUNDAY("Weekend");

    private final String partOfWeek;

    DaysOfWeek(String partOfWeek) {
        this.partOfWeek = partOfWeek;
    }

    public String getDayInWeek() {
        return partOfWeek;
    }
}


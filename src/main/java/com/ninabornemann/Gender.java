package com.ninabornemann;

public enum Gender {
    MALE("male"),
    FEMALE("female"),
    DIVERSE("diverse");

    private final String gender;

    Gender(String gender) {
        this.gender = gender;
    }

}

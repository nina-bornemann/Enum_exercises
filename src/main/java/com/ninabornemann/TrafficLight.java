package com.ninabornemann;

public enum TrafficLight {
    RED("red, hold"),
    YELLOW("yellow, caution"),
    GREEN("green, go ahead");

    private final String lightDescription;

    TrafficLight(String lightDescription) {
        this.lightDescription = lightDescription;
    }

    public String getDescription() {
        return lightDescription;
    }
}

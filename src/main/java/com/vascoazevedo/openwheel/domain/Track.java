package com.vascoazevedo.openwheel.domain;

public class Track {
    private final String name;
    private final double baseLapSeconds;
    private final int laps;

    public Track(String name, double baseLapSeconds, int laps) {
        this.name = name;
        this.baseLapSeconds = baseLapSeconds;
        this.laps = laps;
    }

    public String getName() {
        return name;
    }

    public double getBaseLapSeconds() {
        return baseLapSeconds;
    }

    public int getLaps() {
        return laps;
    }
}

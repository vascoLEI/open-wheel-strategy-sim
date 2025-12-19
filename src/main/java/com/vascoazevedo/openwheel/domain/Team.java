package com.vascoazevedo.openwheel.domain;

public class Team {
    private final String name;
    private final double pitCrewQuality;
    public Team(String name, double pitCrewQuality) {
        this.name = name;
        this.pitCrewQuality = pitCrewQuality;
    }

    public String getName() {
        return name;
    }
    public double getPitCrewQuality() {
        return pitCrewQuality;
    }
}

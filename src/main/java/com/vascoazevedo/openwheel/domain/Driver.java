package com.vascoazevedo.openwheel.domain;

public class Driver {
    private final String name;
    private final double paceSkill;
    private final double consistency;

    public Driver(String name, double paceSkill, double consistency) {
        this.name = name;
        this.paceSkill = paceSkill;
        this.consistency = consistency;
    }

    public String getName() {
        return name;
    }
    public double getPaceSkill() {
        return paceSkill;
    }
    public double getConsistency() {
        return consistency;
    }
}

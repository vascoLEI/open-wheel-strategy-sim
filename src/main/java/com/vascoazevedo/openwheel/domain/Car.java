package com.vascoazevedo.openwheel.domain;

public class Car {
    private final String carNumber;
    private final Team team;
    private final Driver driver;

    private Tyre tyre;
    private double tyreWear;
    private boolean inPit;
    private double timeToPitExit;

    private double totalRaceTime;
    private int completedLaps;

    public Car(String carNumber, Team team, Driver driver, Tyre tyre) {
        this.carNumber = carNumber;
        this.team = team;
        this.driver = driver;
        this.tyre = tyre;
        this.tyreWear = 0.0;
    }

    public String getCarNumber() { return carNumber; }
    public Team getTeam() { return team; }
    public Driver getDriver() { return driver; }
    public Tyre getTyre() { return tyre; }

    public double getTyreWear() { return tyreWear; }
    public void addTyreWear(double delta) { tyreWear = Math.min(1.0, tyreWear + delta); }
    public void setTyre(Tyre newTyre) { this.tyre = newTyre; this.tyreWear = 0.0; }

    public boolean isInPit() { return inPit; }
    public double getTimeToPitExit() { return timeToPitExit; }
    public void enterPit(double pitSeconds) { this.inPit = true; this.timeToPitExit = pitSeconds; }

    public void tickPit(double lapSeconds) {
        if (!inPit) return;
        timeToPitExit -= lapSeconds;
        if (timeToPitExit <= 0) { inPit = false; timeToPitExit = 0; }
    }

    public double getTotalRaceTime() { return totalRaceTime; }
    public void addRaceTime(double seconds) { totalRaceTime += seconds; }

    public int getCompletedLaps() { return completedLaps; }
    public void completeLap() { completedLaps++; }
}

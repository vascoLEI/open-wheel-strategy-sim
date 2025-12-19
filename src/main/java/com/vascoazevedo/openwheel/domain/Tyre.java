package com.vascoazevedo.openwheel.domain;

public enum Tyre {
    SOFT(1.00, 0.030),
    MEDIUM(1.02, 0.022),
    HARD(1.04, 0.016),
    INTER(1.10, 0.020),
    WET(1.15, 0.018);

    private final double basePace;
    private final double wearPerLap;

    Tyre(double basePace, double wearPerLap) {
        this.basePace = basePace;
        this.wearPerLap = wearPerLap;
    }

    public double basePace() { return basePace; }
    public double wearPerLap() { return wearPerLap; }

}

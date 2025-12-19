package com.vascoazevedo.openwheel.engine;

import com.vascoazevedo.openwheel.domain.Car;
import com.vascoazevedo.openwheel.domain.Track;

import java.util.Random;

public class LapSimulator {

    private final Random rng;

    public LapSimulator(long seed) {
        this.rng = new Random(seed);
    }

    public double simulateLapSeconds(Track track, Car car) {
        double t = track.getBaseLapSeconds();

        t *= car.getTyre().basePace();

        t *= (1.0 + 0.04 * car.getTyreWear());

        t -= (1.0 * car.getDriver().getPaceSkill());

        double noiseStd = 0.15 + (1.0 - car.getDriver().getConsistency()) * 0.60;
        t += rng.nextGaussian() * noiseStd;

        double minT = track.getBaseLapSeconds() * 0.88;
        if (t < minT) t = minT;

        return t;
    }
}

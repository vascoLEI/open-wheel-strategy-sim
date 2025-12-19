package com.vascoazevedo.openwheel.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class RaceState {
    private final Track track;
    private final List<Car> cars;
    private int currentLap;

    public RaceState(Track track, List<Car> cars) {
        this.track = track;
        this.cars = new ArrayList<>(cars);
        this.currentLap = 0;
    }

    public Track getTrack() { return track; }
    public List<Car> getCars() { return Collections.unmodifiableList(cars); }
    public int getCurrentLap() { return currentLap; }
    public boolean isFinished() { return currentLap >= track.getLaps(); }

    public void advanceLap() { currentLap++; }

    public List<Car> getClassification() {
        List<Car> sorted = new ArrayList<>(cars);
        sorted.sort(new Comparator<Car>() {
            @Override
            public int compare(Car a, Car b) {
                return Double.compare(a.getTotalRaceTime(), b.getTotalRaceTime());
            }
        });
        return sorted;
    }
}


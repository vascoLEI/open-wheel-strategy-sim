package com.vascoazevedo.openwheel.controller;

import com.vascoazevedo.openwheel.domain.Car;
import com.vascoazevedo.openwheel.domain.RaceState;
import com.vascoazevedo.openwheel.engine.RaceEngine;

import java.util.List;

public class RaceController {

    private final RaceEngine engine;
    private final RaceState state;

    public RaceController(RaceEngine engine, RaceState state) {
        this.engine = engine;
        this.state = state;
    }

    public void simulateLaps(int laps) {
        engine.runLaps(state, laps);
    }

    public int getCurrentLap() {
        return state.getCurrentLap();
    }

    public List<Car> getClassification() {
        return state.getClassification();
    }

    public RaceState getState() {
        return state;
    }
}

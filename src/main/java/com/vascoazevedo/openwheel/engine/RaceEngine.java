package com.vascoazevedo.openwheel.engine;

import com.vascoazevedo.openwheel.domain.Car;
import com.vascoazevedo.openwheel.domain.RaceState;

public class RaceEngine {

    private final LapSimulator lapSimulator;

    public RaceEngine(LapSimulator lapSimulator) {
        this.lapSimulator = lapSimulator;
    }

    public void stepLap(RaceState state) {
        int nextLapNumber = state.getCurrentLap() + 1;

        for (Car car : state.getCars()) {
            double lapTime = lapSimulator.simulateLapSeconds(state.getTrack(), car);

            car.addTyreWear(car.getTyre().wearPerLap());

            car.addRaceTime(lapTime);
            car.completeLap();
        }

        state.advanceLap();
    }

    public void runLaps(RaceState state, int laps) {
        for (int i = 0; i < laps; i++) {
            if (state.isFinished()) return;
            stepLap(state);
        }
    }
}

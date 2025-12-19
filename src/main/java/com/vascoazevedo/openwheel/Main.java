package com.vascoazevedo.openwheel;

import com.vascoazevedo.openwheel.controller.RaceController;
import com.vascoazevedo.openwheel.domain.*;
import com.vascoazevedo.openwheel.engine.*;
import com.vascoazevedo.openwheel.ui.RaceUI;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Track track = new Track("Portimão", 79.5, 50);

        Team teamA = new Team("ApexGP", 0.85);
        Team teamB = new Team("NovaRacing", 0.55);

        Driver d1 = new Driver("Vasco", 0.90, 0.90);
        Driver d2 = new Driver("João", 0.74, 0.82);

        Car c1 = new Car("12", teamA, d1, Tyre.SOFT);
        Car c2 = new Car("27", teamB, d2, Tyre.MEDIUM);

        RaceState state = new RaceState(track, List.of(c1, c2));

        RaceEngine engine = new RaceEngine(new LapSimulator(42L));
        RaceController controller = new RaceController(engine, state);
        RaceUI ui = new RaceUI(controller);

        ui.runDemo(51);
    }
}

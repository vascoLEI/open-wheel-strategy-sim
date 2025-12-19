package com.vascoazevedo.openwheel.ui;

import com.vascoazevedo.openwheel.controller.RaceController;
import com.vascoazevedo.openwheel.domain.Car;

import java.util.List;

public class RaceUI {

    private final RaceController controller;

    public RaceUI(RaceController controller) {
        this.controller = controller;
    }

    public void runDemo(int laps) {
        System.out.println("Simulating " + laps + " laps...\n");

        for (int i = 0; i < laps; i++) {
            controller.simulateLaps(1);
            printClassification("After lap " + controller.getCurrentLap());
        }

        printClassification("Final");
    }

    private void printClassification(String title) {
        System.out.println("=== " + title + " ===");

        List<Car> grid = controller.getClassification();
        int pos = 1;

        for (Car car : grid) {
            System.out.println(
                    pos++ + ") #" + car.getCarNumber()
                            + " " + car.getDriver().getName()
                            + "  total=" + String.format("%.3f", car.getTotalRaceTime()) + "s"
                            + "  tyre=" + car.getTyre()
                            + "  wear=" + String.format("%.2f", car.getTyreWear())
            );
        }
        System.out.println();
    }
}

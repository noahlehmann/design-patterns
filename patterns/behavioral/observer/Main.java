package behavioral.observer;

import behavioral.observer.sensors.Display;
import behavioral.observer.sensors.TemperatureSensor;

public class Main {
    public static void main(String[] args) {
        TemperatureSensor sensor = new TemperatureSensor();
        sensor.addObserver(new Display());

        sensor.setTemperature(25);
        sensor.setTemperature(30);
    }
}

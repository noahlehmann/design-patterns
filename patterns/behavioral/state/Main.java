package behavioral.state;

import behavioral.state.trafficlight.TrafficLight;

public class Main {
    public static void main(String[] args) {
        TrafficLight light = new TrafficLight();
        light.change();
        light.change();
        light.change();
    }
}

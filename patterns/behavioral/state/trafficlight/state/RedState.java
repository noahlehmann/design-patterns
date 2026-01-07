package behavioral.state.trafficlight.state;

import behavioral.state.trafficlight.TrafficLight;
import behavioral.state.trafficlight.TrafficLightState;

public class RedState implements TrafficLightState {

    @Override
    public void next(TrafficLight context) {
        context.setState(new GreenState());
    }

    @Override
    public String color() {
        return "RED";
    }
}

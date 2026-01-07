package behavioral.state.trafficlight.state;

import behavioral.state.trafficlight.TrafficLight;
import behavioral.state.trafficlight.TrafficLightState;

public class GreenState implements TrafficLightState {

    @Override
    public void next(TrafficLight context) {
        context.setState(new YellowState());
    }

    @Override
    public String color() {
        return "GREEN";
    }
}

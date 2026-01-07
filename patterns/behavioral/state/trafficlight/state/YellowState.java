package behavioral.state.trafficlight.state;

import behavioral.state.trafficlight.TrafficLight;
import behavioral.state.trafficlight.TrafficLightState;

public class YellowState implements TrafficLightState {

    @Override
    public void next(TrafficLight context) {
        context.setState(new RedState());
    }

    @Override
    public String color() {
        return "YELLOW";
    }
}

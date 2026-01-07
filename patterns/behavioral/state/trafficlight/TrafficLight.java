package behavioral.state.trafficlight;

import behavioral.state.trafficlight.state.RedState;

public class TrafficLight {

    private TrafficLightState state = new RedState();

    public void setState(TrafficLightState state) {
        this.state = state;
    }

    public void change() {
        state.next(this);
        System.out.println("Light is now " + state.color());
    }
}

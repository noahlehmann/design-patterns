package behavioral.state.trafficlight;

public interface TrafficLightState {
    void next(TrafficLight context);
    String color();
}

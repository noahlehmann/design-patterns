package behavioral.observer.sensors;

import behavioral.observer.Observable;
import behavioral.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class TemperatureSensor implements Observable {

    private final List<Observer> observers = new ArrayList<>();
    private int temperature;

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        notifyObservers();
    }

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(temperature);
        }
    }
}

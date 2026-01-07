package behavioral.observer.sensors;

import behavioral.observer.Observer;

public class Display implements Observer {

    @Override
    public void update(int newValue) {
        System.out.println("[Display] New temperature: " + newValue);
    }
}

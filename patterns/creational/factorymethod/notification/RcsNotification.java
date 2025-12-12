package creational.factorymethod.notification;

import creational.factorymethod.Notification;

public class RcsNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Sending RCS: " + message);
    }
}

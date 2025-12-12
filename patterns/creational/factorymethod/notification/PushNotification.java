package creational.factorymethod.notification;

import creational.factorymethod.Notification;

public class PushNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Sending PUSH: " + message);
    }
}

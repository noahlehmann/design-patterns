package creational.factorymethod.notification;

import creational.factorymethod.Notification;

public class EmailNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Sending EMAIL: " + message);
    }
}

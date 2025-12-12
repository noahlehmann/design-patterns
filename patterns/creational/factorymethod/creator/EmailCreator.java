package creational.factorymethod.creator;

import creational.factorymethod.Creator;
import creational.factorymethod.Notification;
import creational.factorymethod.notification.EmailNotification;

public class EmailCreator extends Creator {
    @Override
    public Notification createNotification() {
        return new EmailNotification();
    }
}

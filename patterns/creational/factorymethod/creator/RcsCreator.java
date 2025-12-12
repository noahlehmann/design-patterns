package creational.factorymethod.creator;

import creational.factorymethod.Creator;
import creational.factorymethod.Notification;
import creational.factorymethod.notification.RcsNotification;

public class RcsCreator extends Creator {
    @Override
    public Notification createNotification() {
        return new RcsNotification();
    }
}

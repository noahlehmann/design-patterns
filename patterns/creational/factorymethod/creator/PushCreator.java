package creational.factorymethod.creator;

import creational.factorymethod.Creator;
import creational.factorymethod.Notification;
import creational.factorymethod.notification.PushNotification;

public class PushCreator extends Creator {
    @Override
    public Notification createNotification() {
        return new PushNotification();
    }
}

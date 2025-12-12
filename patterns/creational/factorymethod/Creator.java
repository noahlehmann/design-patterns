package creational.factorymethod;

public abstract class Creator {
    public abstract Notification  createNotification();

    public void notifyUser(String message) {
        var notification = createNotification();
        notification.send(message);
    }
}

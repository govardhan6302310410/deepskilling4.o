package factory;

public class NotificationService {
    public void send(String type, String message) {
        Notification notification = NotificationFactory.createNotification(type);
        if (notification != null) {
            notification.notifyUser(message);
        } else {
            System.out.println("Invalid notification type: " + type);
        }
    }
}

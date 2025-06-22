package factory;

public class SMSNotification implements Notification {
    public void notifyUser(String message) {
        System.out.println("Sending SMS: " + message);
    }
}

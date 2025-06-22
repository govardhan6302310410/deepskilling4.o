
package factory;

public class Main {
    public static void main(String[] args) {
        NotificationService service = new NotificationService();

        service.send("EMAIL", "Welcome to Factory Method!");
        service.send("SMS", "Your OTP is 123456");
        service.send("PUSH", "This should fail.");
    }
}

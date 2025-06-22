// src/Main.java
public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        ConfigManager config = ConfigManager.getInstance();

        logger.log("🚀 App started");
        logger.log("App Name: " + config.get("app.name"));
        logger.log("Version: " + config.get("app.version"));

        // Simulate user login
        SessionManager session = SessionManager.getInstance();
        session.login("john_doe");

        // Log action
        AuditLogger audit = AuditLogger.getInstance();
        audit.logAction(session.getCurrentUser(), "Viewed Dashboard");
        audit.logAction(session.getCurrentUser(), "Downloaded Report");

        // Logout
        session.logout();
        logger.log("🔚 App shutdown");
    }
}

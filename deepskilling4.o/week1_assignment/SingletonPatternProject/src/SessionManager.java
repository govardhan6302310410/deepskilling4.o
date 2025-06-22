
public class SessionManager {
    private static SessionManager instance;
    private String currentUser;

    private SessionManager() {}

    public static synchronized SessionManager getInstance() {
        if (instance == null) {
            instance = new SessionManager();
        }
        return instance;
    }

    public void login(String username) {
        this.currentUser = username;
        System.out.println("✅ User '" + username + "' logged in");
    }

    public void logout() {
        System.out.println("🔓 User '" + currentUser + "' logged out");
        currentUser = null;
    }

    public String getCurrentUser() {
        return currentUser;
    }

    public boolean isLoggedIn() {
        return currentUser != null;
    }
}

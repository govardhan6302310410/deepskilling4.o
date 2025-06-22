
import java.text.SimpleDateFormat;
import java.util.Date;

public class AuditLogger {
    private static AuditLogger instance;
    private final SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");

    private AuditLogger() {}

    public static AuditLogger getInstance() {
        if (instance == null) {
            instance = new AuditLogger();
        }
        return instance;
    }

    public void logAction(String user, String action) {
        String time = sdf.format(new Date());
        System.out.println("[Audit " + time + "] User: " + user + " | Action: " + action);

    }
}

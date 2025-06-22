
import java.io.*;
import java.util.Properties;

public class ConfigManager {
    private static ConfigManager instance;
    private Properties config = new Properties();

    private ConfigManager() {
        System.out.println("Loading configuration...");
        try (InputStream input = new FileInputStream("config.properties")) {
            config.load(input);
        } catch (IOException ex) {
            System.out.println("Failed to load config file.");
        }
    }

    public static synchronized ConfigManager getInstance() {
        if (instance == null) {
            instance = new ConfigManager();
        }
        return instance;
    }

    public String get(String key) {
        return config.getProperty(key, "Not Found");
    }
}

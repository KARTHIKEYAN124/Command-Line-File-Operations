package file.operations;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Config {
    private static Config instance;
    private Properties properties;

    private Config() {
        properties = new Properties();
        try (FileInputStream fis = new FileInputStream("config/config.properties")) {
            properties.load(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static synchronized Config getInstance() {
        if (instance == null) {
            instance = new Config();
        }
        return instance;
    }

    public static void init() {
        getInstance(); // Ensure instance is initialized
    }

    public String get(String key) {
        return properties.getProperty(key);
    }
}

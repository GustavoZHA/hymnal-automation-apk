package apk.automation.hymnal.config;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyLoader {
    private static Properties properties = new Properties();

    static {
        try {
            String env = EnvironmentResolver.getEnv();
            String path = "src/test/resources/" + env + ".properties";

            FileInputStream fis = new FileInputStream(path);
            properties.load(fis);

        } catch (Exception e) {
            throw new RuntimeException("Failed to load environment properties", e);
        }
    }

    public static String get(String key) {
        return properties.getProperty(key);
    }
}

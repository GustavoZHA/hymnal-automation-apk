package apk.automation.hymnal.config;

import lombok.Getter;

public class EnvConfig {
    @Getter
    private static String APPIUM_URL;

    static {
        try {
            getEnvironmentProperties();
        } catch (Exception e) {
            getEnvironmentSystem();
        }
    }

    private static void getEnvironmentProperties() {
        PropertiesReader property = new PropertiesReader("environments/config.properties");
        APPIUM_URL = property.getProperty("APPIUM_URL");
    }

    private static void getEnvironmentSystem() {
        APPIUM_URL = System.getenv("APPIUM_URL");
    }
}

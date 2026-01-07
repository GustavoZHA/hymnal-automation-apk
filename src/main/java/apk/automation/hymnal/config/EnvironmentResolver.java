package apk.automation.hymnal.config;

public class EnvironmentResolver {

    public static String getEnv() {
        return System.getProperty(
                "env",
                System.getenv().getOrDefault("ENV", "qa")
        );
    }

    public static String getPlatform() {
        return System.getProperty(
                "platform",
                System.getenv().getOrDefault("PLATFORM", "android")
        );
    }
}

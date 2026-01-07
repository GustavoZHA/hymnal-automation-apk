package framework.base;

import apk.automation.hymnal.config.EnvConfig;
import apk.automation.hymnal.config.PropertyLoader;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

import java.net.MalformedURLException;
import java.net.URL;

public class DriverFactory {
    private static ThreadLocal<AppiumDriver> driver = new ThreadLocal<>();

    public static AppiumDriver getDriver() {
        return driver.get();
    }

    public static void initDriver() throws MalformedURLException {

        UiAutomator2Options options = new UiAutomator2Options()
                .setDeviceName(PropertyLoader.get("appium.deviceName"))
                .setPlatformName(PropertyLoader.get("platform.name"))
                .setApp(System.getProperty("user.dir") + PropertyLoader.get("appium.app"))
                .setAutomationName(PropertyLoader.get("appium.automationName"));

        driver.set(new AndroidDriver(
                new URL(EnvConfig.getAPPIUM_URL()),
                options
        ));
    }

    public static void quitDriver() {
        if (driver.get() != null) {
            driver.get().quit();
            driver.remove();
        }
    }
}

package apk.automation.hymnal.pages.android;

import apk.automation.hymnal.pages.BasePage;
import io.appium.java_client.AppiumBy;

public class BarMenuCP extends BasePage {

    public void clickMenuBar() {
        driver.findElement(AppiumBy.accessibilityId("Open navigation drawer")).click();
    }

    public void goHomeButton() {
        driver.findElement(AppiumBy.id("com.example.himnarioprincipal:id/btn_home_button_bar")).click();
    }
}

package apk.automation.hymnal.pages.android;

import framework.utils.GenerateRandomData;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.WebElement;

public class HymnsPage extends BarMenuCP{
    private String recordList = "com.example.himnarioprincipal:id/recordList";

    public int getNumberRecords() {
        return driver.findElements(AppiumBy.id(recordList)).size();
    }

    public void clickRandomItem() {
        WebElement element = GenerateRandomData.randomItemFromList(driver.findElements(AppiumBy.id(recordList)));
        element.click();
    }
}

package apk.automation.hymnal.pages.android;

import framework.utils.GenerateRandomData;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HymnsPage extends BarMenuCP{
    private By listTittle = AppiumBy.id("com.example.himnarioprincipal:id/titleList");
    private String recordList = "com.example.himnarioprincipal:id/recordList";
    private WebElement hymn;

    public int getNumberRecords() {
        return driver.findElements(AppiumBy.id(recordList)).size();
    }

    public HymnPage clickRandomItem() {
        hymn = GenerateRandomData.randomItemFromList(driver.findElements(AppiumBy.id(recordList)));
        hymn.click();
        return new HymnPage();
    }

    public String getTittleList() {
        return driver.findElement(listTittle).getText();
    }

    public String getTitleHymnsSelected(){
        return hymn.getText();
    }
}

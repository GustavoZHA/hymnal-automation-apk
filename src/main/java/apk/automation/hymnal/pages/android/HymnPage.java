package apk.automation.hymnal.pages.android;

import apk.automation.hymnal.pages.BasePage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HymnPage extends BasePage {

    private By toolbarTitle =
            AppiumBy.id("com.example.himnarioprincipal:id/toolbar_title");

    private By openMenuButton =
            AppiumBy.accessibilityId("Open navigation drawer");

    private By hymnTitle =
            AppiumBy.id("com.example.himnarioprincipal:id/titleHymn");

    private By nextHymnButton =
            AppiumBy.id("com.example.himnarioprincipal:id/nextHymnsAfter");
    private By beforeHymnButton =
            AppiumBy.id("com.example.himnarioprincipal:id/nextHymnsBefore");
    private By hymnVerses =
            AppiumBy.xpath(
                    "//android.widget.LinearLayout[@resource-id='com.example.himnarioprincipal:id/hymn']" +
                            "/android.widget.TextView"
            );

    private By favoriteButton =
            AppiumBy.id("com.example.himnarioprincipal:id/favoriteFloatButton");

    private By addToListButton =
            AppiumBy.id("com.example.himnarioprincipal:id/addListHymns");

    private By knowButton =
            AppiumBy.id("com.example.himnarioprincipal:id/knowFloatButton");


    public String getToolbarTitle() {
        return driver.findElement(toolbarTitle).getText();
    }

    public void openNavigationMenu() {
        driver.findElement(openMenuButton).click();
    }

    public String getHymnTitle() {
        return driver.findElement(hymnTitle).getText();
    }

    public void goToNextHymn() {
        driver.findElement(nextHymnButton).click();
    }

    public void goToBeforeHymn() {
        driver.findElement(beforeHymnButton).click();
    }

    public List<WebElement> getAllVerses() {
        return driver.findElements(hymnVerses);
    }

    public String getFullHymnText() {
        StringBuilder hymn = new StringBuilder();

        for (WebElement verse : getAllVerses()) {
            String line = verse.getText().trim();
            if (!line.isEmpty()) {
                hymn.append(line).append("\n");
            }
        }
        return hymn.toString();
    }

    public void addToFavorites() {
        driver.findElement(favoriteButton).click();
    }

    public void addToList() {
        driver.findElement(addToListButton).click();
    }

    public void openKnowOption() {
        driver.findElement(knowButton).click();
    }
}

package apk.automation.hymnal.Test;

import apk.automation.hymnal.TestListener;
import apk.automation.hymnal.enums.MenuOption;
import apk.automation.hymnal.pages.android.HymnsPage;
import apk.automation.hymnal.pages.android.MenuPage;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

public class ListTest extends BaseTest{

    @Test
    public void allMenuWorkSuccessfully() {
        MenuPage menuPage = new MenuPage();
        menuPage.selectMenu(MenuOption.HIMNARIO).click();

        HymnsPage hymnsPage = new HymnsPage();
        Assert.assertEquals(hymnsPage.getTittleList(),MenuOption.HIMNARIO);
    }
}

package apk.automation.hymnal.Test;

import apk.automation.hymnal.enums.MenuOption;
import apk.automation.hymnal.pages.android.MenuPage;
import org.testng.annotations.Test;

public class ListTest extends BaseTest{

    @Test
    public void allMenuWorkSuccessfully() {
        MenuPage menuPage = new MenuPage();
        menuPage.selectMenu(MenuOption.HIMNARIO);
        menuPage.selectMenu(MenuOption.BUSCAR);
        menuPage.selectMenu(MenuOption.CONOCIDOS);
        menuPage.selectMenu(MenuOption.FAVORITOS);
        menuPage.selectMenu(MenuOption.CLASIFICACION_HIMNOS);
        menuPage.selectMenu(MenuOption.LISTAS_PERSONALIZADAS);
    }
}

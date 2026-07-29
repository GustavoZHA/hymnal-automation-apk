package apk.automation.hymnal.pages.android;

import apk.automation.hymnal.enums.MenuOption;
import apk.automation.hymnal.pages.android.BarMenuCP;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MenuPage extends BarMenuCP {
    private final By btnHimnario = By.id("com.example.himnarioprincipal:id/bHimnario");
    private By btnBuscar = By.id("com.example.himnarioprincipal:id/bBuscar");
    private By btnFavoritos = By.id("com.example.himnarioprincipal:id/bFavoritos");
    private By btnConocidos = By.id("com.example.himnarioprincipal:id/bConocidos");
    private By btnClasificacion = By.id("com.example.himnarioprincipal:id/bHPredicacion");
    private By btnListas = By.id("com.example.himnarioprincipal:id/bCreateList");

    private By btnGoHomeButton = By.id("com.example.himnarioprincipal:id/btn_home_button_bar");

    public WebElement selectMenu(MenuOption option) {
        switch (option) {
            case HIMNARIO:
                return driver.findElement(btnHimnario);

            case BUSCAR:
                return driver.findElement(btnBuscar);

            case FAVORITOS:
                return driver.findElement(btnFavoritos);

            case CONOCIDOS:
                return driver.findElement(btnConocidos);

            case CLASIFICACION_HIMNOS:
                return driver.findElement(btnClasificacion);

            case LISTAS_PERSONALIZADAS:
                return driver.findElement(btnListas);

            default:
                throw new IllegalArgumentException("Menu option not supported: " + option);
        }
    }
}

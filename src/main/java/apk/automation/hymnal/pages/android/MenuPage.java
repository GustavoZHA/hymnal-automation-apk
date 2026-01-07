package apk.automation.hymnal.pages.android;

import apk.automation.hymnal.enums.MenuOption;
import apk.automation.hymnal.pages.android.BarMenuCP;
import org.openqa.selenium.By;

public class MenuPage extends BarMenuCP {
    private final By btnHimnario = By.id("com.example.himnarioprincipal:id/bHimnario");
    private By btnBuscar = By.id("com.example.himnarioprincipal:id/bBuscar");
    private By btnFavoritos = By.id("com.example.himnarioprincipal:id/bFavoritos");
    private By btnConocidos = By.id("com.example.himnarioprincipal:id/bConocidos");
    private By btnClasificacion = By.id("com.example.himnarioprincipal:id/bHPredicacion");
    private By btnListas = By.id("com.example.himnarioprincipal:id/bCreateList");

    private By btnGoHomeButton = By.id("com.example.himnarioprincipal:id/btn_home_button_bar");


    public void selectMenu(MenuOption option) {
        switch (option) {
            case HIMNARIO:
                driver.findElement(btnHimnario).click();
                break;
            case BUSCAR:
                driver.findElement(btnBuscar).click();
                break;
            case FAVORITOS:
                driver.findElement(btnFavoritos).click();
                break;

            case CONOCIDOS:
                driver.findElement(btnConocidos).click();
                break;

            case CLASIFICACION_HIMNOS:
                driver.findElement(btnClasificacion).click();
                break;

            case LISTAS_PERSONALIZADAS:
                driver.findElement(btnListas).click();
                break;
            default:
                throw new IllegalArgumentException("Menu option not supported: " + option);
        }
    }

}

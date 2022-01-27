package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage {
    public CartPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(xpath = "//a[contains(@href, 'https://www.albeena.ro/produse-apicole')]")
    private WebElement inapoi;

    @FindBy(css = "input[name='cantitate_0']")
    private WebElement cantitateProdus;

    @FindBy(css = "input[type='submit']")
    private WebElement reactualizeazaButon;

    @FindBy(xpath = "//a[contains(@href, 'https://www.albeena.ro/cos/trimite')]")
    private WebElement trimiteComanda;

    //de facut
    @FindBy(xpath = "//table[@class='table table-border']/tbody/tr/td")
    private WebElement subtotalValue;

    @FindBy(xpath = "//table[@class='table table-border']/tbody/tr[2]/td")
    private WebElement transportValue;

    @FindBy(xpath = "//table[@class='table table-border']/tbody/tr[3]/td")
    private WebElement totalValue;

    @FindBy(xpath = "//a[contains(@title,'Contul meu')]")
    private WebElement contulMeu;

    @FindBy(xpath = "//a[contains(text(), 'Produse')]")
    private WebElement productsPage;

    public void clickInapoi() {
        elementMethods.scrollByPixel(0, 500);
        elementMethods.clickElement(inapoi);
    }

    public void clickReactualizeazaButon() {
        elementMethods.scrollByPixel(0, 500);
        elementMethods.clickElement(reactualizeazaButon);
    }

    public void clickTrimiteComanda() {
        elementMethods.scrollByPixel(0, 1000);
        elementMethods.clickElement(trimiteComanda);
    }

    public void fillCantitate(String value) {
        elementMethods.fillElement(cantitateProdus, value);
    }

    public void clickArrow(Keys arrow) {
        elementMethods.clickArrow(cantitateProdus, arrow);
    }

    public void clearCantitate() {
        elementMethods.clear(cantitateProdus);
    }

    public void validateSubtotalValue(String expectedValue) {
        elementMethods.validateElementMessage(subtotalValue, expectedValue);
    }

    public void validateTransportValue(String expectedValue) {
        elementMethods.validateElementMessage(transportValue, expectedValue);
    }

    public void validateTotalValue(String expectedValue) {
        elementMethods.validateElementMessage(totalValue, expectedValue);
    }

    public void clickMyAccountPage() {
        elementMethods.clickElement(contulMeu);
    }

    public void goToProductsPage() {
        elementMethods.clickElement(productsPage);
    }
}

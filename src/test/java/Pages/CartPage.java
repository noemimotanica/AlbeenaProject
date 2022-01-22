package Pages;

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

    @FindBy(css = "//a[contains(@href, 'https://www.albeena.ro/cos/trimite')]")
    private WebElement trimiteComanda;

    @FindBy(xpath = "//table[@class='table table-border']/tbody/tr/td")
    private WebElement subtotalValue;

    @FindBy(xpath = "//table[@class='table table-border']/tbody/tr[2]/td")
    private WebElement transportValue;

    @FindBy(xpath = "//table[@class='table table-border']/tbody/tr[3]/td")
    private WebElement totalValue;

    public void clickInapoi() {
        elementMethods.clickElement(inapoi);
    }

}

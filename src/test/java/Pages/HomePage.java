package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[contains(text(), 'Produse')]")
    private WebElement productsPage;

    @FindBy(xpath = "//a[contains(@title, 'Cos de cumparaturi')]")
    private WebElement cosDeCumparaturi;

    @FindBy(xpath = "//a[contains(@title,'Contul meu')]")
    private WebElement contulMeu;

    public void goToProductsPage() {
        elementMethods.clickElement(productsPage);
    }

    public void clickCartPage() {
        elementMethods.clickElement(cosDeCumparaturi);
    }

    public void clickMyAccountPage() {
        elementMethods.clickElement(contulMeu);
    }

}

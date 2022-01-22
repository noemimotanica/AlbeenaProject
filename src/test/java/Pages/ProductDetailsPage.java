package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDetailsPage extends BasePage {
    public ProductDetailsPage(WebDriver driver) {
        super(driver);

    }

    @FindBy(xpath = "//a[contains (@class, 'btn btn-lg btn-orange')]")
    private WebElement adaugaInCos;

    @FindBy(xpath = "//a[contains (@class, 'btn btn-lg btn-orange')]")
    private WebElement cantitateProdus;

}

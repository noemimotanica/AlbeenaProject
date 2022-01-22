package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);

    }

    @FindBy(xpath = "//input[type='email']")
    private WebElement email;

    @FindBy(xpath = "input[type='password']")
    private WebElement parola;

    @FindBy(id = "Button1")
    private WebElement intrainCont;

}

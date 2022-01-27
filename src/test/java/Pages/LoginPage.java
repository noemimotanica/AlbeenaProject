package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);

    }

    @FindBy(css = "input[type='email']")
    private WebElement email;

    @FindBy(css = "input[type='password']")
    private WebElement parola;

    @FindBy(xpath = "//a[contains(@title,'Contul meu')]")
    private WebElement contulMeu;

    @FindBy(id = "Button1")
    private WebElement intrainCont;

    @FindBy(xpath="//a[contains(text(), 'Logout')]")
    private WebElement logOut;


    @FindBy(xpath = "//a[contains(@title, 'Cos de cumparaturi')]")
    private WebElement cosDeCumparaturi;

    public void fillEmail(String value) {
        elementMethods.fillElement(email, value);

    }

    public void clearEmail() {
        elementMethods.scrollByPixel(0, 300);
        elementMethods.clear(email);
    }

    public void clearParola() {
        elementMethods.clear(parola);
    }
    public void fillParola(String value) {
        elementMethods.fillElement(parola, value);
    }

    public void clickIntraInCont() {
        elementMethods.clickElement(intrainCont);
    }

    public void clickLogOut() {
        elementMethods.scrollByPixel(0, 500);
        elementMethods.clickElement(logOut);
    }
    public void clickMyAccountPage() {
        elementMethods.clickElement(contulMeu);
    }
    public void clickCartPage() {
        elementMethods.clickElement(cosDeCumparaturi);
    }


}

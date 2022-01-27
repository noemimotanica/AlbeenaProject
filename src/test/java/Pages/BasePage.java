package Pages;


import HelpMethods.ElementMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    public ElementMethods elementMethods;
    public WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        elementMethods = new ElementMethods(driver);
        PageFactory.initElements(driver, this);

    }
    public void clear(WebElement element) {
        elementMethods.clear(element);
    }

}

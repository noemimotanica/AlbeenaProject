package HelpMethods;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ElementMethods {
    public WebDriver driver;
    public JavascriptExecutor executor;

    public ElementMethods(WebDriver driver) {
        this.driver = driver;
        executor = (JavascriptExecutor) driver;
    }

    public void scrollByPixel(Integer x, Integer y){
        executor.executeScript("window.scrollBy("+x+","+y+")");
    }

    public void clickElement(WebElement element){
        waitElementVisible(element);
        element.click();
    }

    public void executeScriptOnClick(WebElement element) {
        executor.executeScript("arguments[0].click();", element);
    }

    public void waitElementVisible(WebElement element){
        new WebDriverWait(driver, Duration.ofSeconds(60)).until(ExpectedConditions.visibilityOf(element));
    }

    public void hoverElement(WebElement element){
        waitElementVisible(element);
        Actions action = new Actions(driver);
        action.moveToElement(element).perform();
    }


}

package HelpMethods;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class ElementMethods {
    public WebDriver driver;
    public JavascriptExecutor executor;

    public ElementMethods(WebDriver driver) {
        this.driver = driver;
        executor = (JavascriptExecutor) driver;
    }

    public void scrollByPixel(Integer x, Integer y) {
        executor.executeScript("window.scrollBy(" + x + "," + y + ")");
    }

    public void clickElement(WebElement element) {
        waitElementVisible(element);
        element.click();
    }

    public void executeScriptOnClick(WebElement element) {
        executor.executeScript("arguments[0].click();", element);
    }

    public void waitElementVisible(WebElement element) {
        new WebDriverWait(driver, Duration.ofSeconds(60)).until(ExpectedConditions.visibilityOf(element));
    }

    public void waitElementsVisible(List<WebElement> webElements) {
        new WebDriverWait(driver, Duration.ofSeconds(60)).until(ExpectedConditions.visibilityOfAllElements(webElements));
    }

    public void validateElementMessage(WebElement element, String expectedValue) {
        waitElementVisible(element);
        String actualValue = element.getText();
        Assert.assertEquals(expectedValue, actualValue);
    }

    public void hoverElement(WebElement element) {
        waitElementVisible(element);
        Actions action = new Actions(driver);
        action.moveToElement(element).perform();
    }

    public void fillElement(WebElement element, String value) {
        waitElementVisible(element);
        element.sendKeys(value);
    }

    public void clickArrow(WebElement element, Keys arrow) {
        waitElementVisible(element);
        element.sendKeys(arrow);
    }

    public void submit(WebElement element) {
        element.submit();
    }

    public void clear(WebElement element) {
        element.clear();

    }
}
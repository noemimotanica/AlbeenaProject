package Tests;

import Base.SharedData;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class ProductTest extends SharedData {

    @Test
            public void testAutomat() {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        Actions action = new Actions(driver);
        WebElement produseElement = driver.findElement(By.xpath("//a[contains(text(), 'Produse')]"));
        produseElement.click();
//
//        executor.executeScript("window.scrollBy(0,500)");
//
//        WebElement laptisorDeMatca =driver.findElement(By.xpath("//a[contains (@href,'https://www.albeena.ro/laptisor-de-matca-pur-crud-2-10-hda-25-gr-8381.html')]"));
//        executor.executeScript("arguments[0].click();", laptisorDeMatca);
//
//        executor.executeScript("window.scrollBy(0,500)");
//
//        WebElement adaugaInCos=driver.findElement(By.xpath("//a[contains (@class, 'btn btn-lg btn-orange')]"));
//        executor.executeScript("arguments[0].click();", adaugaInCos);
//
//        executor.executeScript("window.scrollBy(0,500)");
//
//        WebElement inapoiElement = driver.findElement(By.xpath("//a[contains(@href, 'https://www.albeena.ro/produse-apicole')]"));
//        inapoiElement.click();
//
//        laptisorDeMatca =driver.findElement(By.xpath("//a[contains (@href,'https://www.albeena.ro/laptisor-de-matca-pur-crud-2-10-hda-25-gr-8381.html')]"));
//        executor.executeScript("arguments[0].click();", laptisorDeMatca);
//
//        executor.executeScript("window.scrollBy(0,500)");
//
//
//        WebElement cantitateLaptisorProdus = driver.findElement(By.cssSelector("input[name='qty']"));
//        // cantitateLaptisorProdus.clear();
//        // cantitatePrimulLaptisor.sendKeys("120"); -2 posibilitati de setare a cantitatii
//        cantitateLaptisorProdus.sendKeys(Keys.ARROW_UP);
//        cantitateLaptisorProdus.sendKeys(Keys.ARROW_UP);
//
//        adaugaInCos=driver.findElement(By.xpath("//a[contains (@class, 'btn btn-lg btn-orange')]"));
//        executor.executeScript("arguments[0].click();", adaugaInCos);
//
//        executor.executeScript("window.scrollBy(0,500)");
//
//        inapoiElement = driver.findElement(By.xpath("//a[contains(@href, 'https://www.albeena.ro/produse-apicole')]"));
//        inapoiElement.click();
//
//        laptisorDeMatca =driver.findElement(By.xpath("//a[contains (@href,'https://www.albeena.ro/laptisor-de-matca-pur-crud-2-10-hda-25-gr-8381.html')]"));
//        executor.executeScript("arguments[0].click();", laptisorDeMatca);
//
//        executor.executeScript("window.scrollBy(0,2000)");

        //@TODO sa continui
        WebElement morningJoy=driver.findElement(By.xpath("//a[contains (@title, 'Morning joy - mix crema miere si laptisor de matca 200 gr')]"));
        executor.executeScript("arguments[0].click();",morningJoy);

        executor.executeScript("window.scrollBy(0,2000)");





        WebElement scrieOParere=driver.findElement(By.xpath("//a[contains (@title, 'Write a review')]"));
        executor.executeScript("arguments[0].click();",scrieOParere);

        executor.executeScript("window.scrollBy(0,300)");

        new WebDriverWait(driver, Duration.ofSeconds(60)).until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@id='rate3']/div[2]/span")));
        List<WebElement> stars = driver.findElements(By.xpath("//div[@id='rate3']/div[2]/span/i"));

        //hover the stars
        WebElement star = stars.get(3);
        action = new Actions(driver);
        action.moveToElement(star).perform();

        //click on the star
        WebElement myRating = driver.findElement(By.xpath("//div[@id='rate3']/div[3]/span[4]/i"));
        new WebDriverWait(driver, Duration.ofSeconds(60)).until(ExpectedConditions.visibilityOf(myRating));

        myRating.click();

        WebElement numeleTau=driver.findElement(By.cssSelector("input[placeholder='Numele tau']"));
        numeleTau.sendKeys("Noemi");

        WebElement Titlu=driver.findElement(By.cssSelector("input[placeholder='Titlu']"));
        Titlu.sendKeys("Cel mai bun produs");

        WebElement Mesaj=driver.findElement(By.cssSelector("textarea[placeholder='Mesajul']"));
        Mesaj.sendKeys("Multumita de produs.");

        WebElement adaugaParerea=driver.findElement(By.cssSelector("input[type='submit']"));

        new WebDriverWait(driver, Duration.ofSeconds(60)).until(ExpectedConditions.visibilityOf(adaugaParerea));
        adaugaParerea.submit();
    }

}
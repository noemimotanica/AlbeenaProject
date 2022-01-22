package Tests;

import Base.SharedData;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginTest extends SharedData {

    @Test
    public void loginTest() {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        WebElement cont = driver.findElement(By.xpath("//a[contains(@title,'Contul meu')]"));
        cont.click();

        executor.executeScript("window.scrollBy(0,500)");

        WebElement emailElement = driver.findElement(By.cssSelector("input[type='email']"));
        emailElement.clear();

        WebElement passwordElement = driver.findElement(By.cssSelector("input[type='password']"));
        passwordElement.clear();

        emailElement.sendKeys("noemi.pohrib@gmail.com");
        passwordElement.sendKeys("albastru35@");

        WebElement intraInCont = driver.findElement(By.id("Button1"));
        intraInCont.click();

        WebElement produseElement = driver.findElement(By.xpath("//a[contains(text(), 'Produse')]"));
        produseElement.click();

        WebElement adaugaInCosLaptisor = driver.findElement(By.xpath("//a[contains(@title,'Adauga in cos Laptisor de matca pur crud 2% 10-HDA 50 gr')]"));


        executor.executeScript("arguments[0].click();", adaugaInCosLaptisor);

        WebElement inapoiElement = driver.findElement(By.xpath("//a[contains(@href, 'https://www.albeena.ro/produse-apicole')]"));
        inapoiElement.click();

        executor.executeScript("window.scrollBy(0,500)");

        WebElement adaugaInCosTinctura = driver.findElement(By.xpath("//a[contains(@title, 'Adauga in cos Tinctura de propolis 20 ml')]"));
        executor.executeScript("arguments[0].click();", adaugaInCosTinctura);

        cont = driver.findElement(By.xpath("//a[contains(@title,'Contul meu')]"));
        cont.click();
        executor.executeScript("window.scrollBy(0,500)");
        WebElement logOut = driver.findElement(By.xpath("//a[contains(text(), 'Logout')]"));
        logOut.click();

        cont = driver.findElement(By.xpath("//a[contains(@title,'Contul meu')]"));
        cont.click();

        executor.executeScript("window.scrollBy(0,500)");
        emailElement = driver.findElement(By.cssSelector("input[type='email']"));
        emailElement.clear();
        passwordElement = driver.findElement(By.cssSelector("input[type='password']"));
        passwordElement.clear();

        emailElement.sendKeys("noemi.pohrib@gmail.com");
        passwordElement.sendKeys("albastru35@");

        intraInCont = driver.findElement(By.id("Button1"));
        intraInCont.click();

        WebElement cosDeCumparaturi = driver.findElement(By.xpath("//a[contains(@title, 'Cos de cumparaturi')]"));
        cosDeCumparaturi.click();

            /*produseElement.click();

            executor.executeScript("arguments[0].click();", adaugaInCosTinctura);

            inapoiElement = driver.findElement(By.xpath("//a[contains(@href, 'https://www.albeena.ro/produse-apicole')]"));
            inapoiElement.click();

            WebElement adaugaInCosMorningJoy = driver.findElement(By.xpath("//a[contains(@title, 'Adauga in cos Morning joy - mix crema miere si laptisor de matca 200 gr')]"));
            executor.executeScript("arguments[0].click();", adaugaInCosMorningJoy);

             */

    }
}

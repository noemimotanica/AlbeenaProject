package Tests;

import Base.SharedData;
import Pages.*;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginTest extends SharedData {

    @Test
    public void loginTest() {
        //JavascriptExecutor executor = (JavascriptExecutor) driver;
        HomePage homePage = new HomePage(driver);
        ProductsPage productsPage = new ProductsPage(driver);
        CartPage cartPage = new CartPage(driver);
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(driver);
        LoginPage loginPage = new LoginPage(driver);

        // WebElement cont = driver.findElement(By.xpath("//a[contains(@title,'Contul meu')]"));
        // cont.click();

        homePage.clickMyAccountPage();


        //  executor.executeScript("window.scrollBy(0,500)");

        //  WebElement emailElement = driver.findElement(By.cssSelector("input[type='email']"));
        //  emailElement.clear();

        loginPage.clearEmail();

        //  WebElement passwordElement = driver.findElement(By.cssSelector("input[type='password']"));
        // passwordElement.clear();

       loginPage.clearParola();


        //  emailElement.sendKeys("noemi.pohrib@gmail.com");

        loginPage.fillEmail("noemi.pohrib@gmail.com");

        //  passwordElement.sendKeys("albastru35@");

        loginPage.fillParola("albastru35@");

        //  WebElement intraInCont = driver.findElement(By.id("Button1"));
        // intraInCont.click();

        loginPage.clickIntraInCont();

        // WebElement produseElement = driver.findElement(By.xpath("//a[contains(text(), 'Produse')]"));
        // produseElement.click();

        homePage.goToProductsPage();

        // WebElement adaugaInCosLaptisor = driver.findElement(By.xpath("//a[contains(@title,'Adauga in cos Laptisor de matca pur crud 2% 10-HDA 50 gr')]"));
        // executor.executeScript("arguments[0].click();", adaugaInCosLaptisor);

        productsPage.adaugaInCosLaptisor();

        //WebElement inapoiElement = driver.findElement(By.xpath("//a[contains(@href, 'https://www.albeena.ro/produse-apicole')]"));
        // inapoiElement.click();

        // executor.executeScript("window.scrollBy(0,500)");

        cartPage.clickInapoi();

        // WebElement adaugaInCosTinctura = driver.findElement(By.xpath("//a[contains(@title, 'Adauga in cos Tinctura de propolis 20 ml')]"));
        // executor.executeScript("arguments[0].click();", adaugaInCosTinctura);

        productsPage.adaugaInCosTinctura();

        // cont = driver.findElement(By.xpath("//a[contains(@title,'Contul meu')]"));
        // cont.click();

        cartPage.clickMyAccountPage();

        //  executor.executeScript("window.scrollBy(0,500)");
        //  WebElement logOut = driver.findElement(By.xpath("//a[contains(text(), 'Logout')]"));
        //  logOut.click();

        loginPage.clickLogOut();

        //  cont = driver.findElement(By.xpath("//a[contains(@title,'Contul meu')]"));
        //  cont.click();

        loginPage.clickMyAccountPage();

        // executor.executeScript("window.scrollBy(0,500)");
        //  emailElement = driver.findElement(By.cssSelector("input[type='email']"));
        // emailElement.clear();

        loginPage.clearEmail();

        // passwordElement = driver.findElement(By.cssSelector("input[type='password']"));
        // passwordElement.clear();

        loginPage.clearParola();

        //  emailElement.sendKeys("noemi.pohrib@gmail.com");

        loginPage.fillEmail("noemi.pohrib@gmail.com");

        // passwordElement.sendKeys("albastru35@");

        loginPage.fillParola("albastru35@");

        //  intraInCont = driver.findElement(By.id("Button1"));
        //  intraInCont.click();

        loginPage.clickIntraInCont();

        // WebElement cosDeCumparaturi = driver.findElement(By.xpath("//a[contains(@title, 'Cos de cumparaturi')]"));
        // cosDeCumparaturi.click();

        loginPage.clickCartPage();

        //  produseElement.click();

        cartPage.goToProductsPage();

        // executor.executeScript("arguments[0].click();", adaugaInCosTinctura);

        productsPage.adaugaInCosTinctura();

        // inapoiElement = driver.findElement(By.xpath("//a[contains(@href, 'https://www.albeena.ro/produse-apicole')]"));
        //  inapoiElement.click();

        cartPage.clickInapoi();

        //   WebElement adaugaInCosMorningJoy = driver.findElement(By.xpath("//a[contains(@title, 'Adauga in cos Morning joy - mix crema miere si laptisor de matca 200 gr')]"));
        //    executor.executeScript("arguments[0].click();", adaugaInCosMorningJoy);

        productsPage.adaugaInCosMorningJoy();


    }
}


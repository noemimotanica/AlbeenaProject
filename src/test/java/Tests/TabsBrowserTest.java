package Tests;

import Pages.*;
import PropertyUtility.PropertyFile;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.ArrayList;
import java.util.List;

import static java.sql.DriverManager.getDriver;

public class TabsBrowserTest {
    private WebDriver driver;

    @Test
    public void EdgeDriver() {


        HomePage homePage = new HomePage(getDriver());
        CartPage cartPage = new CartPage(getDriver());
        LoginPage loginPage = new LoginPage(getDriver());
        ProductsPage productsPage = new ProductsPage(getDriver());
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(getDriver());

        PropertyFile driverResource = new PropertyFile("DriverResource");
        //specificam unde se afla driverul pt browser
        System.setProperty(driverResource.getValue("driverBrowserEdge"), driverResource.getValue("locationEdge"));


        driver = new EdgeDriver();
        driver.manage().window().maximize();



        driver.get(driverResource.getValue("url"));
        homePage.clickMyAccountPage();
        loginPage.fillEmail("noemi.pohrib@gmail.com");
        loginPage.fillParola("albastru35@");
        loginPage.clickIntraInCont();
        loginPage.goToProductsPage();
        productsPage.adaugaInCosLaptisor();


        driver.switchTo().newWindow(WindowType.TAB);
        driver.get(driverResource.getValue("url"));
        homePage.clickMyAccountPage();
        loginPage.fillEmail("noemi.pohrib@gmail.com");
        loginPage.fillParola("albastru35@");
        loginPage.clickIntraInCont();
        loginPage.goToProductsPage();
        productsPage.adaugaInCosLaptisor();


        List<String> tabs = new ArrayList<>(driver.getWindowHandles());

        driver.switchTo().window(tabs.get(0));


    }

    public WebDriver getDriver(){
        return driver;
    }
}








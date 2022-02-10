package Tests;

import ExtentUtility.ExtentReportTest;
import Pages.*;
import PropertyUtility.PropertyFile;
import com.aventstack.extentreports.Status;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.ArrayList;
import java.util.List;


public class TabsBrowserTest {
    private WebDriver driver;
    protected ExtentReportTest report;

    @Test
    public void EdgeDriver() {

        String testName = this.getClass().getSimpleName();
        report = new ExtentReportTest(testName + "Report");

        PropertyFile driverResource = new PropertyFile("DriverResource");
        //specificam unde se afla driverul pt browser
        System.setProperty(driverResource.getValue("driverBrowserEdge"), driverResource.getValue("locationEdge"));
        driver = new EdgeDriver();
        driver.manage().window().maximize();

        HomePage homePage = new HomePage(driver);
        CartPage cartPage = new CartPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        ProductsPage productsPage = new ProductsPage(driver);
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(driver);

        driver.get(driverResource.getValue("url"));
        homePage.clickMyAccountPage();
        report.logger.log(Status.PASS, "Click My Account Page");
        loginPage.fillEmail("noemi.pohrib@gmail.com");
        report.logger.log(Status.PASS, "Fill Email");
        loginPage.fillParola("albastru35@");
        report.logger.log(Status.PASS, "Fill Parola");
        loginPage.clickIntraInCont();
        report.logger.log(Status.PASS, "Click intra in cont");
        loginPage.goToProductsPage();
        report.logger.log(Status.PASS, "Go to Products Page");
        productsPage.adaugaInCosLaptisor();
        report.logger.log(Status.PASS, "Adauga in cos Laptisor");
        cartPage.clickMyAccountPage();
        report.logger.log(Status.PASS, "Click My Account Page");
        loginPage.clickLogOut();
        report.logger.log(Status.PASS, "Click Log Out");

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get(driverResource.getValue("url"));
        homePage.clickMyAccountPage();
        report.logger.log(Status.PASS, "Click My Account Page");
        loginPage.fillEmail("noemi.pohrib@gmail.com");
        report.logger.log(Status.PASS, "Fill Email");
        loginPage.fillParola("albastru35@");
        report.logger.log(Status.PASS, "Fill Parola");
        loginPage.clickIntraInCont();
        report.logger.log(Status.PASS, "Click intra in cont");
        loginPage.clickCartPage();
        report.logger.log(Status.PASS, "Click Cart Page");

        List<String> tabs = new ArrayList<>(driver.getWindowHandles());

        driver.switchTo().window(tabs.get(0));

        report.generateReport();
    }
}








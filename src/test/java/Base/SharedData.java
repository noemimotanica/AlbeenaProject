package Base;

import ExtentUtility.ExtentReportTest;
import PropertyUtility.PropertyFile;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SharedData {

    private WebDriver driver;
    protected ExtentReportTest report;

    @Before
    public void setUp() {

        PropertyFile driverResource = new PropertyFile("DriverResource");
        //specificam unde se afla driverul pt browser
        System.setProperty(driverResource.getValue("driverBrowser"), driverResource.getValue("location"));
        driver = new EdgeDriver();
        driver.get(driverResource.getValue("url"));
        driver.manage().window().maximize();

        driver = new ChromeDriver();
        driver.get(driverResource.getValue("url"));
        driver.manage().window().maximize();

        String testName = this.getClass().getSimpleName();
        report = new ExtentReportTest(testName + "Report");
    }
    public WebDriver getDriver(){
        return driver;
    }
    @After
    public void after() {
        report.generateReport();
        driver.quit();
    }
}
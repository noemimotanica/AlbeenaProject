package Base;

import PropertyUtility.PropertyFile;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SharedData {

    public WebDriver driver;

    @Before
    public void setUp() {

        PropertyFile driverResource = new PropertyFile("DriverResource");
        //specificam unde se afla driverul pt browser
        System.setProperty(driverResource.getValue("driverBrowser"), driverResource.getValue("location"));

        driver = new ChromeDriver();
        driver.get(driverResource.getValue("url"));
        driver.manage().window().maximize();
    }

    @After
    public void after() {
        //driver.quit();
    }
}
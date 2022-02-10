package ExtentUtility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportTest {
    public ExtentHtmlReporter htmlReporter;
    public ExtentReports extent;
    public ExtentTest logger;

    public ExtentReportTest(String name) {
        prepareReport(name);
    }

    public void prepareReport(String name) {
        htmlReporter = new ExtentHtmlReporter("target/Reports/" + name + ".html");
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
        extent.setSystemInfo("Host Name", "SoftwareTestingMaterial");
        extent.setSystemInfo("Environment", "Albeena Project");
        extent.setSystemInfo("User Name", "Noemi Pohrib");
        htmlReporter.config().setDocumentTitle("Albeena");
        htmlReporter.config().setReportName("Albeena Project Report");
        htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
        htmlReporter.config().setTheme(Theme.DARK);
        logger = extent.createTest(name);
    }

    public void generateReport() {
        extent.flush();
    }
}
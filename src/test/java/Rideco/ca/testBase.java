package Rideco.ca;

// testNG framework, by using testNg annotations
// @BeforeTest,@BeforeMethod
import Rideco.ca.Utilities.BrowserUtils;
import Rideco.ca.Utilities.ConfigurationReader;
import Rideco.ca.Utilities.Driver;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class testBase {
    protected WebDriver driver;
    protected Actions actions;
    protected WebDriverWait wait;
    protected ExtentReports report;
    //this class is used to create HTML report file
    protected ExtentHtmlReporter htmlReporter;
    //this will  define a test, enables adding logs, authors, test steps
    protected ExtentTest extentLogger;

    @BeforeTest
    public void setUpTest() {
        //initialize the class
        report = new ExtentReports();

        //create a report path
        String projectPath = System.getProperty("user.dir");
        String path = projectPath + "/test-output/report.html";

        //initialize the html reporter with the report path
        htmlReporter = new ExtentHtmlReporter(path);

        //attach the html report to report object
        report.attachReporter(htmlReporter);

        //title in report
        htmlReporter.config().setReportName("QA Screener Test");

        //set environment information
        report.setSystemInfo("Environment", "QA");
        report.setSystemInfo("Browser", ConfigurationReader.get("browser"));
        report.setSystemInfo("OS", System.getProperty("os.name"));

    }

    @BeforeMethod
    public void setUp() {
        driver = Driver.get();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        actions = new Actions(driver);
        wait = new WebDriverWait(driver, 10);
        driver.get(ConfigurationReader.get("url"));

    }

    //ITestResult class describes the result of a test in TestNG
    @AfterMethod
    public void tearDown(ITestResult result) throws InterruptedException, IOException {
        //if test fails
        if (result.getStatus() == ITestResult.FAILURE) {
            //record the name of failed test case
            extentLogger.fail(result.getName());

            //take the screenshot and return location of screenshot
            String screenShotPath = BrowserUtils.getScreenshot(result.getName());

            //add your screenshot to your report
            extentLogger.addScreenCaptureFromPath(screenShotPath);

            //capture the exception and put inside the report
            extentLogger.fail(result.getThrowable());
        }
        Thread.sleep(2000);
        Driver.closeDriver();
    }

    @AfterTest
    public void tearDownTest() {
        //this is when the report is actually created
        report.flush();
    }

}

// Annotations of TestNG
//    @BeforeClass
//    public void beforeClass() {
//        driver = Driver.get();
//        String url = ConfigurationReader.get("url");
//        driver.get(url);
//
//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//        // define report here
//        System.out.println("Before Class is working");
//    }
//
//    @AfterClass
//    public void afterClass() {
//        Driver.closeDriver();
//        // closing the report and quitting
//        System.out.println("After Class is working");
//    }
//
//    @BeforeMethod
//    public void beforeMethod(){
//        // setup the driver
//        //WebDriverManager.chromedriver().setup();
//        //driver = new ChromeDriver();
//        System.out.println("Before Method is working");
//    }
//
//    @AfterMethod
//    // screenshot and close the driver
//    public void afterMethod(){
//        //driver.close();
//        System.out.println("After Method is working");



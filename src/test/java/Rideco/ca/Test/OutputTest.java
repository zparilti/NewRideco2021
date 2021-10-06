package Rideco.ca.Test;

import Rideco.ca.Page.MainPage;
import Rideco.ca.testBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OutputTest extends testBase {

    @Test
    public void verifyOutputisUnique(){
        extentLogger = report.createTest("Unique");
        MainPage newMainPage = new MainPage();
        Assert.assertTrue(newMainPage.unique(70));
        extentLogger.info("Output is Unique");

    }

    @Test
    public void verifyOutputisConsistent(){
        extentLogger = report.createTest("Consistent");
        MainPage newMainPage = new MainPage();
        Assert.assertTrue(newMainPage.consistent(3,90));
        extentLogger.info("Output is Consistent");
    }

    @Test
    public void verifyOutputisScrambled(){
        extentLogger = report.createTest("Scrambled");
        MainPage newMainPage = new MainPage();
        Assert.assertFalse(newMainPage.scramble(7,12));
        extentLogger.info("Output is Scrambled");

    }
}

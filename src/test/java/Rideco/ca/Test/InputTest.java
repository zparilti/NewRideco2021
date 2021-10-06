package Rideco.ca.Test;

import Rideco.ca.Page.MainPage;
import Rideco.ca.testBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InputTest extends testBase {

    @Test
    public void verifyInputNumber(){
        extentLogger = report.createTest("input number");

        MainPage newMainPage = new MainPage();
        extentLogger.info("input number is correct");
        Assert.assertTrue(newMainPage.isInputNumber("5"));
        Assert.assertTrue(newMainPage.isInputNumber("-5"));
        // When we send a number we expect to get some output so we assert as assertTrue,
        // expected result is True and it returns some output and the actual result is True so
        // the testing passes.
    }

    @Test
    public void verifyInputAlphabet(){
        extentLogger = report.createTest("Input Alphabet");
        MainPage newMainPage = new MainPage();
        extentLogger.info("input alphabet is verified");
        Assert.assertFalse(newMainPage.isInputNumber("p")); // THE BUG - error
        // When we send an alphabet we don't expect to get any output so we assert as assertFalse,
        // expected result is false but it returns an output and the actual result is True so
        // the testing gives error which means it is a bug.
    }

    @Test
    public void verifyInputNonAlphaNumeric(){
        extentLogger = report.createTest("Input Alphaumberic");
        MainPage newMainPage = new MainPage();
        Assert.assertFalse(newMainPage.isInputNumber("$")); // THE BUG -
        extentLogger.info("input is Alphaumberic");
        Assert.assertFalse(newMainPage.isInputNumber(" ")); // THE BUG -
        // When we send a non-alphanumeric we don't expect to get any output so we assert as assertFalse,
        // expected result is false but it returns an output and the actual result is True so
        // the testing gives error which means it is a bug too.
    }

}

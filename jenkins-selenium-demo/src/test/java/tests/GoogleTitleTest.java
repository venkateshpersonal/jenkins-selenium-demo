package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTitleTest {
    private WebDriver driver;

    @BeforeMethod
    public void setUp() {
        // Selenium Manager finds and configures the compatible Chrome driver.
        driver = new ChromeDriver();
    }

    @Test
    public void verifyGoogleTitle() {
        driver.get("https://www.google.com");

        Assert.assertEquals(driver.getTitle(), "Google");
    }

    //modification line to retest
    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
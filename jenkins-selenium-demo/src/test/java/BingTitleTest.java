package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BingTitleTest {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
    }

    @Test
    public void verifyBingTitle() {
        driver.get("https://www.bing.com");

        String actualTitle = driver.getTitle();

        Assert.assertEquals(actualTitle, "Bing");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
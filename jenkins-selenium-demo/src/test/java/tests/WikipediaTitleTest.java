package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WikipediaTitleTest {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
    }

    @Test
    public void verifyWikipediaTitle() {
        driver.get("https://www.wikipedia.org/");

        String actualTitle = driver.getTitle();

        Assert.assertEquals(actualTitle, "Wikipedia");
    }

    //new build trigger test
    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
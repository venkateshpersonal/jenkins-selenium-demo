package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ExampleTitleTest {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
    }

    @Test
    public void verifyExampleTitle() {
        driver.get("https://example.com");

        String actualTitle = driver.getTitle();

Assert.assertEquals(actualTitle, "Wrong Title");    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
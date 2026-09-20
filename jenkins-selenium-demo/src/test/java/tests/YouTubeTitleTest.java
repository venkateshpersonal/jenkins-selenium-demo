package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class YouTubeTitleTest {

    @Test
    public void verifyYouTubeTitle() {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.youtube.com/");

        Assert.assertTrue(
                driver.getTitle().contains("YouTube")
        );

        driver.quit();
    }
}
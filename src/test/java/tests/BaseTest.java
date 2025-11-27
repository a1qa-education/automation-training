package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.Browser;

import java.time.Duration;

public abstract class BaseTest {
    protected static final String URL = "https://the-internet.herokuapp.com/";
    protected WebDriver driver;

    @BeforeMethod
    public void setup() {
        Browser.getInstance().get(URL);
    }

    @AfterMethod
    public void teardown() {
        Browser.quitDriver();
    }
}
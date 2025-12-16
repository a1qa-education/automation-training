package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
    private static WebDriver driverInstance = null;

    public static WebDriver getInstance() {
        if (driverInstance == null) {
            driverInstance = new ChromeDriver();
            driverInstance.manage().window().maximize();
        }
        return driverInstance;
    }

    public static void quitDriver(){
        driverInstance.quit();
        driverInstance = null;
    }
}
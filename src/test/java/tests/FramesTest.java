package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FramesTest extends BaseTest {
    private final By frames = By.xpath(String.format(PRECISE_TEXT_XPATH, "Frames"));
    private final By nestedFrames = By.xpath(String.format(PRECISE_TEXT_XPATH, "Nested Frames"));
    private final By middleFrame = By.xpath(String.format(PRECISE_TEXT_XPATH, "MIDDLE"));
    private final By leftFrame = By.xpath(String.format(PARTICULAR_TEXT_XPATH, "LEFT"));
    private final String topFrameName = "frame-top";
    private final String middleFrameName = "frame-middle";
    private final String leftFrameName = "frame-left";

    @Test
    public void framesTest() {
        driver.findElement(frames).click();
        driver.findElement(nestedFrames).click();
        //to access 'left' and 'middle' frames we need to switch to 'top' frame
        driver.switchTo().frame(topFrameName);
        //todo: switch to a middle frame

        driver.switchTo().parentFrame();
        //todo: switch to a left frame

        Assert.assertTrue(driver.findElement(leftFrame).isDisplayed(), "LEFT is not displayed");
        //todo: switch to a default context,
        // navigate back
        // and check that `nested frames` button is displayed

        driver.navigate().back();

    }
}
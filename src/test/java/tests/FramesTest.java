package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import static utils.XpathTemplates.PARTICULAR_TEXT_XPATH;
import static utils.XpathTemplates.PRECISE_TEXT_XPATH;

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
        //для доступа к 'left' и 'middle' фреймам нам нужно сперва переключиться на 'top' фрейм
        driver.switchTo().frame(topFrameName);
        //todo: переключиться на middle фрейм

        driver.switchTo().parentFrame();
        //todo: переключиться на left фрейм

        Assert.assertTrue(driver.findElement(leftFrame).isDisplayed(), "LEFT is not displayed");
        //todo: переключиться на контекст по умолчанию (default context),
        // перейти назад
        // проверить что ссылка `nested frames` отображается
    }
}
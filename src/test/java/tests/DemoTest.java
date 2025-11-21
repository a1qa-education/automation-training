package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTest extends BaseTest{
    private final By addRemoveElement = By.xpath(String.format(PRECISE_TEXT_XPATH, "Add/Remove Elements"));
    private final By addElementBtn = By.xpath("//*[@onclick='addElement()']");
    private final By removeElementBtn = By.xpath("//*[@onclick='deleteElement()']");

    @Test
    public void addRemoveElementTest() {
        driver.findElement(addRemoveElement).click();
        driver.findElement(addElementBtn).click();
        Assert.assertFalse(driver.findElements(removeElementBtn).isEmpty(), "Element is not present on the page");
        Assert.assertTrue(driver.findElement(removeElementBtn).isDisplayed(), "Element is not displayed on the page");

        driver.findElement(addElementBtn).click();
        driver.findElement(addElementBtn).click();
        driver.findElement(addElementBtn).click();
        //should fail as we have 4 elements
        //to fix add a line of code to click on any removeElementBtn
        Assert.assertEquals(driver.findElements(removeElementBtn).size(), 3, "A wrong number of buttons on the page");
    }
}

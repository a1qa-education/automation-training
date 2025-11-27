package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AddRemovePage;

public class DemoTest extends BaseTest{
    private AddRemovePage addRemovePage = new AddRemovePage();
    private final int expectedNumberOfButtons = 4;

    @Test
    public void addRemoveElementTest() {
        //mainPage.clickNavigationLink(ADD_REMOVE_ELEMENTS);
        addRemovePage.clickAddElementBtn();
        Assert.assertTrue(addRemovePage.isRemoveBtnExist(), "Remove element button did not appear on the page");
        Assert.assertTrue(addRemovePage.isRemoveBtnDisplayed(), "Remove element button is not displayed");

        addRemovePage.clickAddElementBtn();
        addRemovePage.clickAddElementBtn();
        addRemovePage.clickAddElementBtn();

        Assert.assertEquals(addRemovePage.getCountRemoveElementBtn(), expectedNumberOfButtons, "There's a wrong number of buttons on the page");
    }
}

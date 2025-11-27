package tests;

import enums.NavigationLinks;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AddRemovePage;
import pages.MainPage;

public class DemoTest extends BaseTest{
    private final AddRemovePage addRemovePage = new AddRemovePage();
    private final MainPage mainPage = new MainPage();
    private static final int EXPECTED_NUMBER_OF_BUTTONS = 4;

    @Test
    public void addRemoveElementTest() {
        Assert.assertTrue(mainPage.waitForPageToOpen(), "Page is not open");
        mainPage.clickNavigationLink(NavigationLinks.ADD_REMOVE_ELEMENT);
        Assert.assertTrue(addRemovePage.isPageOpen(), "Page is not open");
        addRemovePage.clickAddElementBtn();
        Assert.assertTrue(addRemovePage.isRemoveBtnExist(), "Remove element button did not appear on the page");
        Assert.assertTrue(addRemovePage.isRemoveBtnDisplayed(), "Remove element button is not displayed");

        addRemovePage.clickAddElementBtn();
        addRemovePage.clickAddElementBtn();
        addRemovePage.clickAddElementBtn();

        Assert.assertEquals(addRemovePage.getCountRemoveElementBtn(), EXPECTED_NUMBER_OF_BUTTONS, "There's a wrong number of buttons on the page");
    }
}

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
        Assert.assertTrue(mainPage.waitForPageToOpen(), "Страница не открыта");
        mainPage.clickNavigationLink(NavigationLinks.ADD_REMOVE_ELEMENT);
        Assert.assertTrue(addRemovePage.isPageOpen(), "Страница не открыта");
        addRemovePage.clickAddElementBtn();
        Assert.assertTrue(addRemovePage.isRemoveBtnExist(), "Кнопка Remove element не появилась на странице");
        Assert.assertTrue(addRemovePage.isRemoveBtnDisplayed(), "Кнопка Remove element не отображается на странице");

        addRemovePage.clickAddElementBtn();
        addRemovePage.clickAddElementBtn();
        addRemovePage.clickAddElementBtn();

        Assert.assertEquals(addRemovePage.getCountRemoveElementBtn(), EXPECTED_NUMBER_OF_BUTTONS, "Некорректное количество элементов на странице");
    }
}

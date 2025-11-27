package pages;

import org.openqa.selenium.By;
import utils.Browser;
import utils.WaitUtils;

public class BasePage {
    private final By uniqueElementLocator;

    public BasePage(By uniqueElementLocator) {
        this.uniqueElementLocator = uniqueElementLocator;
    }

    public boolean isPageOpen(){
        return !Browser.getInstance().findElements(uniqueElementLocator).isEmpty();
    }

    public boolean waitForPageToOpen(){
        return WaitUtils.waitForElementDisplayed(uniqueElementLocator).isDisplayed();
    }
}
package pages;

import enums.NavigationLinks;
import org.openqa.selenium.By;
import utils.Browser;
import utils.XpathTemplates;

public class MainPage {
    private By uniqueElementLocator = null;

    public MainPage(By uniqueElementLocator) {
        this.uniqueElementLocator = uniqueElementLocator;
    }

    public void clickNavigationLink(NavigationLinks navigationLink){
        Browser.getInstance().findElement(
                By.xpath(
                        String.format(XpathTemplates.PRECISE_TEXT_XPATH, navigationLink.navigationText()))).click();
    }

    public boolean isPageOpen(){
        return !Browser.getInstance().findElements(uniqueElementLocator).isEmpty();
    }
}

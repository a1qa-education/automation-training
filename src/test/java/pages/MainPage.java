package pages;

import enums.NavigationLinks;
import org.openqa.selenium.By;
import utils.Browser;
import utils.XpathTemplates;

public class MainPage extends BasePage {

    public MainPage() {
        super(By.xpath(String.format(XpathTemplates.PRECISE_TEXT_XPATH, "Welcome to the-internet")));
    }

    public void clickNavigationLink(NavigationLinks navigationLink){
        Browser.getInstance().findElement(
                By.xpath(
                        String.format(XpathTemplates.PRECISE_TEXT_XPATH, navigationLink.navigationText()))).click();
    }
}

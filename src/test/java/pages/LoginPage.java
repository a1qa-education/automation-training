package pages;

import org.openqa.selenium.By;
import utils.Browser;
import utils.XpathTemplates;

public class LoginPage extends BasePage{
    private final By usernameInput = By.id("username");
    private final By passwordInput = By.id("password");
    private final By loginButton = By.xpath("//i[contains(@class, 'fa-sign-in')]");
    private final By successfulLoginMessage = By.xpath(String.format(XpathTemplates.PARTICULAR_TEXT_XPATH, "You logged into a secure area!"));
    private final By unsuccessfulLoginMessage = By.xpath(String.format(XpathTemplates.PARTICULAR_TEXT_XPATH, "Your username is invalid!"));

    public LoginPage (){
        super(By.id("username"));
    }

    public void sendTextToUsernameInput(String username){
        Browser.getInstance().findElement(usernameInput).sendKeys(username);
    }

    public void sendTextToPasswordInput(String password){
        Browser.getInstance().findElement(passwordInput).sendKeys(password);
    }

    public void clickLoginButton(){
        Browser.getInstance().findElement(loginButton).click();
    }

    public boolean isSuccessMessageDisplayed(){
        return !Browser.getInstance().findElements(successfulLoginMessage).isEmpty();
    }

    public boolean isFailureMessageDisplayed(){
        return !Browser.getInstance().findElements(unsuccessfulLoginMessage).isEmpty();
    }
}
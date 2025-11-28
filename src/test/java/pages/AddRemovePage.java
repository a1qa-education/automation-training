package pages;

import org.openqa.selenium.By;
import utils.Browser;

public class AddRemovePage extends BasePage{
    private final By addElementBtn = By.xpath("//*[@onclick='addElement()']");
    private final By removeElementBtn = By.xpath("//*[@onclick='deleteElement()']");

    public AddRemovePage (){
        super(By.xpath("//*[@onclick='addElement()']"));
    }

    public void clickAddElementBtn(){
        Browser.getInstance().findElement(addElementBtn).click();
    }

    public int getCountRemoveElementBtn(){
        return Browser.getInstance().findElements(removeElementBtn).size();
    }

    public boolean isRemoveBtnExist(){
        return !Browser.getInstance().findElements(removeElementBtn).isEmpty();
    }

    public boolean isRemoveBtnDisplayed(){
        return Browser.getInstance().findElement(removeElementBtn).isDisplayed();
    }
}
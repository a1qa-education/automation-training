package pages;

import org.openqa.selenium.By;
import utils.Browser;

public class AddRemovePage extends MainPage{
    private final By addElementBtn = By.xpath("//*[@onclick='addElement()']");
    private final By removeElementBtn = By.xpath("//*[@onclick='deleteElement()']");

    public AddRemovePage (){
        super(By.xpath("//*[@onclick='addElement()']"));
    }

    public void clickAddElementBtn(){
        Browser.getInstance().findElement(addElementBtn).click();
    }

    public void clickRemoveElementBtn(){
        Browser.getInstance().findElement(removeElementBtn).click();
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
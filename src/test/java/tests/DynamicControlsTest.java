package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static utils.XpathTemplates.PRECISE_TEXT_XPATH;

public class DynamicControlsTest extends BaseTest {
    private final By dynamicControls = By.xpath(String.format(PRECISE_TEXT_XPATH, "Dynamic Controls"));
    private final By enable = By.xpath(String.format(PRECISE_TEXT_XPATH, "Enable"));

    @Test
    public void dynamicControlsTest() {
        driver.findElement(dynamicControls).click();
        driver.findElement(enable).click();
        // todo: ассерт с проверкой того что поле ввода enabled
        // todo: отправить в поле ввода случайно сгенерированный текст (например, UUID)
        // todo: ассерт с проверкой того, что текст отображается
    }
}

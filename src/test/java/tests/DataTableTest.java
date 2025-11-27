package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static utils.XpathTemplates.PRECISE_TEXT_XPATH;

public class DataTableTest extends BaseTest {
    private final By sortableDataTables = By.xpath(String.format(PRECISE_TEXT_XPATH, "Sortable Data Tables"));

    @Test
    public void dataTableTest() {
        driver.findElement(sortableDataTables).click();
        // todo: добавить проверку суммы в столбце
    }
}

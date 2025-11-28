package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.AddRemovePage;

public class AddRemovePageSteps {
    private final AddRemovePage addRemovePage = new AddRemovePage();

    @When("пользователь нажимает на кнопку Add button")
    public void clickAddButton() {
        addRemovePage.clickAddElementBtn();
    }

    @Then("на странице отображена кнопка Remove button")
    public void removeButtonDisplayed() {
        Assert.assertTrue(addRemovePage.isRemoveBtnDisplayed(), "remove button is not displayed");
    }
}

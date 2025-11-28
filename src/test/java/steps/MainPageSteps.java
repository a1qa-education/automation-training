package steps;
import enums.NavigationLinks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.MainPage;

public class MainPageSteps {
    private final MainPage mainPage = new MainPage();

    @Given("главная страница открыта")
    public void openLoginPage() {
        Assert.assertTrue(mainPage.waitForPageToOpen(), "Page is not open");
    }

    @When("пользователь нажимает на ссылку {string}")
    public void userClicksNavigationButton(String navigationLinkName) {
        mainPage.clickNavigationLink(NavigationLinks.fromText(navigationLinkName));
    }
}

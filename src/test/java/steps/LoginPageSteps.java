package steps;

import enums.LoginStatus;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.LoginPage;

import java.util.List;
import java.util.Map;

public class LoginPageSteps {
    private final LoginPage loginPage = new LoginPage();

    @When("пользователь указывает логин {string}")
    public void enterLogin(String login) {
        loginPage.sendTextToUsernameInput(login);
    }

    @When("пользователь указывает пароль {string}")
    public void enterPassword(String password) {
        loginPage.sendTextToPasswordInput(password);
    }

    @When("пользователь нажимает на кнопку Login")
    public void clickLoginButton() {
        loginPage.clickLoginButton();
    }

    @Then("сообщение о {status} логине отображается")
    public void verifyLoginStatus(LoginStatus status) {
        switch (status) {
            case SUCCESS:
                Assert.assertTrue(loginPage.isSuccessMessageDisplayed(), "Сообщение об успешном логине не отображено");
                break;
            case FAILURE:
                Assert.assertFalse(loginPage.isFailureMessageDisplayed(), "Сообщение о неуспешном логине не отображено");
                break;
        }
    }

    @When("пользователь вводит учетные данные")
    public void пользовательВводитУчетныеДанные(DataTable dataTable) {
        List<Map<String, String>> rows = dataTable.asMaps(String.class, String.class);
        if (rows.isEmpty()) {
            throw new IllegalArgumentException("Таблица учетных данных пуста");
        }
        Map<String, String> creds = rows.get(0);

        loginPage.sendTextToUsernameInput(creds.get("login"));
        loginPage.sendTextToPasswordInput(creds.get("password"));
    }
}
package steps;

import enums.LoginStatus;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.LoginPage;

public class LoginPageSteps {
    private LoginPage loginPage = new LoginPage();

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
                Assert.assertTrue(loginPage.isSuccessMessageDisplayed(), "Сообщение об успешном логине не отображено");// check success message
                break;
            case FAILURE:
                Assert.assertFalse(loginPage.isFailureMessageDisplayed(), "Сообщение о неуспешном логине не отображено");// check success message
                break;
        }
    }
}
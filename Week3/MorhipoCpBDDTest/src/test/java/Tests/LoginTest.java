package Tests;

import Base.BaseTest;
import Pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Test;

public class LoginTest extends BaseTest {

    LoginPage loginPage = new LoginPage();

    @Test
    @Given("^I open chrome and launch website$")
    public void pageload() {
        loginPage.Setup();
    }

    @Test
    @When("^I click login button$")
    public void clickLoginButton() {
        loginPage.clickLoggingButton();
    }

    @Test
    @And("I enter {string} and {string}")
    public void ıEnterAnd(String userName, String password) throws InterruptedException {
        loginPage.enterUsernameAndPassword(userName, password);
        Thread.sleep(3000);
    }

    @Test
    @Then("I should see {string}")
    public void ıShouldSee(String message) {
        {
            loginPage.assertLogin(message);
            driver.quit();
        }
    }
}

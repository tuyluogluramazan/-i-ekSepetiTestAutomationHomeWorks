package Tests;

import Base.BaseTest;
import Pages.FavoritePage;
import Pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Test;

public class HomepageTest extends BaseTest {
    HomePage homePage = new HomePage();
    FavoritePage favoritePage=new FavoritePage();

    @Test
    @When("^I click searchbox$")
    public void clickSearchBox() {
        homePage.clickSearchBox();
    }

    @Test
    @And("I enter {string} and search")
    public void ıEnterAndSearch(String product) throws InterruptedException {
        homePage.searchProduct(product);
    }
    @Test
    @Then("I should see {string} on the page")
    public void ıShouldSeeOnThePage(String text1) {
        homePage.assertProduct(text1);
        driver.quit();
    }

}
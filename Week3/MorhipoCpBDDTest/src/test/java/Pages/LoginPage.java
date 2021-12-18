package Pages;

import Base.BaseTest;
import Constants.Constants;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static Constants.Constants.*;


public class LoginPage extends BaseTest {

    public void clickLoggingButton() {
        WebElement element = driver.findElement(By.xpath(myAccount));
        Actions builder = new Actions(driver);
        builder.moveToElement(element).perform();
        driver.findElement(By.cssSelector(clickLoggingButton)).click();
    }

    public void enterUsernameAndPassword(String userName, String password) {
        driver.findElement(By.id(Constants.userName)).sendKeys(userName);
        driver.findElement(By.id(Constants.password)).sendKeys(password);
        driver.findElement(By.id(Constants.password)).sendKeys(Keys.ENTER);

    }

    public void assertLogin(String message) {
        String text = driver.findElement(By.xpath(assertLogin)).getText();
        Assert.assertEquals(text, message);

    }
}

package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static Base.BaseTest.driver;
import static Constants.Constants.*;
import static org.junit.Assert.assertTrue;

public class HomePage {
    public void clickSearchBox()  {
        driver.findElement(By.id(searchProduct)).click();

    }

    public void searchProduct(String product) {
        driver.findElement(By.id(searchProduct)).sendKeys(product);
        driver.findElement(By.id(searchProduct)).sendKeys(Keys.ENTER);

    }

    public void assertProduct(String text1) {
        String text = driver.findElement(By.id(assertProduct)).getText();
        assertTrue(text.equalsIgnoreCase(text1));
    }


}

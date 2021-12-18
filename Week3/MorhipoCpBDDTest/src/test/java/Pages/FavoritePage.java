package Pages;

import Base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;


import static Constants.Constants.*;
import static org.junit.Assert.assertNotEquals;

public class FavoritePage extends BaseTest {

    public void searchProduct(String product) {
        driver.findElement(By.id(searchProduct)).sendKeys(product);
        driver.findElement(By.id(searchProduct)).sendKeys(Keys.ENTER);
    }

    public void addToFavorite() {
        driver.findElement(By.xpath(addToFavorite)).click();
    }
    public void goToFavorites() {

        driver.findElement(By.id(goToFavorites)).click();
    }
    public void assertFavorite() {
        String text = driver.findElement(By.xpath(assertFavorite)).getText();
        assertNotEquals(text, "");
    }

}

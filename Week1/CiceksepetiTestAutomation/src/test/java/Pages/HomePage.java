package Pages;

import Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static Constants.Constants.*;

public class HomePage extends BasePage {
    public void homePageTestOne (){
        //Click The SearchBox
        clickElement(By.cssSelector(searchButtonText));
        //Click The SearchBox
        clickElement(By.cssSelector(searchButtonFormControl));
        //Type to Address
        sendKeys(By.cssSelector(searchButtonFormControl),address);
        //Click to Address
        clickElement(By.xpath(adress));

    }
    public void homePageTestTwo (){
        //Click to Category
        clickElement(By.linkText(category));
        //Click to Filter
        clickElement(By.cssSelector(productFilter));
        //Click to Product
        clickElement(By.cssSelector(productItem));
        //Add To Basket
        clickElement(By.cssSelector(addToBasket));

    }

}

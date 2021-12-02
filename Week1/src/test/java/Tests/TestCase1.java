package Tests;

import Base.BaseTest;
import Pages.HomePage;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;


public class TestCase1 extends BaseTest {
    //Create Page Object
    HomePage homePage = new HomePage();
    @Test
    public void changeAddress(){
        //Call The Function
        homePage.homePageTestOne();
        //Validate to Test
        String shippingAdress = driver.findElement(By.cssSelector(".district-search-button__text")).getText();
        Assert.assertEquals("Rasimpaşa, Kadıköy Sahili, Kadıköy/İstanbul, Türkiye",shippingAdress);
    }
    @Test
    public void addToBasket(){
        //Call The Function
        homePage.homePageTestTwo();
        //Validate to Test
        String text = driver.findElement(By.cssSelector(".order-summary__heading")).getText();
        Assert.assertEquals("Sipariş Özeti",text );
    }

}

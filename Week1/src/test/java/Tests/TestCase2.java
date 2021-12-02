package Tests;

import Base.BaseTest;
import Pages.LoginPage;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class TestCase2 extends BaseTest {
    LoginPage loginPage = new LoginPage();


    @Test
    public void logInAccount() throws InterruptedException {
        //Mouse Over
        {
            WebElement element = driver.findElement(By.xpath("//div[@class=\'header__right-col\']//a[@href=\'javascript:void(0);\']/span[@class=\'user-menu__title\']"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        Thread.sleep(2000);
        //Call The Functions
        loginPage.loginPageOne();
        WebElement  element =driver.findElement(By.xpath("//div[@class='header__right-col']//a[@href='/logout']"));
        //Validate to Test
        String title= element.getAttribute("title");
        Assert.assertEquals("Çıkış" ,title);
    }

    @Test
    public void changePassword() throws InterruptedException {
        //Mouse Over
        {
            WebElement element = driver.findElement(By.xpath("//div[@class=\'header__right-col\']//a[@href=\'javascript:void(0);\']/span[@class=\'user-menu__title\']"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        Thread.sleep(2000);

        //Call The Functions
        loginPage.loginPagetwo();
        //Validate to Test
        String alertMessage=driver.findElement(By.xpath("//li[.='Eski şifre hatalı.']")).getText();
        Assert.assertEquals( "Eski şifre hatalı.",alertMessage);
    }
}

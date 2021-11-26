package Pages;

import Base.BasePage;
import org.junit.Assert;
import org.openqa.selenium.By;

import static Constants.Constants.*;

public class LoginPage extends BasePage {

    public void loginPageOne()
    {
        //Click to MemberShipLogin Button
        clickElement(By.linkText(memberShipLogin));
        //Click to E-mail Address Area
        clickElement(By.id(eMail));
        //Type to E-mail Address
        sendKeys(By.id(eMail),email);
        //Click to Password Area
        clickElement(By.id(password));
        //Type to Password
        sendKeys(By.id(password),pass);
        //Click to GoLogin Button
        clickElement(By.cssSelector(goLogin));
    }

    public void loginPagetwo()
    {
        //Click to MemberShipLogin Button
        clickElement(By.linkText(memberShipLogin));
        //Click to E-mail Address Area
        clickElement(By.id(eMail));
        //Type to E-mail Address
        sendKeys(By.id(eMail),email);
        //Click to Password Area
        clickElement(By.id(password));
        //Type to Password
        sendKeys(By.id(password),pass);
        //Click to GoLogin Button
        clickElement(By.cssSelector(goLogin));
        //Click to  MyAccount Button
        clickElement(By.xpath( myAccount));
        //Click to ChangePassword Button
        clickElement(By.xpath( changePassword));
        //Click to OldPassword Area
        clickElement(By.id( oldPassword));
        //Type To OldPassword
        sendKeys(By.id( oldPassword),oldpass);
        //Click to NewPassword Area
        clickElement(By.id( newPassword));
        //Type To NewPassword
        sendKeys(By.id( newPassword),newpass);
        //Click to OldPassword Area;
        clickElement(By.id( newPasswordConfirm));
        //Type To NewPasswordConfirm
        sendKeys(By.id( newPasswordConfirm),newpass);
        clickElement(By.className( updatePassword));
    }


}

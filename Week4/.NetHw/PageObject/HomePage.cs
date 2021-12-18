using System;
using OpenQA.Selenium;
using NUnit.Framework;
using SeleniumExtras.PageObjects;

namespace _NetHw {
public class HomePage  : BasePage {

public HomePage (IWebDriver driver) {
      HomePage.driver = driver;
      PageFactory.InitElements(driver,this);
  }

   public String login() {
    driver.FindElement(By.CssSelector(".user-panel-icon-text")).Click();
    driver.FindElement(By.Name("email")).SendKeys("testhesabi211@gmail.com");
    driver.FindElement(By.Name("password")).SendKeys("Deneme.123");
    driver.FindElement(By.Id("pw-search-input")).SendKeys("ayakkabı");
    driver.FindElement(By.Id("pw-search-input")).SendKeys(Keys.Enter);
    string assertText2 = driver.FindElement(By.XPath("(//h1[@class='fsize-36 font-financier'])[1]")).Text;
    if (assertText2 != "\\\"ayakkabı\\\" için sonuçlar") {
      Assert.Fail();
    }
    return assertText2;
  }
}
}
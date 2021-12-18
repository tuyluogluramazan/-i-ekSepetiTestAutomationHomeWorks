using OpenQA.Selenium;
using OpenQA.Selenium.Chrome;


namespace _NetHw {

public class BasePage {
  public static IWebDriver driver;

  public void Initialize() {
    driver = new ChromeDriver();
    driver.Manage().Window.Maximize();
    driver.Url = "https://www.dsdamat.com/";
  }

  public void TearDown() {
    driver.Quit();
  }
}
}
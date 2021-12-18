package Base;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class BaseTest {  public static WebDriver driver;
    public static WebDriverWait wait;
    @Before
    public void Setup(){
        System.setProperty("webdriver.chrome.driver", "src/test/java/webDriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("https://www.morhipo.com/");
        wait = new WebDriverWait(driver, 20);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(8, TimeUnit.SECONDS);


    }

    @After
    public void TearDown(){
        driver.quit();
    }

}

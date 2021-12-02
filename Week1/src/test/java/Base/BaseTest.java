package Base;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class BaseTest {  public static WebDriver driver;
    public static WebDriverWait wait;
    @Before
    public void Setup(){
        System.setProperty("webdriver.chrome.driver", "src/test/java/webDriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, 20);
        driver.navigate().to("https://www.ciceksepeti.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); // Driver elementlere erişim için 10 sn bekleme süresi tanınır
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(200)); //Sayfaların timeouta düşme süresi tanınır
        driver.findElement(By.xpath("//span[@class='icon-close']")).click(); // Gönderim Adres Popup Kapatma
    }


    @After
    public void TearDown(){
        driver.quit();
    }

}

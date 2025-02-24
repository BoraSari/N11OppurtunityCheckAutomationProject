package N11OppurtunityCheckTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class BaseTest {

    WebDriver driver;
    SoftAssert softAssert;
    @BeforeClass
    @Parameters("browser")
    public void setup(String browser){
      switch(browser){
          case "google":
              WebDriverManager.chromedriver().setup();
              driver = new ChromeDriver();
              break;
              case "firefox":
              WebDriverManager.firefoxdriver().setup();
              driver=new FirefoxDriver();
              break;
          default:throw  new RuntimeException("Tests are can not started.");
      }
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        softAssert=new SoftAssert();


    }
    


    @AfterClass
    public void tearDown(){
        softAssert.assertAll("All tests are asserted.");
        driver.quit();
    }
}

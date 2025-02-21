package N11Pages;

import org.openqa.selenium.WebDriver;

public class BasePage {
    protected WebDriver driver;

    String baseUrl = "https://www.n11.com/" ;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateBaseUrl(){
        driver.get(baseUrl);
    }

    public String getPagesTitle(){
        return driver.getTitle();
    }


}

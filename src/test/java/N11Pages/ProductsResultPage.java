package N11Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class ProductsResultPage extends BasePage{

    JavascriptExecutor js = ((JavascriptExecutor) driver);

    WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));



    @FindBy(xpath = "(//img[@class='lazy cardImage'])[2]")
    private WebElement image;


    @FindBy(xpath = "//div[@class='result-item']")
    private WebElement productResultMessage;

    @FindBy(xpath = "(//img[@class='lazy cardImage'])[2]")
    private WebElement product;





    public ProductsResultPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    public void scrollDown(){
        js.executeScript("window.scrollBy(0,300)");
        
    }



    public WebElement checkImage(){
        WebElement ımage = image;
        return ımage;
    }


    public WebElement checkProductMessage(){
        WebElement message = productResultMessage;
        return message;

    }

    public String productResultMessageCheck(){
        return productResultMessage.getText();
    }

    public void navigateProduct(){
        product.click();
    }




}

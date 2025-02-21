package N11Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductDetailsPage extends BasePage {
    @FindBy(css = "div[class='point-balance-text']")
    private WebElement oppurtunityMessage;
    public ProductDetailsPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }


    public WebElement checkOppurtinityMessage(){
        WebElement message = oppurtunityMessage;
        return message;
    }

    public String checkOppurtunityMessage(){
        return oppurtunityMessage.getText();
    }
}

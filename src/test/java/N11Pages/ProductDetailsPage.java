package N11Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductDetailsPage extends BasePage {
    @FindBy(css = "div[class='point-balance-text']")
    private WebElement opportunityMessage;
    public ProductDetailsPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }


    public WebElement checkOpportinityMessage(){
        WebElement message = opportunityMessage;
        return message;
    }

    public String checkOpportunityMessage(){
        return opportunityMessage.getText();
    }
}

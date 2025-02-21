package N11Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TabBarPage extends BasePage {

    @FindBy(id = "searchData")
    private WebElement searchBox;


    public TabBarPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }



    public void searchProduct(){
        searchBox.sendKeys("Gaming Laptop"+ Keys.ENTER);
    }
}

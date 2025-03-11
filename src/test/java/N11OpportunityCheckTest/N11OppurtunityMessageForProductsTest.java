package N11OpportunityCheckTest;
import N11Pages.ProductDetailsPage;
import N11Pages.ProductsResultPage;
import N11Pages.TabBarPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class N11OppurtunityMessageForProductsTest extends BaseTest {
    private static final Logger logger = LogManager.getLogger(N11OppurtunityMessageForProductsTest.class);

    TabBarPage tabBarPage;
    ProductsResultPage productsResultPage;
    ProductDetailsPage productDetailsPage;


    @BeforeMethod
    public void classSetup(){
        tabBarPage= new TabBarPage(driver);
        productsResultPage=new ProductsResultPage(driver);
        productDetailsPage=new ProductDetailsPage(driver);

    }
    @Test(priority = 1)
    public void searchProductTest() {
        logger.info("Searching product on text field test started");
        logger.info("Navigate Main Page");
        tabBarPage.navigateBaseUrl();
        //tabBarPage.navigateBaseUrl();
        logger.info("Search product");
        tabBarPage.searchProduct();
        logger.info("Search product test finished");
    }

    @Test(priority = 2)
    public void checkingImageTest() throws InterruptedException {
        logger.info("Checking Image Test Started");
        logger.info("Static wait");
        Thread.sleep(2000);
        logger.info("Scroll Down the page");
        productsResultPage.scrollDown();
        logger.info("Static wait");
        Thread.sleep(2000);
        logger.info("Product image display assertion");
        softAssert.assertTrue(productsResultPage.checkImage().isDisplayed());

    }

    @Test(priority = 3)
    public void navigateProductTest()throws  InterruptedException{
        logger.info("Click product");
        productsResultPage.navigateProduct();
        logger.info("Opportunity text check test started");
         Thread.sleep(2000);
         logger.info("Oppurtunity text assertion completed");
         softAssert.assertTrue(productDetailsPage.checkOpportinityMessage().isDisplayed());
         logger.warn("Oppurtunity text value assertion completed. Test finished.");
         softAssert.assertTrue(productDetailsPage.checkOpportunityMessage().contains("30"));

    }
}

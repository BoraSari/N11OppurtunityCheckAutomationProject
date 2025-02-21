package N11FilterTest;

import N11Pages.ProductDetailsPage;
import N11Pages.ProductsResultPage;
import N11Pages.TabBarPage;
import org.testng.annotations.Test;

public class N11OppurtunityMessageForProductsTest extends BaseTest {
    TabBarPage tabBarPage;
    ProductsResultPage productsResultPage;
    ProductDetailsPage productDetailsPage;

    @Test(priority = 1)
    public void searchProductTest() {
        tabBarPage = new TabBarPage(driver);
        tabBarPage.navigateBaseUrl();
        tabBarPage.searchProduct();
    }

    @Test(priority = 2)
    public void checkingImageTest() throws InterruptedException {
        productsResultPage = new ProductsResultPage(driver);
        Thread.sleep(2000);
        productsResultPage.scrollDown();
        Thread.sleep(2000);
        softAssert.assertTrue(productsResultPage.checkImage().isDisplayed());

    }

    @Test(priority = 3)
    public void navigateProductTest()throws  InterruptedException{
        productsResultPage.navigateProduct();
         productDetailsPage = new ProductDetailsPage(driver);
         Thread.sleep(2000);
         softAssert.assertTrue(productDetailsPage.checkOppurtinityMessage().isDisplayed());
         softAssert.assertTrue(productDetailsPage.checkOppurtunityMessage().contains("30"));

    }
}

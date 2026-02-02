package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.ProductDetailsPage;
import pageObjects.ProductPage;
import testBase.BaseClass;

public class AddReviewOnProduct extends BaseClass {
    //testcase_21
    @Test
    public void add_review_on_product(){
        HomePage hp = new HomePage(driver);
        hp.productLink();
        ProductPage pp = new ProductPage(driver);
        pp.allProductText();
        pp.viewProduct();
        ProductDetailsPage pdp = new ProductDetailsPage(driver);
        Assert.assertTrue(pdp.writeYourReviewText());
        pdp.yourName("Kuldeep");
        pdp.yourEmail("bcqiw@gmail.com");
        pdp.addReviewHere("Neque porro quisquam est qui" +
                " dolorem ipsum quia dolor sit amet, consectetur, adipisci velit...");
        pdp.submitBtn();
        Assert.assertTrue(pdp.thankYouMessage());
    }
}

package testCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pageObjects.CartPage;
import pageObjects.HomePage;
import pageObjects.ProductPage;
import testBase.BaseClass;

public class RemoveProductFromCart extends BaseClass {
    //Test_case_17
    @Test
    public void remove_product_from_cart(){
        HomePage hp = new HomePage(driver);
        hp.productLink();
        ProductPage pp = new ProductPage(driver);
        pp.hoverProduct1();
        pp.addCart();
        pp.continueShopping();
        hp.clickCartBtn();
        driver.findElement(By.xpath("//i[@class='fa fa-times']")).click();
        driver.findElement(By.xpath("//b[normalize-space()='Cart is empty!']")).isDisplayed();
    }
}

package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.CartPage;
import pageObjects.HomePage;
import pageObjects.ProductDetailsPage;
import pageObjects.ProductPage;
import testBase.BaseClass;

public class AddToCart extends BaseClass {
    //TestCase_12
    @Test
    public void add_product_in_cart() {
        HomePage hp = new HomePage(driver);
        hp.productLink();
        ProductPage pp = new ProductPage(driver);
        pp.hoverProduct1();
        pp.addCart();
        pp.continueShopping();
        pp.hoverProduct2();
        pp.addToCartSecondProduct();
        pp.continueShopping();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(1000,0);");
        CartPage cp = new CartPage(driver);
        cp.cartBtn();
        cp.products();
        cp.productPrice();
    }

    //TestCase_13
    @Test
    public void add_product_in_cart_and_verify_quantity() {
        HomePage hp = new HomePage(driver);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,700);");
        hp.viewfirstProduct();
        ProductDetailsPage pdp = new ProductDetailsPage(driver);
        pdp.setQuantity("4");
        pdp.addToCart();
        pdp.continueShopping();
        driver.findElement(By.xpath("(//i[@class='fa fa-shopping-cart'])[1]")).click();
    }
}


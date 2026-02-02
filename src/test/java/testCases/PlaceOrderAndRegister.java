package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import pageObjects.CartPage;
import pageObjects.HomePage;
import pageObjects.ProductDetailsPage;
import pageObjects.SignupLoginPage;
import testBase.BaseClass;

public class PlaceOrderAndRegister extends BaseClass {
    //Testcase_14
    @Test
    public void place_order_while_register() {
        HomePage hp = new HomePage(driver);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,700);");
        hp.viewfirstProduct();
        ProductDetailsPage pdp = new ProductDetailsPage(driver);
        pdp.addToCart();
        pdp.continueShopping();
        hp.clickCartBtn();
        driver.findElement(By.xpath("//a[normalize-space()='Proceed To Checkout']")).click();
        driver.findElement(By.xpath("//u[normalize-space()='Register / Login']")).click();
        SignupLoginPage lp = new SignupLoginPage(driver);
        lp.pageLogin();
        lp.loginEmail("chandradeep7175@gmail.com");
        lp.setLoginPassword("#KK@4247");
        lp.clickLogin();
    }
}

package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import testBase.BaseClass;

public class RecommendedItems extends BaseClass {

    @Test
    public void add_to_cart_recommended_items(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        HomePage hp = new HomePage(driver);
        js.executeScript("window.scrollBy(500,0)");
        Assert.assertTrue(hp.recommendedText());
        hp.recommendedProductAddToCart();
        js.executeScript("window.scrollBy(0,0)");
        hp.clickCartBtn();
        driver.findElement(By.xpath("//div[@id='cart_info']")).isDisplayed();
    }
}

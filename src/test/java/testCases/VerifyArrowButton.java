package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.SubscriptionPage;
import testBase.BaseClass;

public class VerifyArrowButton extends BaseClass {

    //testcase_25
    @Test
    public void verify_scroll_up_using_Arrow_button_and_Scroll_Down(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        SubscriptionPage sp = new SubscriptionPage(driver);
        Assert.assertTrue(sp.subscriptionText());
        sp.scrollArrowBtn();
        driver.findElement(By.xpath("//div[@class='item active']//h2[contains(text(),'Full-Fledged practice website for Automation Engin')]")).isDisplayed();
    }
    //testcase_26
    @Test
    public void verify_scroll_up_without_using_Arrow_button_and_Scroll_Down(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        SubscriptionPage sp = new SubscriptionPage(driver);
        Assert.assertTrue(sp.subscriptionText());
        js.executeScript("window.scrollBy(0,0)");
        driver.findElement(By.xpath("//div[@class='item active']//h2[contains(text(),'Full-Fledged practice website for Automation Engin')]")).isDisplayed();
    }
}

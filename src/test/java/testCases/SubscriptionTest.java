package testCases;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.SubscriptionPage;
import testBase.BaseClass;

public class SubscriptionTest extends BaseClass {
    //TestCase_10
    @Test
    public void subscrition_check(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,5000);");
        SubscriptionPage sp = new SubscriptionPage(driver);
        sp.subscriptionText();
        sp.subEmail("xhc@gmail.com");
        sp.clickSubBtn();
        sp.ConformationMsg();
    }
    //TestCase_11
    @Test
    public void subscription_check_in_cart(){
        HomePage hp = new HomePage(driver);
        hp.clickCartBtn();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,5000);");
        SubscriptionPage sp = new SubscriptionPage(driver);
        sp.subscriptionText();
        sp.subEmail("zetxr@gmail.com");
        sp.clickSubBtn();
        sp.ConformationMsg();
    }
}

package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TestCasesTest extends BaseClass {
    //TestCase_7
    @Test
    public void test_case_page(){
        Assert.assertEquals(driver.getTitle(),"Automation Exercise");
        HomePage hp = new HomePage(driver);
        hp.testCasesLink();
        driver.findElement(By.xpath("//b[normalize-space()='Test Cases']")).isDisplayed();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1200);");
    }
}

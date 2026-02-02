package testCases;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.SignupLoginPage;
import testBase.BaseClass;


public class RegisterAccountAndDelete extends BaseClass {

    //TestCase_1
    @Test(priority = 1)
    public void register_user_and_delete(){
        logger.info("TC001");
        HomePage hp = new HomePage(driver);
//        Assert.assertEquals(driver.getTitle(),hp.homePagetitle);
        logger.info("Home page open");
        hp.clickSignupLogin();
        SignupLoginPage sp = new SignupLoginPage(driver);
        sp.inputUsername(randomString().toUpperCase());
        sp.inputEmail(randomString()+"@gmail.com");
        sp.submitBtn();

        driver.findElement(By.xpath("//input[@id='id_gender1']")).click();
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("@AA!123");
        WebElement days = driver.findElement(By.xpath("//select[@id='days']"));
        Select day = new Select(days);
        day.selectByValue("7");
        WebElement months = driver.findElement(By.xpath("//select[@id='months']"));
        Select month = new Select(months);
        month.selectByIndex(3);
        WebElement years = driver.findElement(By.xpath("//select[@id='years']"));
        Select year = new Select(years);
        year.selectByValue("1999");
        driver.findElement(By.xpath("//input[@id='newsletter']")).click();
        driver.findElement(By.xpath("//input[@id='optin']")).click();
        driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys("Kuldeep");
        driver.findElement(By.xpath("//input[@id='last_name']")).sendKeys("Kumar");
        driver.findElement(By.xpath("//input[@id='company']")).sendKeys("Infy");
        driver.findElement(By.xpath("//input[@id='address1']")).sendKeys("Hamirpur");
        WebElement countrys = driver.findElement(By.xpath("//select[@id='country']"));
        Select country = new Select(countrys);
        country.selectByVisibleText("India");
        driver.findElement(By.xpath("//input[@id='state']")).sendKeys("Uttar Pradesh");
        driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Hamirpur");
        driver.findElement(By.xpath("//input[@id='zipcode']")).sendKeys("210501");
        driver.findElement(By.xpath("//input[@id='mobile_number']")).sendKeys(randomNumber());
        WebElement accountCreateBtn = driver.findElement(By.xpath("//button[normalize-space()='Create Account']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();",accountCreateBtn);
        String Ac = driver.findElement(By.xpath("//b[normalize-space()='Account Created!']")).getText();
        Assert.assertEquals(Ac.toUpperCase(),"ACCOUNT CREATED!");
        WebElement ck = driver.findElement(By.xpath("//a[normalize-space()='Continue']"));
        js.executeScript("arguments[0].click();",ck);
        driver.findElement(By.xpath("//i[@class='fa fa-user']")).isDisplayed();
        driver.findElement(By.xpath("//i[@class='fa fa-trash-o']")).click();
        driver.findElement(By.xpath("//b[normalize-space()='Account Deleted!']")).isDisplayed();
        driver.findElement(By.xpath("//a[normalize-space()='Continue']")).click();
        logger.debug("TC001 failed");
    }
    //TestCase_5
    @Test(priority = 2)
    public void register_existing_user(){
        HomePage hp = new HomePage(driver);
        Assert.assertEquals(driver.getTitle(),hp.homePagetitle);
        hp.clickSignupLogin();
        SignupLoginPage sp = new SignupLoginPage(driver);
        sp.inputUsername("Kuldeep");
        sp.inputEmail("chandradeep7175@gmail.com");
        sp.submitBtn();
        driver.findElement(By.xpath("//p[normalize-space()='Email Address already exist!']")).isDisplayed();
    }

}

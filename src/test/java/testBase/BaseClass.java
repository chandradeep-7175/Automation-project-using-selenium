package testBase;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import pageObjects.HomePage;

import java.time.Duration;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class BaseClass {
    public WebDriver driver;
    public Logger logger;
    @BeforeClass
//    @Parameters({"os","browser"})
    //put in this method String os,String br
    public void openUrl(){
        logger=LogManager.getLogger(this.getClass());
//        switch (br.toLowerCase()){
//            case "chrome": driver = new ChromeDriver(); break;
//            case "edge": driver = new EdgeDriver(); break;
//            case "firefox": driver = new FirefoxDriver(); break;
//            default:
//                System.out.println("invalied browser name!");
//                return;
//        }
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://automationexercise.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().deleteAllCookies();
    }
    @AfterClass
    public void closeBrowser(){
        driver.quit();
    }
    @BeforeMethod
    public void checkTitle(){
        Assert.assertEquals(driver.getTitle(),"Automation Exercise");
    }
    @AfterMethod
    public void clickHome(){
        HomePage hp = new HomePage(driver);
        hp.clickHome();
        Assert.assertEquals(driver.getTitle(),"Automation Exercise");
    }
    public String randomString(){
        String randomeString = RandomStringUtils.randomAlphabetic(5);
        return randomeString;
    }
    public String randomNumber(){
        String randomNumber = RandomStringUtils.randomNumeric(10);
        return randomNumber;
    }
}

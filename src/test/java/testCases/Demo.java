package testCases;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import testBase.BaseClass;

import java.io.File;
import java.util.Map;

public class Demo extends BaseClass {
    @Test
    public void screenShot(){
        TakesScreenshot ts = (TakesScreenshot)driver;
        File sourseFile = ts.getScreenshotAs(OutputType.FILE);
        File targetFile = new File(System.getProperty("user.dir")+"\\screenshots\\ss.png");
        sourseFile.renameTo(targetFile);
    }

    TakesScreenshot ts = (TakesScreenshot) driver;
    File sourse = ts.getScreenshotAs(OutputType.FILE);
    File target = new File(System.getProperty("user.dir")+"\\screenshots\\ss.png");

}

package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogoutPage extends BasePage{

    public LogoutPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//a[normalize-space()='Logout']") WebElement logout;
    public boolean logoutDisplay(){
        return logout.isDisplayed();
    }
    WebElement logoutBtn;
    public void logoutBtn(){
        logout.click();
    }
}

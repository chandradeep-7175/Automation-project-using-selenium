package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SubscriptionPage extends BasePage{
    public SubscriptionPage(WebDriver driver){
        super(driver);
    }
    @FindBy(xpath = "//h2[normalize-space()='Subscription']") WebElement subscriptionText;
    @FindBy(xpath = "//input[@id='susbscribe_email']") WebElement subEmail;
    @FindBy(xpath = "//button[@id='subscribe']") WebElement subBtn;
    @FindBy(xpath = "//div[@id='success-subscribe']") WebElement confirmationMessage;
    @FindBy(xpath = "//i[@class='fa fa-angle-up']") WebElement scrollArrowBtn;
    public boolean subscriptionText(){
        return subscriptionText.isDisplayed();
    }
    public void subEmail(String email){
        subEmail.sendKeys(email);
    }
    public void clickSubBtn(){
        subBtn.click();
    }
    public boolean ConformationMsg(){
        return confirmationMessage.isDisplayed();
    }
    public void scrollArrowBtn(){
        scrollArrowBtn.click();
    }
}

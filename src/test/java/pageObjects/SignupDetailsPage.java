package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignupDetailsPage extends BasePage {


    @FindBy(xpath = "//input[@id='id_gender1']")
    WebElement gender;
    @FindBy(xpath = "//input[@id='password']") WebElement password;
    @FindBy(xpath = "//select[@id='days']") WebElement day;
    @FindBy(xpath = "//select[@id='months']") WebElement months;
    @FindBy(xpath = "//select[@id='years']") WebElement year;
    @FindBy(xpath = "//input[@id='newsletter']") WebElement newsletter;
    @FindBy(xpath = "//input[@id='optin']") WebElement pertnersOffer;
    @FindBy(xpath = "//input[@id='first_name']") WebElement firstName;
    @FindBy(xpath = "//input[@id='last_name']") WebElement lastName;
    @FindBy(xpath = "//input[@id='company']") WebElement company;
    @FindBy(xpath = "//input[@id='address1']") WebElement address1;
    @FindBy(xpath = "//select[@id='country']") WebElement country;
    @FindBy(xpath = "//input[@id='state']") WebElement state;
    @FindBy(xpath = "//input[@id='city']") WebElement city;
    @FindBy(xpath = "//input[@id='zipcode']") WebElement zipcode;

    public SignupDetailsPage(WebDriver driver) {
        super(driver);
    }
}

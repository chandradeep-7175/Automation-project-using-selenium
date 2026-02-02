package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignupLoginPage extends BasePage {
    WebDriver driver;
    public SignupLoginPage(WebDriver driver) {
        super(driver);
    }
    //Signup web elements
    @FindBy(xpath = "//input[@placeholder='Name']")
    WebElement inputUsername;
    @FindBy(xpath = "//input[@data-qa='signup-email']") WebElement inputEmail;
    @FindBy(xpath = "//button[normalize-space()='Signup']") WebElement submitBtn;
    public void inputUsername(String user){
        inputUsername.sendKeys(user);
    }
    public void inputEmail(String email){
        inputEmail.sendKeys(email);
    }
    public void submitBtn(){
        submitBtn.click();
    }
    //login web elements
    @FindBy(xpath = "//h2[normalize-space()='Login to your account']") WebElement pageLogin;
    @FindBy(xpath = "//input[@data-qa='login-email']") WebElement loginEmail;
    @FindBy(xpath = "//input[@placeholder='Password']") WebElement loginPassword;
    @FindBy(xpath = "//button[normalize-space()='Login']") WebElement loginBtn;

    @FindBy(xpath = "//p[normalize-space()='Your email or password is incorrect!']") WebElement errorEmailAndPassword;

    public boolean pageLogin(){
        return pageLogin.isDisplayed();
    }
    public void loginEmail(String email){
        loginEmail.sendKeys(email);
    }
    public void setLoginPassword(String pass){
        loginPassword.sendKeys(pass);
    }
    public void clickLogin(){
        loginBtn.click();
    }

    public boolean errorEmailAndPasswordMsg(){
        return errorEmailAndPassword.isDisplayed();
    }
}

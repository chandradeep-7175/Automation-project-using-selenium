package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactUsPage extends BasePage{
    public ContactUsPage(WebDriver driver) {
        super(driver);
    }
    public String message = "Lorem Ipsum is simply dummy " +
            "text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text " +
            "ever since the 1500s, when an unknown printer took a galley of type and scrambled it to " +
            "make a type specimen book.";
    public String file_path = "C:\\Users\\Kuldeep\\Downloads\\dummy.txt";

    @FindBy(xpath = "//h2[normalize-space()='Get In Touch']") WebElement getInTouchText;
    @FindBy(xpath = "//input[@placeholder='Name']") WebElement nameInput;
    @FindBy(xpath = "//input[@placeholder='Email']") WebElement emailInput;
    @FindBy(xpath = "//input[@placeholder='Subject']") WebElement subjectInput;
    @FindBy(xpath = "//textarea[@id='message']") WebElement messageInput;
    @FindBy(xpath = "//input[@name='upload_file']") WebElement filePath;
    @FindBy(xpath = "//input[@name='submit']") WebElement submitBtn;
    @FindBy(xpath = "//div[@class='status alert alert-success']") WebElement successMsg;

    public boolean getInTouchText(){
        return getInTouchText.isDisplayed();
    }
    public void nameInput(String name){
       nameInput.sendKeys(name);
    }
    public void emailInput(String email){
        emailInput.sendKeys(email);
    }
    public void subjectInput(String subject){
        subjectInput.sendKeys(subject);
    }
    public void messageInput(String msg){
        messageInput.sendKeys(msg);
    }
    public void filePath(String filepath){
        filePath.sendKeys(filepath);
    }
    public void submitBtn(){
        submitBtn.click();
    }
    public boolean successMsg(){
        return successMsg.isDisplayed();
    }
}

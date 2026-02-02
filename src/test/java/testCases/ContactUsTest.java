package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.ContactUsPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class ContactUsTest extends BaseClass {
    //TestCase_6
    @Test
    public void contact_us() {
        Assert.assertEquals(driver.getTitle(), "Automation Exercise");
        HomePage hp = new HomePage(driver);
        hp.contactLink();
        ContactUsPage cp =new ContactUsPage(driver);
        cp.getInTouchText();
        cp.nameInput("KK");
        cp.emailInput(randomString()+"@gmail.com");
        cp.subjectInput("Sending Message");
        cp.messageInput(cp.message);
        cp.filePath(cp.file_path);
        cp.submitBtn();
        driver.switchTo().alert().accept();
        cp.successMsg();
    }
}

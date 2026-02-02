package testCases;

import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.LogoutPage;
import pageObjects.SignupLoginPage;
import testBase.BaseClass;

public class LogoutTest extends BaseClass {
    //TestCase_4
    @Test
    public void logout_user(){
        HomePage hp = new HomePage(driver);
        hp.clickSignupLogin();
        SignupLoginPage lp = new SignupLoginPage(driver);
        lp.pageLogin();
        lp.loginEmail("chandradeep7175@gmail.com");
        lp.setLoginPassword("#KK@4247");
        lp.clickLogin();
        LogoutPage lgp = new LogoutPage(driver);
        lgp.logoutDisplay();
        lgp.logoutBtn();
    }
}

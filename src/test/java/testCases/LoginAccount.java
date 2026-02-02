package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.LogoutPage;
import pageObjects.SignupLoginPage;
import testBase.BaseClass;

public class LoginAccount extends BaseClass {
    //TestCase_2
    @Test
    public void login_with_correct_user(){
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
    //TestCase_3
    @Test
    public void login_with_incorrect_user(){
        HomePage hp = new HomePage(driver);
        hp.clickSignupLogin();
        SignupLoginPage lp = new SignupLoginPage(driver);
        lp.pageLogin();
        lp.loginEmail(randomString()+"@gmail.com");
        lp.setLoginPassword("65fvjhb6");
        lp.clickLogin();
        lp.errorEmailAndPasswordMsg();
    }
}

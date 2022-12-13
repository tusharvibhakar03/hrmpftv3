package com.hrm.login.testsuite;

import com.hrm.login.customlisteners.CustomListeners;
import com.hrm.login.pages.LoginPage;
import com.hrm.login.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class LoginTest extends BaseTest {


    LoginPage loginPage;

    @BeforeMethod (alwaysRun = true)
    public void inIt() {

        loginPage = new LoginPage();
        LoginPage loginPage = new LoginPage();
    }
    @Test(groups = {"sanity","regression"})
    public void userShouldLoginSuccessfullyWithValidCredentials(){
        loginPage.enterUserName("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickOnSignIn();
        Assert.assertEquals(loginPage.verifyText(),"Dashboard","not verify");
    }

    @Test (groups = {"smoke","regression"})
    public void userShouldNavigateToForgotPasswordPageSuccessfully(){
        loginPage.clickOnForgot();
      Assert.assertEquals(loginPage.verifyResetText(),"Reset Password","not verify");
    }
}

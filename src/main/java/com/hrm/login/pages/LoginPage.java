package com.hrm.login.pages;

import com.hrm.login.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Utility {

    @CacheLookup

    @FindBy(name = "username")
    WebElement userName;


    @FindBy(name="password")
            WebElement passwordField;


    @FindBy(xpath="//button[@type ='submit']")
    WebElement signIn;

    @FindBy(xpath="//h6[normalize-space()='Dashboard']")
            WebElement welcomeText;

    @FindBy(xpath="//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']")
    WebElement clickOnForgot;

    @FindBy(xpath ="//button[@class='oxd-button oxd-button--large oxd-button--secondary orangehrm-forgot-password-button orangehrm-forgot-password-button--reset']\")" )
    WebElement resetText;


   // By userName = By.name("username");
   // By passwordField = By.name("password");
    //By singIn = By.xpath("//button[@type ='submit']");
   // By welcomeText = By.xpath("//h6[normalize-space()='Dashboard']");
   // By clickOnForgot = By.xpath("//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']");
    //By resetText = By.xpath("//button[@class='oxd-button oxd-button--large oxd-button--secondary orangehrm-forgot-password-button orangehrm-forgot-password-button--reset']");
    public void enterUserName(String email){
        sendTextToElement(userName,email);
    }
    public void enterPassword(String password){
        sendTextToElement(passwordField,password);
    }
    public void clickOnSignIn(){
        clickOnElement(signIn);
    }
    public String verifyText(){
        return getTextFromElement(welcomeText);
    }
    public void clickOnForgot(){
        clickOnElement(clickOnForgot);
    }
    public String verifyResetText(){
        return getTextFromElement(resetText);
    }
}

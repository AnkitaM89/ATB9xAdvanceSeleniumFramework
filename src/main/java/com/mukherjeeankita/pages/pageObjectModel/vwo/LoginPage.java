package com.mukherjeeankita.pages.pageObjectModel.vwo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    //This is a Page Class
    WebDriver driver;

    //Calling the constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    // Step 1 - Page Locators
    private By username = By.id("login-username");
    private By password = By.id("login-password");
    private By signButton = By.id("js-login-btn");
    private By error_message = By.id("js-notification-box-msg");

    // If you are not using it , don't keep.
    //private By singBySSO = By.xpath("//button[normalize-space()='Sign in using SSO']");


    // Step 2 - Page Actions

    public String loginToVWOLoginInvalidCreds(String user,String pwd){
        driver.get("https://app.vwo.com");
        driver.findElement(username).sendKeys(user);
        driver.findElement(password).sendKeys(pwd);
        driver.findElement(signButton).click();
        try{
            Thread.sleep(3000);
        }
        catch(InterruptedException ie) {
            throw new RuntimeException(ie);
        }
        return driver.findElement(error_message).getText();

    }
    public void loginToVWOLoginValidCreds(String user, String pwd)
    {
        driver.get("https://app.vwo.com");
        driver.findElement(username).sendKeys(user);
        driver.findElement(password).sendKeys(pwd);
        driver.findElement(signButton).click();
        try{
            Thread.sleep(3000);
        }
        catch(InterruptedException ie) {
            throw new RuntimeException(ie);
        }
    }
}

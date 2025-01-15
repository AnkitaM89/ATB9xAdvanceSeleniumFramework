package com.mukherjeeankita.pages.pageObjectModel.katalonCura;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;
   public LoginPage(WebDriver driver)
   {
       this.driver=driver;
   }
   //Page Locator
    private By username = By.xpath("//input[@id='txt-username']");
    private By password = By.xpath("//input[@id='txt-password']");
    private By loginButton = By.xpath("//button[@id='btn-login']");
    private By makeAppointmentPageMsg = By.xpath("//h2[normalize-space()='Make Appointment']");

    //Page Actions
    public String loginToMakeAppointment(String user,String pwd)
    {
        driver.findElement(username).sendKeys(user);
        driver.findElement(password).sendKeys(pwd);
        driver.findElement(loginButton).click();
        try{
            Thread.sleep(3000);
        }
        catch(InterruptedException e){
            throw new RuntimeException(e);
        }
        return driver.findElement(makeAppointmentPageMsg).getText();
    }

}

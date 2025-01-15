package com.mukherjeeankita.pages.pageObjectModel.katalonCura;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AppointmentVerificationPage {
    WebDriver driver;

    public AppointmentVerificationPage(WebDriver driver) {
        this.driver = driver;
    }

    //Page Locators
    private By goToHome = By.xpath("//a[text()='Go to Homepage']");
    private By makeAppointmentText=By.xpath("//a[@id='btn-make-appointment']");
    //Page Actions
   public String goToHomePage()
   {
       try
       {
           Thread.sleep(3000);
       } catch (InterruptedException e) {
           throw new RuntimeException(e);
       }
       driver.findElement(goToHome).click();
       return driver.findElement(makeAppointmentText).getText();
   }
}
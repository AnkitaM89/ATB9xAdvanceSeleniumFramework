package com.mukherjeeankita.pages.pageObjectModel.katalonCura;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MakeBookingPage {
    WebDriver driver;
    public MakeBookingPage(WebDriver driver){
        this.driver=driver;
    }
    //Page Locator
    private By makeAppointment=By.xpath("//a[@id='btn-make-appointment']");
    private By loginPageMessage = By.xpath("//p[normalize-space()='Please login to make appointment.']");
    //Page Actions
    public String click_makeAppointment()
    {
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        driver.findElement(makeAppointment).click();
        return driver.findElement(loginPageMessage).getText();
    }
}

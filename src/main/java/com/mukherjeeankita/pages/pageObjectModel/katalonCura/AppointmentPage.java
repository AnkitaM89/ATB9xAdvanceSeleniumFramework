package com.mukherjeeankita.pages.pageObjectModel.katalonCura;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class AppointmentPage {
    WebDriver driver;
    public AppointmentPage(WebDriver driver)
    {
        this.driver=driver;
    }
    //Page Locators
    private By dropdown = By.id("combo_facility");
    private By checkbox = By.id("chk_hospotal_readmission");
    private By radio_none=By.id("radio_program_none");
    private By dateSelect=By.id("txt_visit_date");
    private By textComment=By.id("txt_comment");
    private By buttonText=By.id("btn-book-appointment");
    private By appointmentConfirmation = By.xpath("//h2[text()='Appointment Confirmation']");
    //Page Actions
    public String fillAppointmentData()
    {
       Select select = new Select(driver.findElement(dropdown));
       select.selectByContainsVisibleText("Hongkong");

       if(!driver.findElement(checkbox).isSelected())
       {
           driver.findElement(checkbox).click();
       };
        driver.findElement(radio_none).click();
        driver.findElement(dateSelect).sendKeys("21/01/2025");
        driver.findElement(textComment).sendKeys("Arthritis");
        try
        {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(buttonText).click();

       return driver.findElement(appointmentConfirmation).getText();
    }
}

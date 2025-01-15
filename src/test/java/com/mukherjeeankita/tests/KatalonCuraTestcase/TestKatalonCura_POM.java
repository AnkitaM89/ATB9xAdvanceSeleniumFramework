package com.mukherjeeankita.tests.KatalonCuraTestcase;

import com.mukherjeeankita.pages.pageObjectModel.katalonCura.LoginPage;
import com.mukherjeeankita.pages.pageObjectModel.katalonCura.MakeBookingPage;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TestKatalonCura_POM {
    @Owner("Ankita")
    @Description("Check Make Appointment click working")
    @Test
    public void test_clickMakeAptmnt()
    {
        WebDriver driver = new EdgeDriver();
        MakeBookingPage makeBooking = new MakeBookingPage(driver);

        String loginPageMsg = makeBooking.click_makeAppointment();

        assertThat(loginPageMsg).isNotEmpty().isNotNull().isNotBlank();
        Assert.assertEquals(loginPageMsg,"Please login to make appointment.");

        LoginPage loginToBook = new LoginPage(driver);
        String makeApntmntMessage=loginToBook.loginToMakeAppointment("John Doe","ThisIsNotAPassword");

        assertThat(makeApntmntMessage).isNotEmpty().isNotNull().isNotBlank();
        Assert.assertEquals(makeApntmntMessage,"Make Appointment");
    }
}

package com.mukherjeeankita.tests;

import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testSample {
    @Description("Check01")
    @Test
    public void sample01()
    {
        Assert.assertTrue(true);
        System.out.println("Hi01");
    }
    @Description("Check02")
    @Test
    public void sample02()
    {
        Assert.assertTrue(true);
        System.out.println("Hi02");
    }
}

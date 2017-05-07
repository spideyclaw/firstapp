//package com.mycompany.pageobject;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class FirstTest
{

    @Test
    public void driverTest()
    {
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");
        //assertTrue(true);
    }
}

package com.stepdef;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import com.utils.DriverFactory;
import io.qameta.allure.Allure;

public class Hooks {
    WebDriver driver;

    @Before
    public void setUp() {
        driver = DriverFactory.getDriver();
    }

    @After
    public void tearDown() {
        DriverFactory.quitDriver();
    }
}

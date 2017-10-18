/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdcsqa.jt.github;

import com.cdcsqa.jt.SeleniumServerSwitch;
import junit.framework.TestCase;
import static org.junit.Assert.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

/**
 *
 * @author Agustinus_A7234
 */
public class LandingPageTest {
    
    private WebDriver driver;
    private LandingPage instance;
    
    public LandingPageTest(String testName) {
    }
    
    @BeforeClass
    protected void setUp() throws Exception {
        SeleniumServerSwitch.startSeleniumServer();
        System.setProperty("webdriver.gecko.driver", "E:\\geckodriver\\geckodriver.exe");
        this.driver = new FirefoxDriver();
        instance = new LandingPage(driver);
    }
    
    @AfterClass
    protected void tearDown() throws Exception {
        this.driver.quit();
        SeleniumServerSwitch.stopSeleniumServer();
    }
    
    @Test
    public void testOpenPage() {
        System.out.println("testOpenPage");
        instance.openPage();
        assertTrue(true);
    }

    /**
     * Test of clickSignInLink method, of class LandingPage.
     */
    @Test(dependsOnMethods = "testOpenPage")
    public void testClickSignInLink() {
        System.out.println("clickSignInLink");
        instance.openPage();
        instance.clickSignInLink();
        assertTrue(true);
    }
    
}

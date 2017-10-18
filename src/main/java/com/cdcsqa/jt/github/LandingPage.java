/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdcsqa.jt.github;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 *
 * @author Agustinus_A7234
 */
public class LandingPage {
    
    @FindBy(xpath = "//a[@href='/login']")
    private WebElement signInLink;
    
    @FindBy(xpath = "//a[@href='/join?source=header-home']")
    private WebElement signUpLink;
    
    private WebDriver driver;
    
    private final String BASE_URL = "https://github.com";

    public LandingPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    
    public void openPage() {
        this.driver.get(BASE_URL);
    }
    
    public void clickSignInLink() {
        signInLink.click();
    }
    
    
    
}

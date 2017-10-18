/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdcsqa.jt.wordpress;

import org.openqa.grid.internal.utils.configuration.StandaloneConfiguration;
import org.openqa.selenium.remote.server.SeleniumServer;
import org.testng.ITestContext;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

/**
 *
 * @author Agustinus_A7234
 */
public class WordpressTest {
    
    public SeleniumServer server;

    @BeforeSuite(alwaysRun = true)
    public void setupBeforeSuite(ITestContext context) {
        String seleniumHost = context.getCurrentXmlTest().getParameter("selenium.host");
        String seleniumPort = context.getCurrentXmlTest().getParameter("selenium.port");
        String seleniumBrowser = context.getCurrentXmlTest().getParameter("selenium.browser");
        String seleniumUrl = context.getCurrentXmlTest().getParameter("selenium.url");

        StandaloneConfiguration rcc = new StandaloneConfiguration();
        rcc.port = (Integer.parseInt(seleniumPort));

        try {
            server = new SeleniumServer(rcc);
            server.boot();
        } catch (Exception e) {
            throw new IllegalStateException("Can't start selenium server", e);
        }

//        proc = new HttpCommandProcessor(seleniumHost, Integer.parseInt(seleniumPort),
//                seleniumBrowser, seleniumUrl);
//        selenium = new DefaultSelenium(proc);
//        selenium.start();
    }

    @AfterSuite(alwaysRun = true)
    public void setupAfterSuite() {
//        selenium.stop();
        server.stop();
    }

}

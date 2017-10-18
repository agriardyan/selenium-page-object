/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdcsqa.jt;

import org.openqa.selenium.remote.server.SeleniumServer;
import org.openqa.grid.internal.utils.configuration.StandaloneConfiguration;

/**
 *
 * @author Agustinus_A7234
 */
public class SeleniumServerSwitch {

    public static SeleniumServer server;

    public static void startSeleniumServer() throws Exception {
        StandaloneConfiguration config = new StandaloneConfiguration();
        config.browserTimeout = 1000;
        config.port = 5600;
        server = new SeleniumServer(config);
        server.boot();
    }

    public static void stopSeleniumServer() {
        if (server != null) {
            try {
                server.stop();
                server = null;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

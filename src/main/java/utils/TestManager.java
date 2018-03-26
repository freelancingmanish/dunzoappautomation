package utils;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import static utils.AppiumServer.startAppiumServer;
import static utils.AppiumServer.stopAppiumServer;


public class TestManager {

    @BeforeSuite
    public void startAppium() {
        startAppiumServer();
    }

    @AfterSuite
    public void stopAppium() {
        stopAppiumServer();
    }
}

package pages;
import io.appium.java_client.AppiumDriver;

import static utils.DriverFactory.getDriver;


class BasePage {

    AppiumDriver driver;

    BasePage() {
        this.driver = getDriver();
    }

    void sleepInSeconds(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

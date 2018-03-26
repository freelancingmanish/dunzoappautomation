package utils;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;


public class DriverFactory {

    private static AndroidDriver driver;

    public static AndroidDriver getDriver() {
        if (driver == null) {
            startDriver();
        }
        return driver;
    }

    private static void startDriver() {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        setCapabilities(desiredCapabilities);
        try {
            driver = new AndroidDriver(new URL(DeviceProperties.url), desiredCapabilities);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    private static void setCapabilities(DesiredCapabilities desiredCapabilities) {
        File appDir = new File("apps");
        desiredCapabilities.setCapability("app", new File(appDir, DeviceProperties.appName).getAbsolutePath());
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, DeviceProperties.platformName);
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, DeviceProperties.platformVersion);
        desiredCapabilities.setCapability(MobileCapabilityType.UDID, DeviceProperties.udid);
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, DeviceProperties.deviceName);
        desiredCapabilities.setCapability("appActivity", DeviceProperties.appActivity);
        desiredCapabilities.setCapability("appPackage", DeviceProperties.appPackage);
        desiredCapabilities.setCapability(MobileCapabilityType.FULL_RESET, DeviceProperties.fullReset);
    }
}

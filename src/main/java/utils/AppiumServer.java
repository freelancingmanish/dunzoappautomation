package utils;
import io.appium.java_client.service.local.AppiumDriverLocalService;


public class AppiumServer {

    private static AppiumDriverLocalService service;

    public static void startAppiumServer() {
        service = AppiumDriverLocalService.buildDefaultService();
        service.start();
    }

    public static void stopAppiumServer() {
        if (service != null) {
            service.stop();
        } else
            System.out.println("Already Stopped");
    }
}

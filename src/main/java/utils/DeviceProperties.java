package utils;
public class DeviceProperties {

    private static final PropertyReader propertiesReader = new PropertyReader();
    public static final String appDir = propertiesReader.getAppDir();
    public static final String appName = propertiesReader.getAppName();
    public static final String platformName = propertiesReader.getPlatformName();
    public static final String platformVersion = propertiesReader.getPlatformVersion();
    public static final String deviceName = propertiesReader.getDeviceName();
    public static final String udid = propertiesReader.getUdid();
    public static final String launchTimeout = propertiesReader.getLaunchTimeout();
    public static final String url = propertiesReader.getUrl();
    public static final String model = propertiesReader.getModel();
    public static final String appPackage = propertiesReader.getAppPackage();
    public static final String appActivity = propertiesReader.getAppActivity();
    public static final int newCommandTimeout = propertiesReader.getNewCommandTimeout();
    public static final boolean fullReset = propertiesReader.getFullReset();
    public static final String noReset = propertiesReader.getNoReset();
    public static final int port = propertiesReader.getPort();
//    public static final String browsers = propertiesReader.getBrowsersToRun();
}

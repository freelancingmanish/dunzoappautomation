package utils;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


public class PropertyReader {

    private Properties jProp = new Properties();

    PropertyReader() {
        String propertiesFilePath = "device.properties";
        InputStream propertiesAsStream = this.getClass().getClassLoader().getResourceAsStream(propertiesFilePath);
        try {
            jProp.load(propertiesAsStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    String getAppDir() {
        return jProp.getProperty("appDir");
    }

    String getAppName() {
        return jProp.getProperty("appName");
    }

    String getAppPackage() {
        return jProp.getProperty("appPackage");
    }

    String getPlatformName() {
        return jProp.getProperty("platformName");
    }

    String getPlatformVersion() {
        return jProp.getProperty("platformVersion");
    }

    String getUdid() {
        return jProp.getProperty("udid");
    }

    String getDeviceName() {
        return jProp.getProperty("deviceName");
    }

    String getLaunchTimeout() {
        return jProp.getProperty("launchTimeout");
    }

    String getUrl() {
        return jProp.getProperty("url");
    }

    String getAppActivity() {
        return jProp.getProperty("appActivity");
    }

    String getModel() {
        return jProp.getProperty("model");
    }

    int getNewCommandTimeout() {
        return Integer.parseInt(jProp.getProperty("newCommandTimeout"));
    }

    String getNoReset() {
        return jProp.getProperty("noReset");
    }

    boolean getFullReset() {
        return Boolean.parseBoolean(jProp.getProperty("fullReset"));
    }

    int getPort() {
        return Integer.parseInt(jProp.getProperty("port"));
    }
}

package utils;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Driver {

    private static AndroidDriver driver;

    public static void initDriver() throws MalformedURLException{
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName","Android");
        caps.setCapability("appium:deviceName", "Medium_Phone_API_35");
        caps.setCapability("appium:udid","emulator-5554");
        caps.setCapability("appium:platformVersion","15");
        caps.setCapability("appium:skipUnlock","true");
        caps.setCapability("appium:noReset",true);
        caps.setCapability("appium:appPackage","com.ziraat.ziraatmobil");
        caps.setCapability("appium:appActivity","com.ziraat.ziraatmobile.SplashActivity");
        caps.setCapability("appium:automationName","uiautomator2");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/"),caps);

    }
    public static AndroidDriver getDriver(){
        return driver;
    }

}

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class CalculaterTest {
    static  AndroidDriver  driver;



    public static void main(String[] args) {
        try {
            openCalculator();
        } catch (Exception e) {
            System.out.println(e.getCause()); ;
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
    public static void openCalculator() throws MalformedURLException, InterruptedException {


  //      //new way to send capabilities with Selenium version4 and connecting with real device with Inbuilt app
//        UiAutomator2Options options = new UiAutomator2Options()
//                .setPlatformName("Android")
//                .setPlatformVersion("10.0.1")
//                .setAutomationName("UiAutomator2")
//                .setDeviceName("OnePlus 5t").setAppPackage("com.oneplus.calculator")
//                .setAppActivity(".Calculator");
//
//        URL url = new URL("http", "0.0.0.0", 4723, "/wd/hub/");
//         driver = new AndroidDriver(url, options);
//       System.out.println("Application started....");
//        Thread.sleep(1000);
//
 //      // connect with android browser on real device
//        UiAutomator2Options options = new UiAutomator2Options()
//                .setPlatformName("Android")
//                .setPlatformVersion("10.0.1")
//                .setAutomationName("UiAutomator2")
//                .withBrowserName("chrome")
//                .setDeviceName("OnePlus 5t");
//
//
//        URL url = new URL("http", "0.0.0.0", 4723, "/wd/hub/");
//        driver = new AndroidDriver(url, options);
//        System.out.println("Application started....");
//        Thread.sleep(1000);
//        driver.get("https://amazon.com");

        //Below case when connecting with emulator
        UiAutomator2Options options = new UiAutomator2Options()
                .setPlatformName("Android")
                .setDeviceName("emulator-5554").setPlatformName("13")
                        .setAutomationName("UiAutomator2")
                .setAppPackage("com.saucelabs.mydemoapp.rn")
                .setAppActivity(".MainActivity").setNewCommandTimeout(Duration.ofDays(3L));



        URL url = new URL("http", "0.0.0.0", 4723, "/wd/hub/");
        AppiumDriver driver = new AndroidDriver(url,options);
        System.out.println("Session id is" + driver.getSessionId());
        Thread.sleep(5000);
        System.out.println("Application started....");
       driver.findElement(AppiumBy.accessibilityId("open menu")).click();
      // driver.findElement(new AppiumBy.ByAndroidUIAutomator("newUiSelector().text(\"open menu\")")).click();
       Thread.sleep(1000);
       driver.findElement(AppiumBy.accessibilityId("menu item log in")).click();
        Thread.sleep(1000);
       driver.findElement(AppiumBy.accessibilityId("Username input field")).sendKeys("bob@example.com");
        driver.findElement(AppiumBy.accessibilityId("Password input field")).sendKeys("10203040");
        driver.findElement(AppiumBy.accessibilityId("Login button")).click();
        Thread.sleep(1000);
        driver.quit();
    }
}


import com.google.gson.stream.JsonReader;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SideMenuOptions extends PageBase{
    public SideMenuOptions(AppiumDriver appiumDriver){
        super(appiumDriver);
    }
    @AndroidFindBy(accessibility = "menu item log in")
    WebElement loginMenu_tap;

    @AndroidFindBy(accessibility = "Username input field")
    WebElement username_txt;

    @AndroidFindBy(accessibility = "Password input field")
    WebElement password_txt;

    @AndroidFindBy(accessibility = "Login button")
    WebElement login_btn;

   // @DataProvider(name == "task data")
//    public Object[][] passData(){
//        return Jso.
//    }


  //  @Test(dataProvider = "task data")
    public void ClickOnHamburgerMenuIcon() throws InterruptedException {
        click(loginMenu_tap);
        Thread.sleep(1000);
    }

    public void enterUsername_txt(){
        sendKeys(username_txt,"bob@example.com");
    }
    public void enterPassword_txt(){
        sendKeys(username_txt,"10203040");
    }
    public void ClickOnLoginMenu(){
        click(login_btn);
    }


//      driver.findElement(AppiumBy.accessibilityId("open menu")).click();
//       Thread.sleep(1000);
//       driver.findElement(AppiumBy.accessibilityId("menu item log in")).click();
//        Thread.sleep(1000);
//       driver.findElement(AppiumBy.accessibilityId("Username input field")).sendKeys("bob@example.com");
//        driver.findElement(AppiumBy.accessibilityId("Password input field")).sendKeys("10203040");
//        driver.findElement(AppiumBy.accessibilityId("Login button")).click();
}

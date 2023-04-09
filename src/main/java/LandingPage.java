import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class LandingPage extends PageBase {

    public LandingPage(AppiumDriver appiumDriver){
        super(appiumDriver);
    }

    @AndroidFindBy(accessibility = "open menu")
    WebElement MenuOptions_tap;

    public void ClickOnHamburgerMenuIcon() throws InterruptedException {
        click(MenuOptions_tap);
        Thread.sleep(1000);
    }
}

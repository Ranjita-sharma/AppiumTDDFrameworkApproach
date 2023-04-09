import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.lang.model.element.Element;
import java.time.Duration;

public class PageBase {
    AppiumDriver driver;
    public static final Duration duration = Duration.ofSeconds(1L);
    public PageBase(AppiumDriver appiumDriver){
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver),this);
        driver = appiumDriver;
    }
    public void waitForVisibility(WebElement elem){
        WebDriverWait wait = new WebDriverWait(driver,duration);
        wait.until(ExpectedConditions.visibilityOf((WebElement) elem));
    }
    public void clear(WebElement elem){
        waitForVisibility(elem);
        elem.clear();
    }
    public void click(WebElement elem){
        waitForVisibility(elem);
        elem.click();
    }
    public void sendKeys(WebElement elem,String txt){
        waitForVisibility(elem);
        elem.sendKeys(txt);
    }
    public String getAttribute(WebElement elem,String attribute){
        waitForVisibility(elem);
        return elem.getAttribute(attribute);
    }
}

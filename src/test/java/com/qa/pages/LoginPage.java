package com.qa.pages;

import com.qa.utils.TestUtils;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {
    AppiumDriver driver;
    TestUtils utils = new TestUtils();

    @AndroidFindBy(accessibility = "open menu")
  //  @iOSXCUITFindBy(id = "open menu")
    private WebElement menuOptns;

    @AndroidFindBy(accessibility = "menu item log in")
  //  @iOSXCUITFindBy(id = "menu item log in")
    private WebElement LoginLnk;
    @AndroidFindBy(accessibility = "Username input field")
    @iOSXCUITFindBy(id = "Username input field")
    private WebElement usernameTxtFld;

    @AndroidFindBy(accessibility = "Password input field")
    @iOSXCUITFindBy(id = "Password input field")
    private WebElement passwordTxtFld;

    @AndroidFindBy(accessibility = "Login button")
    @iOSXCUITFindBy(id = "Login button")
    private WebElement loginBtn;

    @AndroidFindBy (xpath = "//android.view.ViewGroup[@content-desc=\"test-Error message\"]/android.widget.TextView")
    @iOSXCUITFindBy (xpath = "//XCUIElementTypeOther[@name=\"test-Error message\"]/child::XCUIElementTypeStaticText")
    private WebElement errTxt;

    public LoginPage(){
    }

    public void clickOnMenuIcon(){
        driver.findElement(AppiumBy.accessibilityId("open menu")).click();
    //    click(menuOptns);
       // return new LoginPage();
    }
    public void clickOnLoginLink(){
        click(LoginLnk);
  //      return new LoginPage();
    }
       public LoginPage enterUserName(String username) throws InterruptedException {
        clear(usernameTxtFld);
        sendKeys(usernameTxtFld, username, "login with " + username);
        return this;
    }

    public LoginPage enterPassword(String password) {
        clear(passwordTxtFld);
        sendKeys(passwordTxtFld, password, "password is " + password);
        return this;
    }

    public ProductsPage pressLoginBtn() {
        click(loginBtn, "press login button");
        return new ProductsPage();
    }

    public ProductsPage login(String username, String password) throws InterruptedException {
        enterUserName(username);
        enterPassword(password);
        return pressLoginBtn();
    }

    public String getErrTxt() {
        String err = getText(errTxt, "error text is - ");
        return err;
    }

}


package pageObjects_orangehrm;

import commons.BaseElement;
import org.openqa.selenium.WebDriver;
import pageUIs_orangehrm.LoginPageUI;


public class LoginPageObject extends BaseElement {
    WebDriver driver;

    public LoginPageObject(WebDriver driver){
        super(driver);
        this.driver=driver;

    }

    public void clickToLoginButton() {
        waitForElementClickable(driver, LoginPageUI.LOGIN_BUTTON);
        clickToElement(driver,LoginPageUI.LOGIN_BUTTON);
    }
}

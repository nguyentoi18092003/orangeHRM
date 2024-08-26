package pageObjects_orangehrm;

import org.openqa.selenium.WebDriver;
import pageUIs_orangehrm.EmployeeListMenuPageUI;

public class EmployeeListMenuPageObject extends SidebarPageObject{
    WebDriver driver;
    public EmployeeListMenuPageObject(WebDriver driver){
        super(driver);
        this.driver=driver;
    }
    public void clickToLinkByName(String name){
        waitForElementClickable(driver, EmployeeListMenuPageUI.DYNAAMIC_LINK_TEXT_BY_NAME,name);
        clickToElement(driver,EmployeeListMenuPageUI.DYNAAMIC_LINK_TEXT_BY_NAME,name);
    }
}

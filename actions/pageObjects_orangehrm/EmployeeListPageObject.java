package pageObjects_orangehrm;

import org.openqa.selenium.WebDriver;
import pageUIs_orangehrm.EmployeeListPageUI;

public class EmployeeListPageObject extends SidebarPageObject{
    WebDriver driver;

    public EmployeeListPageObject(WebDriver driver){
        super(driver);
        this.driver=driver;

    }
    public void clickToAddButtton() {
        waitForElementClickable(driver, EmployeeListPageUI.ADD_BUTTON);
        clickToElement(driver,EmployeeListPageUI.ADD_BUTTON);
    }

}

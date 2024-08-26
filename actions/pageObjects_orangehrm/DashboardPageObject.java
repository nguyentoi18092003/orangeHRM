package pageObjects_orangehrm;

import org.openqa.selenium.WebDriver;
import pageUIs_orangehrm.DashboardPageUI;

public class DashboardPageObject extends SidebarPageObject{
    public String getNameMyAccount(){
        waitForElementVisible(driver,DashboardPageUI.ACCOUNT_NAME_BUTTON);
        return getElementText(driver,DashboardPageUI.ACCOUNT_NAME_BUTTON);

    };
    WebDriver driver;

    public DashboardPageObject(WebDriver driver){
        super(driver);
        this.driver=driver;

    }
}

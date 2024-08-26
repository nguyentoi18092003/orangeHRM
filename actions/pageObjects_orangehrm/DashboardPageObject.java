package pageObjects_orangehrm;

import org.openqa.selenium.WebDriver;

public class DashboardPageObject extends SidebarPageObject{
    WebDriver driver;

    public DashboardPageObject(WebDriver driver){
        super(driver);
        this.driver=driver;

    }
}

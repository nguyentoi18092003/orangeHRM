package pageObjects_orangehrm;

import org.openqa.selenium.WebDriver;

public class JobTitlesPageObject extends SubMenuPageObject {
    WebDriver driver;
    public JobTitlesPageObject (WebDriver driver){
        super(driver);
        this.driver=driver;
    }
}

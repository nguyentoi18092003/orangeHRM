package pageObjects_orangehrm;

import org.openqa.selenium.WebDriver;

public class JobCategoriesPageObject extends SubMenuPageObject {
    WebDriver driver;
    public JobCategoriesPageObject (WebDriver driver){
        super(driver);
        this.driver=driver;
    }
}


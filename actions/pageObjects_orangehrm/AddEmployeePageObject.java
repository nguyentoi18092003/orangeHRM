package pageObjects_orangehrm;

import org.openqa.selenium.WebDriver;
import pageUIs_orangehrm.AddEmployeePageUI;

public class AddEmployeePageObject extends SidebarPageObject{
    WebDriver driver;

    public AddEmployeePageObject(WebDriver driver){
        super(driver);
        this.driver=driver;

    }

    public void clickToSaveButton() {
        waitForSpinnerIconInvisible();
        waitForElementClickable(driver,AddEmployeePageUI.SAVE_BUTTON);
        clickToElement(driver,AddEmployeePageUI.SAVE_BUTTON);

    }
}

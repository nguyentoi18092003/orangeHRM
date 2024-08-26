package pageObjects_orangehrm;



import commons.BaseElement;
import org.openqa.selenium.WebDriver;
import pageUIs_orangehrm.SidebarPageUI;


public class SidebarPageObject extends BaseElement {
    WebDriver driver;
    public SidebarPageObject(WebDriver driver){
        super(driver);
        this.driver=driver;
    }
    public void clickToSidebarLinkByText(String name){
        waitForElementClickable(driver, SidebarPageUI.DYNAMIC_SIDEBAR_LINK_BY_NAME,name);
        clickToElement(driver,SidebarPageUI.DYNAMIC_SIDEBAR_LINK_BY_NAME,name);

    }

}

package pageUIs_orangehrm;

public class BaseElementUI {
    public static final String DYNAMIC_TEXTBOX_BY_NAME = "css=input[name='%s']";
    public static final String DYNAMIC_TEXTBOX_BY_LABEL = "xpath=//label[text()='%s']/parent::div/following-sibling::div/input";

    public static final String DYNAMIC_ADD_BUTTON = "xpath=//h6[text()='%s']/following-sibling::button";
    public static final String DYNAMIC_CANLENDER_TEXTBOX_BY_LABEL = "xpath=//label[text()='%s']/parent::div/following-sibling::div//input";
    public static final String DYNAMIC_DROPDOWN_PARENT_BY_LABEL="xpath=//label[text()='%s']/parent::div/following-sibling::div//i";
    public static final String DYNAMIC_DROPDOWN_CHILDREN_ITEM_BY_LABEL="xpath=//label[text()='%s']/parent::div/following-sibling::div//div[@role='listbox']/div[@role='option']";
    public static final String DYNAMIC_VALUE_DROPDOWN_BY_LABEL="xpath=//label[text()='%s']/parent::div/following-sibling::div//div[@class='oxd-select-text-input']";
    public static final String SPINNER_ICON ="xpath=//div[@class='oxd-loading-spinner']";
    public static final String DYNAMIC_SAVE_BUTTON_BY_LABEL ="xpath=//h6[text()='%s']/parent::div//button[contains(string(),'Save')]";
    public static final String UPLOAD_FILE_TYPE="xpath=//input[@type='file']";
    public static final String DYNAMIC_SUCCESS_MESSAGE="xpath=//p[contains(@class,'oxd-text--toast-message') and text()='%s']";
    public static final String TEXTAREA="xpath=//textarea";
    public static final String DYNAMIC_INDEX_BY_COLUMN_NAME="xpath=//div[text()='%s']/preceding-sibling::div";
    public static final String DYNAMIC_ROW_VALUE_BY_COLUMN_INDEX_ROW_INDEX="xpath=//div[@class='oxd-table-card']/div[@role='row'][%s]/div[%s]/div[text()='%s']";


}



package com_orangehrm_pim;

import commons.BaseTest;
import commons.PageGeneratorManager;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pageObjects_orangehrm.*;
import pageUIs_orangehrm.BaseElementUI;
import reportConfig.ExtentTestManager;

import java.lang.reflect.Method;

public class PIM_01_Employee extends BaseTest {
    private WebDriver driver;
    private String browserName;//Dung trong cho startTest

    LoginPageObject loginPage;
    DashboardPageObject dashboardPage;
    EmployeeListPageObject employeeListPage;
    AddEmployeePageObject addEmployeePage;
    PersonalDetailsPageObject personalDetails;
    ContactDetailsPageObject contactDetailsPage;
    EmergencyContactsPageObject emergencyContactsPage;
    DependentsPageObject dependentsPage;
    ImmigrationPageObject immigrationPage;
    JobPageObject jobPage;
    SalaryPageObject salaryPage;
    ReportToPageObject reportToPage;
    QualificationsPageObject qualificationsPage;

    @Parameters({"url","browser"})
    @BeforeClass
    public void beforeClass(String url,String browserName){
        driver=getBrowserDriver(browserName,url);
        this.browserName=browserName;
        userName="automationfc";
        password="Automationfc@123";

        firstName="Nguyen";
        lastName="Toi10";

        numberDriver="99999999";
        licenseExpiryDate="2024-08-08";
        nationality="Afghan";
        maritalStatus="Single";

        street1="Nguyen Trai";
        country="Afghanistan";

        emergencyName="Mai";
        emergencyTelephone="0336216898";
        emergencyRelationship="Sister";

        dependentName="Huu";
        dependentRelationship="Other";
        dependentBirth="2024-08-01";
        dependentPleaseSpecify="Khong co";

        immigrationNumber="999999999";
        immigrationIssuedBy="Albania";
        immigrationIssuedDate="2024-08-08";

        jobJoinedDate="2024-08-02";
        jobJobTitle="BackEnd Developer";

        loginPage= PageGeneratorManager.getLoginPage(driver);
        loginPage.enterToTextboxByName(userName,"username");
        loginPage.enterToTextboxByName(password,"password");

        loginPage.clickToLoginButton();

        employeeListPage=PageGeneratorManager.getEmployeeListPage(driver);
        employeeListPage.clickToSidebarLinkByText("PIM");

    }
    @Test
    public void Employee_01_Add_New(Method method){
        ExtentTestManager.startTest(method.getName()+"- Run on "+browserName.toUpperCase(),"Employee_01_Add_New");

        employeeListPage.clickToAddButtton();
        addEmployeePage=PageGeneratorManager.getAddEmployeePage(driver);

        addEmployeePage.enterToTextboxByName(firstName,"firstName");
        addEmployeePage.enterToTextboxByName(lastName,"lastName");

        employeeID=addEmployeePage.getValueInTextBoxByLabel("Employee Id");

        addEmployeePage.clickToSaveButton();

        Assert.assertTrue(addEmployeePage.isSuccessMessageDisplayed("Successfully Saved"));

        addEmployeePage.waitForSpinnerIconInvisible();
        personalDetails=PageGeneratorManager.getPersonalDetailsPage(driver);
        addEmployeePage.waitForSpinnerIconInvisible();

    }
    @Test
    public void Employee_02_Personal_Details(Method method){
        ExtentTestManager.startTest(method.getName()+"- Run on "+browserName.toUpperCase(),"Employee_02_Personal_Details");

        // personalDetails.enterToTextboxByLabel(numberDriver,"Driver's License Number");-> nhu nay la sai nha, viet nhu duoi
        personalDetails.enterToDriverNumberTextbox(numberDriver);
        personalDetails.enterToCanlenderTextboxByLabel(licenseExpiryDate,"License Expiry Date");
        personalDetails.selectToDropdownByLabel(nationality,"Nationality");
        personalDetails.selectToDropdownByLabel(maritalStatus,"Marital Status");
        personalDetails.clickToGenderRadio();
        personalDetails.clickToSaveButtonByLabel("Personal Details");

        Assert.assertTrue(personalDetails.isSuccessMessageDisplayed("Successfully Updated"));
        Assert.assertEquals(personalDetails.getValueInTextBoxByLabel("Employee Id"),employeeID);
        Assert.assertEquals(personalDetails.getValueInCanlenderTextBox("License Expiry Date"),licenseExpiryDate);
        Assert.assertEquals(personalDetails.getValueInDropdownByLabel("Nationality"),nationality);
        Assert.assertEquals(personalDetails.getValueInDropdownByLabel("Marital Status"),maritalStatus);

        personalDetails.clickToAddButtonByLabel("Attachments");
        personalDetails.uploadMultipleFiles(driver,fileNames);
        personalDetails.scrollToElementOnTop(driver, BaseElementUI.DYNAMIC_SAVE_BUTTON_BY_LABEL,"Add Attachment");
        personalDetails.waitForSpinnerIconInvisible();
        personalDetails.clickToSaveButtonByLabel("Add Attachment");

        Assert.assertTrue(personalDetails.isSuccessMessageDisplayed("Successfully Saved"));
        Assert.assertTrue(personalDetails.isValueDisplayedAtColumnName("File Name","1",Anh1));

    }
    @Test
    public void Employee_03_Contact_Details(Method method){
        ExtentTestManager.startTest(method.getName()+"- Run on "+browserName.toUpperCase(),"Employee_03_Contact_Details");
        personalDetails.clickToLinkByName("Contact Details");

        personalDetails.waitForSpinnerIconInvisible();
        contactDetailsPage=PageGeneratorManager.getContactDetailsPage(driver);

        contactDetailsPage.enterToTextboxByLabel(street1,"Street 1");

        contactDetailsPage.waitForSpinnerIconInvisible();
        contactDetailsPage.selectToDropdownByLabel(country,"Country");
        contactDetailsPage.clickToSaveButtonByLabel("Contact Details");

        Assert.assertTrue(contactDetailsPage.isSuccessMessageDisplayed("Successfully Updated"));
        Assert.assertEquals(contactDetailsPage.getValueInTextBoxByLabel("Street 1"),street1);
        Assert.assertEquals(contactDetailsPage.getValueInDropdownByLabel("Country"),country);

        contactDetailsPage.clickToAddButtonByLabel("Attachments");
        contactDetailsPage.uploadMultipleFiles(driver,fileNames);
        contactDetailsPage.scrollToElementOnTop(driver, BaseElementUI.DYNAMIC_SAVE_BUTTON_BY_LABEL,"Add Attachment");
        contactDetailsPage.waitForSpinnerIconInvisible();
        contactDetailsPage.clickToSaveButtonByLabel("Add Attachment");

        Assert.assertTrue(contactDetailsPage.isValueDisplayedAtColumnName("File Name","1",Anh1));

    }
    @Test
    public void Employee_04_Emergency_Contacts(Method method){
        ExtentTestManager.startTest(method.getName()+"- Run on "+browserName.toUpperCase(),"Employee_04_Emergency_Contacts");
        contactDetailsPage.clickToLinkByName("Emergency Contacts");

        contactDetailsPage.waitForSpinnerIconInvisible();
        emergencyContactsPage=PageGeneratorManager.getEmergencyContacts(driver);

        emergencyContactsPage.waitForSpinnerIconInvisible();
        emergencyContactsPage.clickToAddButtonByLabel("Assigned Emergency Contacts");
        emergencyContactsPage.waitForSpinnerIconInvisible();
        emergencyContactsPage.enterToTextboxByLabel(emergencyName,"Name");
        emergencyContactsPage.enterToTextboxByLabel(emergencyRelationship,"Relationship");
        emergencyContactsPage.enterToTextboxByLabel(emergencyTelephone,"Home Telephone");
        emergencyContactsPage.scrollToElementOnDown(driver, BaseElementUI.DYNAMIC_SAVE_BUTTON_BY_LABEL,"Save Emergency Contact");
        emergencyContactsPage.waitForSpinnerIconInvisible();
        emergencyContactsPage.clickToSaveButtonByLabel("Save Emergency Contact");

        Assert.assertTrue(emergencyContactsPage.isSuccessMessageDisplayed("Successfully Saved"));
        Assert.assertTrue(emergencyContactsPage.isValueDisplayedAtColumnName("Name","1",emergencyName));

        emergencyContactsPage.clickToAddButtonByLabel("Attachments");
        emergencyContactsPage.uploadMultipleFiles(driver,fileNames);
        emergencyContactsPage.scrollToElementOnTop(driver, BaseElementUI.DYNAMIC_SAVE_BUTTON_BY_LABEL,"Add Attachment");
        emergencyContactsPage.waitForSpinnerIconInvisible();
        emergencyContactsPage.clickToSaveButtonByLabel("Add Attachment");

        Assert.assertTrue(contactDetailsPage.isValueDisplayedAtColumnName("File Name","1",Anh1));

    }
    @Test
    public void Employee_05_Dependents(Method method){
        ExtentTestManager.startTest(method.getName()+"- Run on "+browserName.toUpperCase(),"Employee_05_Dependents");
        emergencyContactsPage.clickToLinkByName("Dependents");

        emergencyContactsPage.waitForSpinnerIconInvisible();
        dependentsPage=PageGeneratorManager.getDependentsPage(driver);

        dependentsPage.waitForSpinnerIconInvisible();
        dependentsPage.clickToAddButtonByLabel("Assigned Dependents");
        dependentsPage.waitForSpinnerIconInvisible();
        dependentsPage.enterToTextboxByLabel(dependentName,"Name");
        dependentsPage.selectToDropdownByLabel(dependentRelationship,"Relationship");
        dependentsPage.enterToTextboxByLabel(dependentPleaseSpecify,"Please Specify");
        dependentsPage.enterToCanlenderTextboxByLabel(dependentBirth,"Date of Birth");
        dependentsPage.scrollToElementOnDown(driver, BaseElementUI.DYNAMIC_SAVE_BUTTON_BY_LABEL,"Add Dependent");
        dependentsPage.waitForSpinnerIconInvisible();
        dependentsPage.clickToSaveButtonByLabel("Add Dependent");

        Assert.assertTrue(dependentsPage.isSuccessMessageDisplayed("Successfully Saved"));
        Assert.assertTrue(dependentsPage.isValueDisplayedAtColumnName("Name","1",dependentName));

        dependentsPage.clickToAddButtonByLabel("Attachments");
        dependentsPage.uploadMultipleFiles(driver,fileNames);
        dependentsPage.scrollToElementOnTop(driver, BaseElementUI.DYNAMIC_SAVE_BUTTON_BY_LABEL,"Add Attachment");
        dependentsPage.waitForSpinnerIconInvisible();
        dependentsPage.clickToSaveButtonByLabel("Add Attachment");

        Assert.assertTrue(dependentsPage.isValueDisplayedAtColumnName("File Name","1",Anh1));

    }
    @Test
    public void Employee_06_Immigration(Method method){
        ExtentTestManager.startTest(method.getName()+"- Run on "+browserName.toUpperCase(),"Employee_06_Immigration");
        dependentsPage.clickToLinkByName("Immigration");
        dependentsPage.waitForSpinnerIconInvisible();

        personalDetails.waitForSpinnerIconInvisible();
        immigrationPage=PageGeneratorManager.getImmigrationPage(driver);
        immigrationPage.waitForSpinnerIconInvisible();
        immigrationPage.clickToAddButtonByLabel("Assigned Immigration Records");
        immigrationPage.waitForSpinnerIconInvisible();
        immigrationPage.enterToTextboxByLabel(immigrationNumber,"Number");
        immigrationPage.enterToCanlenderTextboxByLabel(immigrationIssuedDate,"Issued Date");
        immigrationPage.selectToDropdownByLabel(immigrationIssuedBy,"Issued By");
        immigrationPage.scrollToElementOnDown(driver, BaseElementUI.DYNAMIC_SAVE_BUTTON_BY_LABEL,"Add Immigration");
        immigrationPage.waitForSpinnerIconInvisible();
        immigrationPage.clickToSaveButtonByLabel("Add Immigration");

        Assert.assertTrue(immigrationPage.isSuccessMessageDisplayed("Successfully Saved"));
        Assert.assertTrue(immigrationPage.isValueDisplayedAtColumnName("Number","1",immigrationNumber));

        immigrationPage.clickToAddButtonByLabel("Attachments");
        immigrationPage.uploadMultipleFiles(driver,fileNames);
        immigrationPage.scrollToElementOnTop(driver, BaseElementUI.DYNAMIC_SAVE_BUTTON_BY_LABEL,"Add Attachment");
        immigrationPage.waitForSpinnerIconInvisible();
        immigrationPage.clickToSaveButtonByLabel("Add Attachment");

        Assert.assertTrue(immigrationPage.isValueDisplayedAtColumnName("File Name","1",Anh1));

    }
    @Test
    public void Employee_07_Job(Method method){
        ExtentTestManager.startTest(method.getName()+"- Run on "+browserName.toUpperCase(),"Employee_07_Job");
        immigrationPage.clickToLinkByName("Job");

        immigrationPage.waitForSpinnerIconInvisible();
        jobPage=PageGeneratorManager.getJobPage(driver);

        jobPage.waitForSpinnerIconInvisible();
        jobPage.enterToCanlenderTextboxByLabel(jobJoinedDate,"Joined Date");
        jobPage.selectToDropdownByLabel(jobJobTitle,"Job Title");

        jobPage.clickToContractDetailsButton();
        jobPage.waitForSpinnerIconInvisible();

        jobPage.uploadMultipleFiles(driver,fileNames);
        jobPage.scrollToElementOnTop(driver, BaseElementUI.DYNAMIC_SAVE_BUTTON_BY_LABEL,"Job Details");
        jobPage.waitForSpinnerIconInvisible();
        jobPage.clickToSaveButtonByLabel("Job Details");

        Assert.assertTrue(jobPage.isSuccessMessageDisplayed("Successfully Updated"));

        jobPage.clickToAddButtonByLabel("Attachments");
        jobPage.uploadMultipleFiles(driver,fileNames);
        jobPage.scrollToElementOnTop(driver, BaseElementUI.DYNAMIC_SAVE_BUTTON_BY_LABEL,"Add Attachment");
        jobPage.waitForSpinnerIconInvisible();
        jobPage.clickToSaveButtonByLabel("Add Attachment");

        Assert.assertTrue(jobPage.isValueDisplayedAtColumnName("File Name","1",Anh1));

    }
    @Test
    public void Employee_08_Salary(Method method){
        ExtentTestManager.startTest(method.getName()+"- Run on "+browserName.toUpperCase(),"Employee_08_Salary");
        jobPage.clickToLinkByName("Salary");
        jobPage.waitForSpinnerIconInvisible();

        salaryPage=PageGeneratorManager.getSalaryPage(driver);
        salaryPage.waitForSpinnerIconInvisible();
        salaryPage.clickToAddButtonByLabel("Attachments");
        salaryPage.uploadMultipleFiles(driver,fileNames);
        salaryPage.scrollToElementOnTop(driver, BaseElementUI.DYNAMIC_SAVE_BUTTON_BY_LABEL,"Add Attachment");
        salaryPage.waitForSpinnerIconInvisible();
        salaryPage.clickToSaveButtonByLabel("Add Attachment");

        Assert.assertTrue(salaryPage.isSuccessMessageDisplayed("Successfully Saved"));
        Assert.assertTrue(salaryPage.isValueDisplayedAtColumnName("File Name","1",Anh1));

    }
    @Test
    public void Employee_09_Report(Method method){
        ExtentTestManager.startTest(method.getName()+"- Run on "+browserName.toUpperCase(),"Employee_09_Report");
        salaryPage.clickToLinkByName("Report-to");
        salaryPage.waitForSpinnerIconInvisible();

        reportToPage=PageGeneratorManager.getReportToPage(driver);
        reportToPage.waitForSpinnerIconInvisible();
        reportToPage.clickToAddButtonByLabel("Attachments");
        reportToPage.uploadMultipleFiles(driver,fileNames);
        reportToPage.scrollToElementOnTop(driver, BaseElementUI.DYNAMIC_SAVE_BUTTON_BY_LABEL,"Add Attachment");
        reportToPage.waitForSpinnerIconInvisible();
        reportToPage.clickToSaveButtonByLabel("Add Attachment");

        Assert.assertTrue(reportToPage.isSuccessMessageDisplayed("Successfully Saved"));
        Assert.assertTrue(reportToPage.isValueDisplayedAtColumnName("File Name","1",Anh1));


    }
    @Test
    public void Employee_10_Qualifications(Method method){
        ExtentTestManager.startTest(method.getName()+"- Run on "+browserName.toUpperCase(),"Employee_10_Qualifications");
        reportToPage.clickToLinkByName("Report-to");
        reportToPage.waitForSpinnerIconInvisible();

        qualificationsPage=PageGeneratorManager.getQualificationsPage(driver);
        qualificationsPage.waitForSpinnerIconInvisible();
        qualificationsPage.clickToAddButtonByLabel("Attachments");
        qualificationsPage.uploadMultipleFiles(driver,fileNames);
        qualificationsPage.scrollToElementOnTop(driver, BaseElementUI.DYNAMIC_SAVE_BUTTON_BY_LABEL,"Add Attachment");
        qualificationsPage.waitForSpinnerIconInvisible();
        qualificationsPage.clickToSaveButtonByLabel("Add Attachment");

        Assert.assertTrue(qualificationsPage.isSuccessMessageDisplayed("Successfully Saved"));
        Assert.assertTrue(qualificationsPage.isValueDisplayedAtColumnName("File Name","1",Anh1));

    }
    @AfterClass
    public void afterClass()
    {
       //closeBrowser();

    }
    private String userName;
    private String password;
    private String firstName,lastName,employeeID,numberDriver,licenseExpiryDate,nationality,maritalStatus;
    private String Anh1="Anh1.jpg";
    private String Anh2="Anh2.jpg";
    private String Anh3="Anh3.jpg";
    private String[] fileNames={Anh1};
    private String street1,country;
    private String emergencyName,emergencyTelephone,emergencyRelationship;
    private String dependentName,dependentRelationship,dependentBirth,dependentPleaseSpecify;
    private String immigrationNumber,immigrationIssuedDate,immigrationIssuedBy;
    private String jobJoinedDate,jobJobTitle;
}

package commons;

import org.openqa.selenium.WebDriver;
import pageObjects_orangehrm.*;
import pageUIs_orangehrm.DashboardPageUI;

public class PageGeneratorManager {

    public static AddEmployeePageObject getAddEmployeePage(WebDriver driver){
        return new AddEmployeePageObject(driver);
    }

    public static ContactDetailsPageObject getContactDetailsPage(WebDriver driver){
        return new ContactDetailsPageObject(driver);
    }

    public static DashboardPageObject  getDashboardPage(WebDriver driver){
        return new DashboardPageObject(driver);
    }
    public static DependentsPageObject getDependentsPage(WebDriver driver){
        return new DependentsPageObject(driver);
    }
    public static EmergencyContactsPageObject getEmergencyContactsPage(WebDriver driver){
        return new EmergencyContactsPageObject(driver);
    }
    public static EmergencyContactsPageObject getEmergencyContacts(WebDriver driver){
        return new EmergencyContactsPageObject(driver);
    }
    public static EmployeeListPageObject getEmployeeListPage(WebDriver driver){
        return new EmployeeListPageObject(driver);
    }
    public static ImmigrationPageObject getImmigrationPage(WebDriver driver){
        return new ImmigrationPageObject(driver);
    }
    public static JobPageObject getJobPage(WebDriver driver){
        return new JobPageObject(driver);
    }
    public static LoginPageObject getLoginPage(WebDriver driver){
        return new LoginPageObject(driver);
    }
    public static PersonalDetailsPageObject getPersonalDetailsPage(WebDriver driver){
        return new PersonalDetailsPageObject(driver);
    }
    public static QualificationsPageObject getQualificationsPage(WebDriver driver){
        return new QualificationsPageObject(driver);
    }
    public static ReportToPageObject getReportToPage(WebDriver driver){
        return new ReportToPageObject(driver);
    }
    public static SalaryPageObject getSalaryPage(WebDriver driver){
        return new SalaryPageObject(driver);
    }
    public static SidebarPageObject getSidebarObject(WebDriver driver){
        return new SidebarPageObject(driver);
    }
    public static AdminPageObject getAdminPageObject(WebDriver driver){
        return new AdminPageObject(driver);
    }
    public static EmploymentStatusPageObject getEmploymentStatusPage(WebDriver driver){
        return new EmploymentStatusPageObject(driver);
    }

    public static JobCategoriesPageObject getJobCategoriesPage(WebDriver driver){
        return new JobCategoriesPageObject(driver);
    }
    public static JobTitlesPageObject getJobTitlesPage(WebDriver driver){
        return new  JobTitlesPageObject(driver);
    }
    public static PayGradesPageObject getPayGradesPage (WebDriver driver){
        return new PayGradesPageObject(driver);
    }

}

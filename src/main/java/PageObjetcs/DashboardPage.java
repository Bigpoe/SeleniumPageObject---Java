package PageObjetcs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class DashboardPage {

    WebDriver driver;

    //Constructor
    public DashboardPage(WebDriver driver) {
        this.driver = driver;
    }

    //Put the focus on the Admin button
    public void hoverAdminButton(){
        WebElement admin = driver.findElement(By.id("menu_admin_viewAdminModule"));
        new Actions(driver)
                .moveToElement(admin)
                .perform();
    }

    ////// Here begins the actions on Admin button //////
    //Click on the Admin button
    public void clickAdminButton(){
        WebElement admin = driver.findElement(By.id("menu_admin_viewAdminModule"));
        admin.click();
    }

    //Put the focus on User Management button
    public void hoverUserManagementButton(){
        WebElement management = driver.findElement(By.id("menu_admin_UserManagement"));
        new Actions(driver)
                .moveToElement(management)
                .perform();
    }

    //Click "Users" button inside "User Management" dropdown
    public void clickUsersButton(){
        WebElement user = driver.findElement(By.id("menu_admin_viewSystemUsers"));
        new Actions(driver)
                .moveToElement(user)
                .click()
                .perform();
    }

    //Put the focus on Job button
    public void hoverJobButton(){
        WebElement job = driver.findElement(By.id("menu_admin_UserManagement"));
        new Actions(driver)
                .moveToElement(job)
                .perform();
    }

    //Click "Job Titles" button inside "Job" dropdown
    public void jobTitlesButton(){
        WebElement titles = driver.findElement(By.id("menu_admin_viewJobTitleList"));
        titles.click();
    }

    //Click "Pay Grades" button inside "Job" dropdown
    public void payGradesButton(){
        WebElement grades = driver.findElement(By.id("menu_admin_viewPayGrades"));
        grades.click();
    }

    //Click "Employment status" button inside "Job" dropdown
    public void employmentStatusButton(){
        WebElement status = driver.findElement(By.id("menu_admin_employmentStatus"));
        status.click();
    }

    //Click "Job Categories" button inside "Job" dropdown
    public void jobCategoriesButton(){
        WebElement categories = driver.findElement(By.id("menu_admin_jobCategory"));
        categories.click();
    }

    //Click "Work shifts" button inside "Job" dropdown
    public void workShiftsButton(){
        WebElement shifts = driver.findElement(By.id("menu_admin_workShift"));
        shifts.click();
    }

    //Put the focus on Organization button
    public void hoverOrganizationButton(){
        WebElement organization = driver.findElement(By.id("menu_admin_UserManagement"));
        new Actions(driver)
                .moveToElement(organization)
                .perform();
    }

    //Click "General information" button inside "Organization" dropdown
    public void generalInformationButton(){
        WebElement generalInfo = driver.findElement(By.id("menu_admin_viewOrganizationGeneralInformation"));
        generalInfo.click();
    }

    //Click "Locations" button inside "Organization" dropdown
    public void locationsButton(){
        WebElement locations = driver.findElement(By.id("menu_admin_viewLocations"));
        locations.click();
    }

    //Click "Structure" button inside "Organization" dropdown
    public void structureButton(){
        WebElement structure = driver.findElement(By.id("menu_admin_viewCompanyStructure"));
        structure.click();
    }

    //Put the focus on "Qualifications" button
    public void hoverQualificationsButton(){
        WebElement qualifications = driver.findElement(By.id("menu_admin_Qualifications"));
        new Actions(driver)
                .moveToElement(qualifications)
                .perform();
    }

    //Click "Skills" button inside "Qualifications" dropdown
    public void skillsButton(){
        WebElement skills = driver.findElement(By.id("menu_admin_viewSkills"));
        skills.click();
    }

    //Click "Education" button inside "Qualifications" dropdown
    public void educationButton(){
        WebElement education = driver.findElement(By.id("menu_admin_viewEducation"));
        education.click();
    }

    //Click "Licenses " button inside "Qualifications" dropdown
    public void licensesButton(){
        WebElement licenses = driver.findElement(By.id("menu_admin_viewLicenses"));
        licenses.click();
    }

    //Click "Languages" button inside "Qualifications" dropdown
    public void languagesButton(){
        WebElement languages = driver.findElement(By.id("menu_admin_viewLanguages"));
        languages.click();
    }

    //Click "Memberships" button inside "Qualifications" dropdown
    public void membershipsButton(){
        WebElement memberships = driver.findElement(By.id("menu_admin_membership"));
        memberships.click();
    }

    //Put the focus and click on "Nationalities" button
    public void hoverNationalitiesButton(){
        WebElement nationalities = driver.findElement(By.id("menu_admin_nationality"));
        new Actions(driver)
                .moveToElement(nationalities)
                .click()
                .perform();
    }

    //Put the focus on "Configuration" button
    public void hoverConfigurationButton(){
        WebElement configuration = driver.findElement(By.id("menu_admin_Configuration"));
        new Actions(driver)
                .moveToElement(configuration)
                .click()
                .perform();
    }

    //Click "Email Configuration" button inside "Configuration" dropdown
    public void emailConfigurationButton(){
        WebElement emailConf = driver.findElement(By.id("menu_admin_listMailConfiguration"));
        emailConf.click();
    }

    //Click "Email Subscription" button inside "Configuration" dropdown
    public void emailSubscriptionButton(){
        WebElement emailSub = driver.findElement(By.id("menu_admin_viewEmailNotification"));
        emailSub.click();
    }

    //Click "Localization" button inside "Configuration" dropdown
    public void localizationButton(){
        WebElement localization = driver.findElement(By.id("menu_admin_localization"));
        localization.click();
    }

    //Click "Modules" button inside "Configuration" dropdown
    public void modulesButton(){
        WebElement modules = driver.findElement(By.id("menu_admin_viewModules"));
        modules.click();
    }

    //Click "Social Media Authentication" button inside "Configuration" dropdown
    public void mediaButton(){
        WebElement media = driver.findElement(By.id("menu_admin_openIdProvider"));
        media.click();
    }


    ////// Here ends the actions on Admin button //////


    ////// Here begins the actions on PIM button //////

    public void clickPIMButton(){
        WebElement pim = driver.findElement(By.id("menu_pim_viewPimModule"));
        pim.click();
    }

    public void hoverPIMButton(){
        WebElement pim = driver.findElement(By.id("menu_pim_viewPimModule"));
        new Actions(driver)
                .moveToElement(pim)
                .perform();
    }


}

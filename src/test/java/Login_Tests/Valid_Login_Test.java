package Login_Tests;

import PageObjetcs.BasePage;
import PageObjetcs.DashboardPage;
import PageObjetcs.LoginPage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Valid_Login_Test extends BasePage{

    //Uncomment this    public WebDriver driver;
    LoginPage login;// = new LoginPage(driver);//Instance loginPage
    DashboardPage dashboard;

    @BeforeClass
    public void setup(){
        this.driver = new ChromeDriver();
        login = new LoginPage(driver);
        dashboard = new DashboardPage(driver);
    }

    @Test
    public void ValidLogin(){
        //driver.get(baseURL); //Get the URL from BasePage//Uncomment this
        openPage();
        login.fillEmailField("Admin");
        login.fillPasswordField("admin");
        login.clickLoginButton();
        //dashboard.clickAdminButton();

        dashboard.hoverAdminButton();

        //dashboard.clickPIMButton();
    }

}

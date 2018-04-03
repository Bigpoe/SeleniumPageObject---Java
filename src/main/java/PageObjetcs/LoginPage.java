package PageObjetcs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    //Uncomment this
    //public static String baseURL = "http://opensource.demo.orangehrmlive.com/";


    WebDriver driver;
    //Methods

    public LoginPage(WebDriver driver){
        this.driver= driver;
    }

    public void fillEmailField(String email){
        WebElement element = driver.findElement(By.id("txtUsername"));
        element.sendKeys(email);
    }

    public void fillPasswordField(String pass){
        WebElement element = driver.findElement(By.id("txtPassword"));
        element.sendKeys(pass);
    }

    public void clickLoginButton(){
        WebElement button = driver.findElement(By.id("btnLogin"));
        button.submit();
    }

}

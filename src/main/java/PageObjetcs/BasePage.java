package PageObjetcs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {

    public WebDriver driver;
    public static String baseURL = "http://opensource.demo.orangehrmlive.com/";

    //Open the web page for the whole test suite
    public void openPage(){
        driver.get(baseURL);
    }

    //Clicks on the header logo
    public void clickLogo(){
        WebElement logo = driver.findElement(By.cssSelector("#branding > a:nth-child(1) > img"));
        logo.click();
    }

}

package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HRMHomePageTest {

    WebDriver driver=null;
    By uname= By.id("txtUsername");
    By pwd= By.id("txtPassword");
    By loginbtn= By.id("btnLogin");


    //Parametrized constructor
 public HRMHomePageTest(WebDriver driver) {

     this.driver = driver;
 }

 public void enterUsername(String user){
        driver.findElement(uname).sendKeys(user);
    }
 public void enterPassword(String pass){
        driver.findElement(pwd).sendKeys(pass);
    }
 public void clickLogin(){
        driver.findElement(loginbtn).click();
 }

}

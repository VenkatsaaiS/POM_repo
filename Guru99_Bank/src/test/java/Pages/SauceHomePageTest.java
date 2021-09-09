package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SauceHomePageTest {

    WebDriver driver=null;

    By uname= By.id("user-name");
    By pwd= By.id("password");
    By loginbtn= By.id("login-button");

  public SauceHomePageTest(WebDriver driver){

           this.driver=driver;
  }
     public  void enterUsername(String user){
      driver.findElement(uname).sendKeys(user);
     }
     public void enterPassword(String pass){
      driver.findElement(pwd).sendKeys(pass);
     }
     public void clickLogin(){
      driver.findElement(loginbtn).click();
     }

}
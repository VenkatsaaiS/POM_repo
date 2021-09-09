package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SauceDashboardPageTest {

    WebDriver driver=null;

 By menu_bar= By.id("react-burger-menu-btn");
 By logoutbtn=By.id("logout_sidebar_link");


  public SauceDashboardPageTest(WebDriver driver){

      this.driver=driver;
  }

  public void clickMenubar(){
      driver.findElement(menu_bar).click();
  }
  public void clickLogout(){
      driver.findElement(logoutbtn).click();
  }

}

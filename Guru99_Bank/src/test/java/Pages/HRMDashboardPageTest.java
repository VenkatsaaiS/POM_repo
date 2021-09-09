package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HRMDashboardPageTest {

    WebDriver driver=null;

    //Parametrized constructor
    public HRMDashboardPageTest(WebDriver driver){
             this.driver=driver;
    }

  By welcome= By.id("welcome");
  By logoutbtn= By.xpath("//*[@id=\"welcome-menu\"]/ul/li[3]/a");

  //Initializing Methods
  public  void clickWelcome(){
      driver.findElement(welcome).click();
  }

  public void clickLogout() {
      driver.findElement(logoutbtn).click();
  }
}

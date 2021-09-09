package Tests;

import Pages.HRMDashboardPageTest;
import Pages.HRMHomePageTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class HRMLoginTest {

    public static void main(String[] args)  {
        WebDriverManager.chromedriver().setup();
        //Instantiating Webdriver
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
        driver.get("https://opensource-demo.orangehrmlive.com/");

        HRMDashboardPageTest dashboardPage=new HRMDashboardPageTest(driver);

        HRMHomePageTest homePage=new HRMHomePageTest(driver);

        homePage.enterUsername("Admin");
        homePage.enterPassword("admin123");
        homePage.clickLogin();

        dashboardPage.clickWelcome();
     //   driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        dashboardPage.clickLogout();


        System.out.println("Orange HRM Page launched successfully....");
        driver.close();


    }
}

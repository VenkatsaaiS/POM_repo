package Tests;

import Pages.SauceDashboardPageTest;
import Pages.SauceHomePageTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SauceLoginTest {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        //Instantiating Webdriver
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://www.saucedemo.com/");
     //   driver.get("https://opensource-demo.orangehrmlive.com/");

        SauceHomePageTest homePageTest= new SauceHomePageTest(driver);

        SauceDashboardPageTest dashboardPageTest = new SauceDashboardPageTest(driver);

        homePageTest.enterUsername("standard_user");
        homePageTest.enterPassword("secret_sauce");
        homePageTest.clickLogin();

        dashboardPageTest.clickMenubar();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        dashboardPageTest.clickLogout();

        System.out.println("Login Successful.....");
        driver.quit();
    }
}

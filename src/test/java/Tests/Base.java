package Tests;

import Pages.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base {

  WebDriver driver;

    // All page objects - initialized in setUp


    @BeforeMethod
    public void setUp() {
        // Initialize browser
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://your-inventory-app.com");

        // Initialize ALL page objects using PageFactory
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        RegistrationPage registrationPage = PageFactory.initElements(driver, RegistrationPage.class);
        DashboardPage dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
        WizardStep1Page wizardStep1Page = PageFactory.initElements(driver, WizardStep1Page.class);


    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }


}

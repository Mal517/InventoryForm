package Tests;

import Pages.LoginPage;
import Pages.RegistrstionPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
protected LoginPage loginPage;


public class Base {

    protected WebDriver driver;

    // All page objects - initialized in setUp


    @BeforeMethod
    public void setUp() {
        // Initialize browser
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://your-inventory-app.com");

        // Initialize ALL page objects using PageFactory
        loginPage = PageFactory.initElements(driver, LoginPage.LoginPage.class);
        registrationPage = PageFactory.initElements(driver, RegistrstionPage.RegistrationPage.class);
        dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
        wizardStep1Page = PageFactory.initElements(driver, WizardStep1Page.class);
        wizardStep2Page = PageFactory.initElements(driver, WizardStep2Page.class);
        cartReviewPage = PageFactory.initElements(driver, CartReviewPage.class);
        orderHistoryPage = PageFactory.initElements(driver, OrderHistoryPage.class);
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }



}

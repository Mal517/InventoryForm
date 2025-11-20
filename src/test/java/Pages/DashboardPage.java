package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class DashboardPage {


    public WebDriver driver;

    @FindBy(id = "dashboardTabs")
    private WebElement dashboardTabs;

    @FindBy(id = "logoutButton")
    private WebElement logoutButton;

    @FindBy(id = "startWizardButton")
    private WebElement startWizardButton;

    @FindBy(id = "viewHistoryButton")
    private WebElement viewHistoryButton;

    public DashboardPage(WebDriver  driver) {
        this.driver = driver;
    }
    public boolean areTabsVisible(){
        return dashboardTabs.isDisplayed();
    }

    public void clickLogout() {
        logoutButton.click();
    }

    public void clickStartWizard() {
        startWizardButton.click();
    }

    public void clickViewHistory() {
        viewHistoryButton.click();
    }

    public String getAuthToken() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        return (String) js.executeScript("return localStorage.getItem('authToken');");
    }
}








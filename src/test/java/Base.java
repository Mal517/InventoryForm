


import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

    public class LoginPage extends Base {

        @FindBy(id = "username")
        private WebElement usernameField;

        @FindBy(id = "password")
        private WebElement passwordField;

        @FindBy(id = "loginButton")
        private WebElement loginButton;

        @FindBy(id = "registerLink")
        private WebElement registerLink;

        public LoginPage(WebDriver driver) {

                this.driver = driver;

        }

        public void enterUsername(String username) {
            usernameField.clear();
            usernameField.sendKeys(username);
        }

        public void enterPassword(String password) {
            passwordField.clear();
            passwordField.sendKeys(password);
        }

        public DashboardPage clickLogin() {
            loginButton.click();
            return new DashboardPage(driver);
        }

        public DashboardPage login(String username, String password) {
            enterUsername(username);
            enterPassword(password);
            return clickLogin();
        }

        public String getAlertText() {
            wait.until(ExpectedConditions.alertIsPresent());
            Alert alert = driver.switchTo().alert();
            String text = alert.getText();
            alert.accept();
            return text;
        }

        public RegistrationPage clickRegisterLink() {
            registerLink.click();
            return new RegistrationPage(driver);
        }

        public boolean isAuthTokenPresent() {
            String token = getLocalStorageItem("authToken");
            return token != null && !token.isEmpty();
        }
    }



}

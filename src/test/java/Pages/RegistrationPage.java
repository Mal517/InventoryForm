package Pages;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class RegistrationPage {


        public WebDriver driver;

        @FindBy(id = "regEmail")
        private WebElement emailField;

        @FindBy(id = "regPassword")
        private WebElement passwordField;

        @FindBy(id = "regConfirmPassword")
        private WebElement confirmPasswordField;

        @FindBy(id = "registerButton")
        private WebElement registerButton;

        @FindBy(id = "backToLogin")
        private WebElement backToLoginLink;

        public RegistrationPage(WebDriver driver) {
            this.driver = driver;
        }
        public void enterEmail(String email) {
            emailField.clear();
            emailField.sendKeys(email);
        }

        public void enterPassword(String password) {
            passwordField.clear();
            passwordField.sendKeys(password);
        }

        public void enterConfirmPassword(String confirmPassword) {
            confirmPasswordField.clear();
            confirmPasswordField.sendKeys(confirmPassword);
        }

        public void clickRegister() {
            registerButton.click();
        }

        public void register(String email, String password, String confirmPassword) {
            enterEmail(email);
            enterPassword(password);
            enterConfirmPassword(confirmPassword);
            clickRegister();
        }

        public String getAlertText() {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.alertIsPresent());
            Alert alert = driver.switchTo().alert();
            String text = alert.getText();
            alert.accept();
            return text;
        }

        public void clickBackToLogin() {
            backToLoginLink.click();
        }
    }









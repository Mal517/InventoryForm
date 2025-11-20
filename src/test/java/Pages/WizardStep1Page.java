package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class WizardStep1Page {


    public WebDriver driver;

    @FindBy(id = "deviceType")
    private WebElement deviceTypeDropdown;

    @FindBy(id = "brand")
    private WebElement brandDropdown;

    @FindBy(id = "storage")
    private WebElement storageDropdown;

    @FindBy(id = "quantity")
    private WebElement quantityField;

    @FindBy(id = "address")
    private WebElement addressField;

    @FindBy(id = "nextButton")
    private WebElement nextButton;

    @FindBy(id = "errorSummary")
    private WebElement errorSummary;

    @FindBy(id = "deviceError")
    private WebElement deviceError;

    @FindBy(id = "storageError")
    private WebElement storageError;

    @FindBy(id = "quantityError")
    private WebElement quantityError;

    @FindBy(id = "addressError")
    private WebElement addressError;

    @FindBy(id = "unitPrice")
    private WebElement unitPrice;

    @FindBy(id = "subtotal")
    private WebElement subtotal;

    public void selectDeviceType(String device) {
        new Select(deviceTypeDropdown).selectByVisibleText(device);
    }

    public void selectBrand(String brand) {
        new Select(brandDropdown).selectByVisibleText(brand);
    }

    public void selectStorage(String storage) {
        new Select(storageDropdown).selectByVisibleText(storage);
    }

    public void enterQuantity(String quantity) {
        quantityField.clear();
        quantityField.sendKeys(quantity);
    }

    public void enterAddress(String address) {
        addressField.clear();
        addressField.sendKeys(address);
    }

    public void clickNext() {
        nextButton.click();
    }

    public String getDeviceError() {
        return deviceError.getText();
    }

    public String getStorageError() {
        return storageError.getText();
    }

    public String getQuantityError() {
        return quantityError.getText();
    }

    public String getAddressError() {
        return addressError.getText();
    }

    public boolean isErrorSummaryVisible() {
        return errorSummary.isDisplayed();
    }

    public String getUnitPrice() {
        return unitPrice.getText();
    }

    public String getSubtotal() {
        return subtotal.getText();
    }
}




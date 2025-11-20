package Tests;

import org.testng.annotations.Test;



public class InventoryTests extends Base{

    public void verifyHomePageIsDisplayed() {
        homePage.verifyHomePageIsDisplayed();
    }

    // top-level starter: no dependsOnMethods
    @Test(dependsOnMethods = {" verifyHomePageIsDisplayed"})
    public void clickLearningMaterial() {
        homePage.clickLearningMaterial();
    }
}

//    // depends on the starter
//    @Test(dependsOnMethods = {"setupInventory"})
//    public void addItemToInventory() {
//        // test adding an item
//    }
//
//    // depends on addItemToInventory (will run after it)
//
//    @Test(dependsOnMethods = {"addItemToInventory"})
//    public void updateItemQuantity() {
//        // test updating quantity
//    }
//
//
//    @AfterTest
//    public void closeBrowser() {
//        driver.quit();
//    }
//}
//




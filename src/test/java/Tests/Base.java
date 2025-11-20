package Tests;

import Pages.*;
import Utils.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Base {


    BrowserFactory browserFactory = new BrowserFactory();

    final WebDriver driver = browserFactory.startBrowser("chrome", "https://www.ndosiautomation.co.za/");




        // Initialize ALL page objects using PageFactory
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);



}



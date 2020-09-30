package com.falabella.services;

import com.falabella.pagesobject.HomePage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HomeServices {

    private WebDriver driver;
    private HomePage homePage;

    public HomeServices(WebDriver driver) {
        this.driver = driver;
        this.homePage = new HomePage(driver);
    }

    public void clickOnCloseAlert() {
        homePage.closeAlert.click();
    }

    public void enterSearchProduct(String description) {
        homePage.inputSearch.sendKeys(description);
        homePage.inputSearch.sendKeys(Keys.chord(Keys.ENTER));
    }

    public void selectProduct(String description) {
        driver.findElement(homePage.product(description)).click();
    }
}

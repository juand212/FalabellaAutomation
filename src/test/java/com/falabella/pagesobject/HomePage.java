package com.falabella.pagesobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "fake-close")
    public WebElement closeAlert;

    @FindBy(xpath = "(//input[@data-testid='input-search-box'])[2]")
    public WebElement inputSearch;

    public By product(String description) {
        return By.xpath("//b[contains(text(),'" + description + "')]");
    }
}

package com.falabella.pagesobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShippingOptionsPage extends BasePage {

    public ShippingOptionsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "(//h2)[1]")
    public WebElement titleShipping;

    @FindBy(xpath = "(//h2)[2]")
    public WebElement titleOrderSummary;
}

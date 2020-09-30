package com.falabella.pagesobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PreviewShoppingCartPage extends BasePage {

    public PreviewShoppingCartPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "linkButton")
    public WebElement seeShoppingCart;
}

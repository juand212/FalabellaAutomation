package com.falabella.pagesobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsDetailsPage extends BasePage{

    public ProductsDetailsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "buttonForCustomers")
    public WebElement addToCart;
}

package com.falabella.questions;

import com.falabella.pagesobject.ShippingOptionsPage;
import org.openqa.selenium.WebDriver;

public class ValidateOrderProduct {

    private ShippingOptionsPage shippingOptions;

    public ValidateOrderProduct(WebDriver driver) {
        this.shippingOptions = new ShippingOptionsPage(driver);
    }

    public boolean present() {
        return shippingOptions.titleShipping.isDisplayed() &&
                shippingOptions.titleOrderSummary.isDisplayed();
    }
}

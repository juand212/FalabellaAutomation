package com.falabella.services;

import com.falabella.pagesobject.PreviewShoppingCartPage;
import org.openqa.selenium.WebDriver;

public class PreviewShoppingCartServices {

    private PreviewShoppingCartPage previewShoppingCart;

    public PreviewShoppingCartServices(WebDriver driver) {
        this.previewShoppingCart = new PreviewShoppingCartPage(driver);
    }

    public void clickOnSeeShoppingCart() {
        previewShoppingCart.seeShoppingCart.click();
    }

}

package com.falabella.tasks;

import com.falabella.services.ShoppingCartServices;
import org.openqa.selenium.WebDriver;

public class ToBuy {

    private ShoppingCartServices shoppingCart;

    public ToBuy(WebDriver driver) {
        this.shoppingCart = new ShoppingCartServices(driver);
    }

    public void products(int quantity, String warranty) throws InterruptedException {
        shoppingCart.selectQuantity(quantity);
        shoppingCart.selectWarranty(warranty);
        shoppingCart.clickOnToBuy();
    }

}

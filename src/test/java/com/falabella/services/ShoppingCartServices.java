package com.falabella.services;

import com.falabella.pagesobject.ShoppingCartPage;
import org.openqa.selenium.WebDriver;

public class ShoppingCartServices {

    private ShoppingCartPage shoppingCart;
    private WebDriver driver;

    public ShoppingCartServices(WebDriver driver) {
        this.driver = driver;
        this.shoppingCart = new ShoppingCartPage(driver);
    }

    public void selectQuantity(int quantity) throws InterruptedException {
        for (int i = 1; i < quantity; i++) {
            Thread.sleep(1000);
            shoppingCart.btnQuantity.click();
        }
    }

    public void selectWarranty(String warranty) {
        shoppingCart.lstWarranty.click();
        driver.findElement(shoppingCart.itemList(warranty)).click();
    }

    public void clickOnToBuy() throws InterruptedException {
        Thread.sleep(1000);
        shoppingCart.btnToBuy.click();
    }
}

package com.falabella.tasks;

import com.falabella.services.HomeServices;
import com.falabella.services.PreviewShoppingCartServices;
import com.falabella.services.ProductsDetailsServices;
import org.openqa.selenium.WebDriver;

public class SelectProduct {

    private HomeServices homeServices;
    private ProductsDetailsServices productsDetails;
    private PreviewShoppingCartServices previewShoppingCart;

    public SelectProduct(WebDriver driver) {
        this.homeServices = new HomeServices(driver);
        this.productsDetails = new ProductsDetailsServices(driver);
        this.previewShoppingCart = new PreviewShoppingCartServices(driver);
    }

    public SelectProduct withdescription(String description) {
        homeServices.clickOnCloseAlert();
        homeServices.enterSearchProduct(description);
        homeServices.selectProduct(description);
        return this;
    }

    public void addToCart() {
        productsDetails.clickOnAddToCart();
        previewShoppingCart.clickOnSeeShoppingCart();
    }
}

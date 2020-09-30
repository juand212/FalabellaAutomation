package com.falabella.services;

import com.falabella.pagesobject.ProductsDetailsPage;
import org.openqa.selenium.WebDriver;

public class ProductsDetailsServices {

    private WebDriver driver;
    private ProductsDetailsPage productsDetails;

    public ProductsDetailsServices(WebDriver driver) {
        this.driver = driver;
        this.productsDetails = new ProductsDetailsPage(driver);
    }

    public void clickOnAddToCart() {
        productsDetails.addToCart.click();
    }
}

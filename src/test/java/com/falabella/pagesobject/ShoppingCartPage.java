package com.falabella.pagesobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends BasePage {

    public ShoppingCartPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//span[@class='icon-secure']")
    public WebElement btnToBuy;

    @FindBy(xpath = "//button[@title='Aumentar la cantidad']")
    public WebElement btnQuantity;

    @FindBy(xpath = "//span[@class='fb-inline-dropdown__link__icon icon-bottom']//parent::a")
    public WebElement lstWarranty;

    public By itemList(String value) {
        return By.xpath("//a[@class='fb-inline-dropdown__item-link' and contains(text(),'" + value + "')]");
    }

}

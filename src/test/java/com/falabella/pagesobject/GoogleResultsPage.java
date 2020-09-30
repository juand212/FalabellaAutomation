package com.falabella.pagesobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoogleResultsPage extends BasePage {

    public GoogleResultsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//span[contains(text(),'Falabella.com - Bienvenidos a Nuestra Tienda Online')]")
    public WebElement lnkFalabella;
}

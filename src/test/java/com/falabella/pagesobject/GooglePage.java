package com.falabella.pagesobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GooglePage extends BasePage {

    public GooglePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[@title='Buscar']")
    public WebElement inputSearch;

    @FindBy(xpath = "(//input[@name='btnK' and @value='Buscar con Google'])[2]")
    public WebElement btnSubmit;

}

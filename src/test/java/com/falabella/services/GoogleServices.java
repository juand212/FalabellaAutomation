package com.falabella.services;

import com.falabella.pagesobject.GooglePage;
import org.openqa.selenium.WebDriver;

public class GoogleServices {

    private GooglePage google;

    public GoogleServices(WebDriver driver) {
        this.google = new GooglePage(driver);
    }

    public void enterSearch(String criterial) {
        google.inputSearch.sendKeys(criterial);
    }

    public void clickOnSubmit() {
        google.btnSubmit.click();
    }
}

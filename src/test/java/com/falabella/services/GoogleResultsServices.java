package com.falabella.services;

import com.falabella.pagesobject.GoogleResultsPage;
import org.openqa.selenium.WebDriver;

public class GoogleResultsServices {

    private GoogleResultsPage googleResults;

    public GoogleResultsServices(WebDriver driver) {
        this.googleResults = new GoogleResultsPage(driver);
    }

    public void clickOnLnkFalabella() {
        googleResults.lnkFalabella.click();
    }
}

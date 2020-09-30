package com.falabella.tasks;

import com.falabella.services.GoogleResultsServices;
import com.falabella.services.GoogleServices;
import org.openqa.selenium.WebDriver;

public class Search {

    private GoogleServices google;
    private GoogleResultsServices googleResults;

    public Search(WebDriver driver) {
        this.google = new GoogleServices(driver);
        this.googleResults = new GoogleResultsServices(driver);
    }

    public void withInfo(String criterial) {
        google.enterSearch(criterial);
        google.clickOnSubmit();
        googleResults.clickOnLnkFalabella();
    }

}

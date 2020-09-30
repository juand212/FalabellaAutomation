package com.falabella.tasks;

import org.openqa.selenium.WebDriver;

public class NavigateTo {

    private final WebDriver driver;

    private final String url = "http://google.com/";

    public NavigateTo(WebDriver driver) {
        this.driver = driver;
    }

    public void googleSearch() {
        this.driver.get(url);
    }

}

package com.falabella;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/ShoppingCart.feature",
        glue = "com.falabella"
)
public class ShoppingCartRunner {
}

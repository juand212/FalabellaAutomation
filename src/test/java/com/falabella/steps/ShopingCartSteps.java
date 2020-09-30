package com.falabella.steps;

import com.falabella.config.HookDriver;
import com.falabella.questions.ValidateOrderProduct;
import com.falabella.tasks.NavigateTo;
import com.falabella.tasks.Search;
import com.falabella.tasks.SelectProduct;
import com.falabella.tasks.ToBuy;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class ShopingCartSteps {

    WebDriver driver = HookDriver.getDriver();

    @Given("^El Usuario requiere navegar al buscador de google$")
    public void navigateToGoogle() {
        NavigateTo navigateTo = new NavigateTo(driver);
        navigateTo.googleSearch();
    }

    @Given("^Buscar e ingresar al ecommerce de (.*)$")
    public void searchAndEnterToFalabella(String ecommerce) {
        Search search = new Search(driver);
        search.withInfo(ecommerce);
    }

    @When("^El busca y selecciona el articulo (.*) para agregar a la bolsa$")
    public void searchAndSelectProduct(String product) {
        SelectProduct selectProduct = new SelectProduct(driver);
        selectProduct
                .withdescription(product)
                .addToCart();
    }

    @When("^El define la cantidad (.*) agregando garantia extendida de (.*) para comprar$")
    public void defineQuantityAndWarranty(int quantity, String warranty) throws InterruptedException {
        ToBuy toBuy = new ToBuy(driver);
        toBuy.products(quantity, warranty);
    }

    @Then("^El deberia ver la interfaz de despacho con el resumen de la orden$")
    public void seeTheShippingInterface() {
        ValidateOrderProduct validateOrderProduct = new ValidateOrderProduct(driver);
        Assert.assertTrue(validateOrderProduct.present());
    }
}

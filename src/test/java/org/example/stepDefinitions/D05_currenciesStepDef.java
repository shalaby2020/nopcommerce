package org.example.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class D05_currenciesStepDef {

    @Given("homepage")
    public void navigate_to_homepage()
    {
        Hooks.driver.navigate().to("https://demo.nopcommerce.com/");
    }
    @When("select currency")
    public void select_currency()
    {
        Select select = new Select(Hooks.driver.findElement(By.name("customerCurrency")));
        select.selectByVisibleText("Euro");

    }
}

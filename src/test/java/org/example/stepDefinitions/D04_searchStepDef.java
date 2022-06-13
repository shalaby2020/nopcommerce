package org.example.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

public class D04_searchStepDef {

    @Given("navigate to the homepage")
    public void navigate_to_homepage()
    {
        Hooks.driver.navigate().to("https://demo.nopcommerce.com/");
    }


    @When("click on text box search")
    public void clickOnTextBoxSearch()
    {
        Hooks.driver.findElement(By.id("small-searchterms")).sendKeys("iphone");
        Hooks.driver.findElement(By.className("button-1")).click();
    }

}

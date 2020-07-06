package com.riskfocus.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static com.riskfocus.Runner.adPage;

public class AdSteps {

    @When("scroll to add to favorites button")
    public void scrollToFavoritesButton() {
        adPage.scrollToAddToFavoritesButton();
    }

    @When("scroll to favorites counter")
    public void scrollToTheCounter() {
        adPage.scrollToFavoritesCounter();
    }

    @When("click on add to favorites button")
    public void clickOnAddToFavoritesButton() {
        adPage.clickAddToFavoritesButton();
    }

    @When("click on favorites button")
    public void clickOnFavoritesButton() {
        adPage.clickFavoritesButton();
    }

    @Then("favorites counter shows {int} added products")
    public void favoritesCounterShowsAddedProducts(int quantity) {
        adPage.checkFavoritesCounterQuantity(quantity);
    }

    @Then("add to favorites button have a name {string}")
    public void addToFavoritesButtonHaveName(String text) {
        adPage.checkAddToFavoritesButtonName(text);
    }

}

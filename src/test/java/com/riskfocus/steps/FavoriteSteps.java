package com.riskfocus.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static com.riskfocus.Runner.favoritePage;

public class FavoriteSteps {

    @Then("in favorites {int} ads")
    public void inFavoritesAds(int quantity) {
        favoritePage.checkQuantityOfFavorites(quantity);
    }

    @When("click on the clear button")
    public void clickOnTheClearButton() throws InterruptedException {
        favoritePage.clickClearAllButton();
    }

}

package com.riskfocus.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import static com.riskfocus.Runner.mainPage;

public class MainPageSteps {

    @Given("open homepage")
    public void openHomePage() {
        mainPage.checkUrl();
    }

    @When("open {string} category")
    public void openCategory(String text) {
        mainPage.clickCategory(text);
    }

    @When("enter {string} in the search")
    public void enterInTheSearch(String text) {
        mainPage.searchValue(text);
    }

}

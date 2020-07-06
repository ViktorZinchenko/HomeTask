package com.riskfocus.steps;

import io.cucumber.java.en.And;
import static com.riskfocus.Runner.categoryPage;

public class CategorySteps {

    @And("open {string} subcategory")
    public void openSubCategory(String text) {
        categoryPage.clickSubCategory(text);
    }
}

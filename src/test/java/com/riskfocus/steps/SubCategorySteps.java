package com.riskfocus.steps;

import io.cucumber.java.en.And;
import static com.riskfocus.Runner.subCategoryPage;

public class SubCategorySteps {

    @And("select {int} ad from the list")
    public void selectAdFromTheList(int ad) {
        subCategoryPage.selectProduct(ad);
    }

}

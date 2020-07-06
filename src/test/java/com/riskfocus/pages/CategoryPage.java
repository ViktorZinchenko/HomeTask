package com.riskfocus.pages;

import static com.codeborne.selenide.Selenide.$x;

public class CategoryPage {

    public void clickSubCategory(String text) {
        $x("//a[contains(.,'" + text + "')]").click();
    }

}

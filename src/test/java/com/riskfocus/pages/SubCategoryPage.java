package com.riskfocus.pages;

import com.codeborne.selenide.ElementsCollection;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.$$;


public class SubCategoryPage {

    private ElementsCollection adsList = $$("#posts tr");

    public void selectProduct(int ad) {
        String adLink = adsList.get(ad).$("a").getAttribute("href");
        open(adLink);
    }

}

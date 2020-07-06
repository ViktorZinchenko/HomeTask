package com.riskfocus.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selectors.byAttribute;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.$;
import static java.lang.Thread.sleep;

public class FavoritePage {

    private ElementsCollection adsList = $$(".table_ver1 tr");
    private SelenideElement clearAllButton = $(byAttribute("value", "Очистить список"));

    public void checkQuantityOfFavorites(int quantity) {
        adsList.shouldHaveSize(quantity);
    }
    public void clickClearAllButton() throws InterruptedException {
        sleep(5000);
        clearAllButton.click();
    }

}

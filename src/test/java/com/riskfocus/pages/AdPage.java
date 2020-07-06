package com.riskfocus.pages;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class AdPage {

    private SelenideElement favoritesButton = $("#myFav");
    private SelenideElement addToFavoritesButton = $("#favs-link");
    private SelenideElement favoritesCounter = $("#favorites_count");

    public void scrollToAddToFavoritesButton() {
        addToFavoritesButton.scrollTo();
    }

    public void scrollToFavoritesCounter() {
        favoritesCounter.scrollTo();
    }

    public void clickAddToFavoritesButton() {
        addToFavoritesButton.click();
    }

    public void clickFavoritesButton() {
        favoritesButton.click();
    }

    public void checkAddToFavoritesButtonName(String text) {
        addToFavoritesButton.shouldHave(text(text));
    }

    public void checkFavoritesCounterQuantity(int quantity) {
        favoritesCounter.shouldHave(text(String.valueOf(quantity)));
    }

}

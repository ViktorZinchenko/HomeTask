package com.riskfocus.pages;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.WebDriverRunner.url;
import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.$;
import static com.riskfocus.Runner.BASE_URL;
import static org.junit.Assert.assertEquals;

public class MainPage {

    private SelenideElement searchValueField = $("#search_value");

    public void checkUrl() {
        assertEquals("URL does not match", BASE_URL, url());
    }
    public void clickCategory(String text) {
        $x("//a[@title='Объявления " + text + "']//b").click();
    }
    public void searchValue(String text) {
        searchValueField.setValue(text).pressEnter();
    }

}

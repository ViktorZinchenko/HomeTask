package com.riskfocus;
import com.riskfocus.pages.*;

import com.codeborne.selenide.Configuration;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;
import org.junit.BeforeClass;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"com/riskfocus/steps", "com/riskfocus/hooks"},
        tags = {"@all"}
)

public class Runner {

    public static final String BASE_URL = "https://www.reklama.lv/ru/";
    public static SubCategoryPage subCategoryPage;
    public static CategoryPage categoryPage;
    public static FavoritePage favoritePage;
    public static MainPage mainPage;
    public static AdPage adPage;

    @BeforeClass
    public static void init() {
        Configuration.browser = "chrome";
        Configuration.browserSize = "1920x1080";
        Configuration.timeout = 60 * 1000;
        setupPages();
    }

    private static void setupPages() {
        mainPage = new MainPage();
        categoryPage = new CategoryPage();
        subCategoryPage = new SubCategoryPage();
        adPage = new AdPage();
        favoritePage = new FavoritePage();
    }

}

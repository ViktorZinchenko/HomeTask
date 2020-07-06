package com.riskfocus.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

import static java.lang.String.format;
import static com.riskfocus.Runner.BASE_URL;
import static com.codeborne.selenide.Selenide.*;

public class Hooks {

    @Before
    public void startScenario(Scenario scenario) {
        System.out.println(format("Running scenario %s", scenario.getName()));
        open(BASE_URL);
    }

    @After
    public static void checkScenarioResult(Scenario scenario) {
        System.out.println(format("Scenario: %s, status: %s", scenario.getName(), scenario.getStatus()));
        clearBrowserLocalStorage();
        clearBrowserCookies();
    }

}

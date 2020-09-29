package com.testrealpage.Runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)


@CucumberOptions(
        features = "src/test/resources/Features/buy.feature",
        glue = {"com.testrealpage.StepDefinitions"},
        snippets = SnippetType.CAMELCASE
)

public class BuyRunner {
}
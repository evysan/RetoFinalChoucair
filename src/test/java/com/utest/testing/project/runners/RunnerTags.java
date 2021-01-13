package com.utest.testing.project.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions (features = "src/test/resources/features/createAccount.feature",
        tags = "@stories",
        glue = "com.utest.testing.project.stepdefinitions",
        snippets = SnippetType.CAMELCASE)

public class RunnerTags {
}

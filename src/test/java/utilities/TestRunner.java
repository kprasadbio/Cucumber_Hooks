package utilities;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions (
        features = "src/test/resources/features" 
        		,glue = {"stepdefinitions","utilities"}
        ,plugin= { "pretty",
                "html:target/cucumber-pretty",
        "json:target/cucumber.json" })
public class TestRunner {
}


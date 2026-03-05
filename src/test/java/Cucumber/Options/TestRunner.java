package Cucumber.Options;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/main/java/featureFiles", glue="stepDefinitions",  
tags="@Smoke",
plugin= {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		"html:target/jsonReport/cucumber.html", "json:target/jsonReport/cucumber.json"})
public class TestRunner extends AbstractTestNGCucumberTests {

	
}

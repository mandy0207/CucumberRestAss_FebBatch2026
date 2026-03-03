package Cucumber.Options;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/main/java/featureFiles", glue="stepDefinitions",  
tags="@Smoke")
public class TestRunner extends AbstractTestNGCucumberTests {

	
}

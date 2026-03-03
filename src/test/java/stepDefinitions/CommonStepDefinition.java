package stepDefinitions;

import org.testng.Assert;

import enums.ApiResources;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import utils.ScenarioContext;

public class CommonStepDefinition {

	ScenarioContext scenarioContext;
	public CommonStepDefinition(ScenarioContext scenarioContext) {
		this.scenarioContext= scenarioContext;
	}
	
	@Given("library baseURL is available")
	public void library_base_url_is_available() {
		RestAssured.baseURI=ApiResources.LibraryManagementBaseUrl.getResource();
	}
	
	@Then("the status code should be {string}")
	public void the_status_code_should_be(String expectedStatusCode) {
		int actualStausCode=scenarioContext.getResponse().getStatusCode();
		Assert.assertEquals(actualStausCode, Integer.parseInt(expectedStatusCode));
	}
	
	
}

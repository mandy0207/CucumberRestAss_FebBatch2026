package stepDefinitions;

import static io.restassured.RestAssured.given;

import org.testng.Assert;

import enums.ApiResources;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojo.Book;
import utils.CreateSpec;
import utils.JSONParser;
import utils.ScenarioContext;
import utils.UniqueGenerator;

public class AddBookStepDefinition {

	
	
	ScenarioContext scenarioContext;
	
	public AddBookStepDefinition(ScenarioContext scenarioContext) {
		this.scenarioContext= scenarioContext;
	}
	
	
	@When("user sends post request to add book with unique creds")
	public void user_sends_post_request_to_add_book_with_unique_creds() {
		Response addBookResponse = given().spec(CreateSpec.makeRequestSpec(ApiResources.LibraryManagementBaseUrl.getResource(), ContentType.JSON))
		.body(UniqueGenerator.getUniqueBookObject()).when().post(ApiResources.postBook.getResource()).then().log().all().extract().response();
		scenarioContext.setResponse(addBookResponse);
		
		String bookID=JSONParser.getjsonParser(addBookResponse.asString()).get("ID");
		scenarioContext.setBookID(bookID);
		
	}
	
	@Then("response should contain message {string}")
	public void response_should_contain_message(String expectedMsg) {
		String actualMsg=JSONParser.getjsonParser(scenarioContext.getResponse().asString()).get("Msg");
		Assert.assertEquals(actualMsg, expectedMsg, "Key mismatch");
	}

	@When("user sends post request to add book with {string} {string} {string} {string}")
	public void user_sends_post_request_to_add_book_with(String bookName, String isbn, String aisle, String author) {
		Book book = new Book(bookName, isbn+UniqueGenerator.getUnqiqueString(), aisle+isbn+UniqueGenerator.getUnqiqueString(), author);
		Response addBookResponse=  given().spec(CreateSpec.makeRequestSpec(ApiResources.LibraryManagementBaseUrl.getResource(), ContentType.JSON))
		.body(book).when().post(ApiResources.postBook.getResource()).then().log().all().extract().response();
		  scenarioContext.setResponse(addBookResponse);
	}
}

package utils;

import io.restassured.response.Response;

public class ScenarioContext {
	
	public Response response;
	public String bookID;
	
	
	public Response getResponse() {
		return response;
	}
	public void setResponse(Response response) {
		this.response = response;
	}
	public String getBookID() {
		return bookID;
	}
	public void setBookID(String bookID) {
		this.bookID = bookID;
	}
	
	
	

}

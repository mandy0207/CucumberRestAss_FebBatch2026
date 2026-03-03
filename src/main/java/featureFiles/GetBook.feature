Feature: Verify Get Book Feature of API

@Smoke  
Scenario Outline: Verify user is able to retrive book using ID
Given library baseURL is available
When user sends post request to add book with unique creds
Then user sends get request to grab book using ID
Then the status code should be "200"
And verify user is able to retrive same data sent while creating book















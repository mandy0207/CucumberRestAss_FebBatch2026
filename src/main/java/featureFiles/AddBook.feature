Feature: Verify Add Book

@Smoke
Scenario: verify user is able to add single Book
Given library baseURL is available
When user sends post request to add book with unique creds
Then the status code should be "200"
And response should contain message "successfully added"


@Smoke
Scenario Outline: Verify Book Addition using Data Paramterisation
Given library baseURL is available
When user sends post request to add book with "<bookName>" "<isbn>" "<aisle>" "<author>"
Then the status code should be "200"
And response should contain message "successfully added"
Examples:
	|       bookName             |    isbn     |   aisle  |   author  |
	|  Rest Assured Solutions    |   amalu     |   1234   |  Amalu VS |
	|  Learn Java With Sree Ganga|   sreeganga |   0098   |  S Ganga  |
	| Appium With JS             |   glen      |   2201   |  Glen Joy |


        
        
        


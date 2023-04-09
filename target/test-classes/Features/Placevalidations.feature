Feature: Validating Place API's
@AddPlaceAPI
Scenario Outline: Verify if Place is being Succesfully added using AddPlaceAPI
	Given Add Place Payload with "<name>"  "<language>" "<address>"
	When user calls "AddPlaceAPI" with "POST" http request
	Then the API call got success with status code 200
	And "status" in response body is "OK"
	And "scope" in response body is "APP"
	And verify place_Id created maps to "<name>" using "getPlaceAPI"
	
Examples:
	|name 	 | language  |  address		      |
	|AAhouse1|  spanish1 | World cross center |
	
@DeleteAPI @Regression
Scenario: Verify DeleteAPI
    Given DeletePlace Payload
	When user calls "DeleteplaceAPI" with "POST" http request
	Then the API call got success with status code 200
	And "status" in response body is "OK"

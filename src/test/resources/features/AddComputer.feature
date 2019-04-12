Feature: Add Computer 
Scenario Outline: Add 
	Given I navigate to add computer details
	When I add a new computer '<computerName>' starting at '<startDate>' and ending at '<endDate>' for company '<company>'
	Then Computer is added with success message '<result>' 
	
	Examples: 
		| computerName | startDate | endDate | company | result |
		| Intel 5    | 2018-12-02 | 2019-12-02 | Apple Inc. | Done! Computer Intel 5 has been created |

Scenario Outline: Add computer with empty name		
	Given I navigate to add computer details
	When I add a new computer '<computerName>' with empty name
	Then Computer '<computerName>' field should be highlighted with this color '<color>'
	
	Examples: 
		| computerName | color|
		|    | rgb(157, 38, 29) |
		
Scenario Outline: Add computer with invalid date		
	Given I navigate to add computer details
	When I add a new computer '<computerName>' starting at '<startDate>' and ending at '<endDate>' with invalid dates
	Then Dates field should be highlighted with this color '<color>'
	
	Examples: 
		| computerName | startDate | endDate | color|
		| Intel 5    | 55-ff-02 | 4d-ab-02 | rgb(191, 191, 191) |
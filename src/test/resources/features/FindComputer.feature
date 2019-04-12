Feature: Find Computer 
Scenario Outline: Find 
	Given I navigate to search computer page 
	When I search for '<computerName>' 
	Then Search result is shown 
	
	Examples: 
		| computerName | 
		| ASCI Purple    |
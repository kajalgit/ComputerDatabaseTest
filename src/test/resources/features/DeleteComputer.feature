Feature: Delete Computer 
Scenario Outline: Delete 
	Given I navigate to delete computer page 
	When I delete '<computerName>' 
	Then '<computerName>' is deleted with success message '<result>' 
	
	Examples: 
		| computerName | result |
		| AN/FSQ-32    | Done! Computer AN/FSQ-32 has been updated  |
  
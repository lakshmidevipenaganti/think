Feature: MagicBricks HomeLoans
 
  Scenario: Validate user Navigates to Home Loans 
   Given Chrome is opened and magic bricks app is opened
	 Then user navitages on Landing Page
	 When user clicks  on login button and login with EmialID and password
	 Then user  navigates to Home page
			
  Scenario: Verify  user Navigation to Home Loans 
   Given Chrome is opened and magic bricks app is opened
   When user clicks  on login button and login with EmialID and password
   Then user  navigates to Home page
   When user clicks on Home loans 
   And clicks on Home loan eligibility
   Then User navigates to Home Loan Eligibility calculator
		
		
	Scenario: Validate ChcekEligiblity Fields
		Given Chrome is opened and magic bricks app is opened
  	When user clicks on Home loans 
    And clicks on Home loan eligibility
 		Then User navigates to Home Loan Eligibility calculator
  	Then user enters NetMontly income,ongoing emi
    And user enters Loan Tenure and Interest Rate
  	And click on check Eligibility button
  	Then shows pop up box
   

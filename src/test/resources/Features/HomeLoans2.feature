 Feature: MagicBricks HomeLoans_check
			Scenario Outline: validate User enter Income with valid data
			Given Chrome is opened and Magic Bricks App is opened
			Then user navigates to Landing Page
			When user clicks on HomeLoans
			And  clicks on Home loan Eligibility 
			Then user navigates to home loans eligibility calculator
			When user enters valid Income "<Net Monthly Income>"
			When user check the Eligibility
			Then it shows Eligibility criteria
			
			Examples:
      |Net Monthly Income|        
      |100000|
		
			Scenario Outline: Validate User enter Income with InvalidData
			Given Chrome is opened and Magic Bricks App is opened
			Then user navigates to Landing Page
			When user clicks on HomeLoans
			And  clicks on Home loan Eligibility 
			Then user navigates to home loans eligibility calculator
			When user enters invalid Income "<Net Montly Income>"
			When user check the Eligibility
			Then user get error message
			
			Examples:
		
			|Net Montly Income|      
			|5000|
			




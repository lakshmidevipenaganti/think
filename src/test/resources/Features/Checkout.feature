 Feature: MagicBricks HomeLoans_check
			Scenario Outline: validate User enter Income with valid data
			Given Chrome is opened and Magic Bricks App is opened
			Then user navigates to Landing Page
			When user clicks on HomeLoans
			And  clicks on Home loan Eligibility 
			Then user navigates to home loans eligibility calculator
			When user fills the form from given sheetname "<SheetName>" and rownumber <RowNumber>
			When user check the Eligibility
			Then it shows Eligibility criteria
			
			Examples:
      | SheetName |RowNumber|        
      | Sheet1    |    0    |
       
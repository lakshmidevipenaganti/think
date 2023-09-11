package testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features ={"src/test/resources/Features/HomeLoans2.feature"},
		glue={"HomeLoanspage2_stepdefinitions","apphooks"},
		plugin= {"pretty",
				"html:cucumber-report/cucmber",
				"json:cucumber-report/cucumber.json",
				"junit:cucumber-report/cucumber.xml"}
)
public class HomeLoans2testRunner extends AbstractTestNGCucumberTests{
	
}

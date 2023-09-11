package testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
		features ={"src/test/resources/Features/HomeLoans.feature"},
		glue={"HomeLoanspage_stepdefinitions","apphooks"},
		plugin = {"pretty", 
				"html:cucumber-report/cucmber",
				"json:cucumber-report/cucumber.json",
				"junit:cucumber-report/cucumber.xml"}
				//dryRun=true
)
public class HomeLoansPage_TestRunner extends AbstractTestNGCucumberTests {
	

}

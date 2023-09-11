package testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features ={"src/test/resources/Features/Checkout.feature"},
		glue={"checkout_excel","apphooks"},
		plugin= {"pretty",
			"html:cucumber-report/cucmber",
			"json:cucumber-report/cucumber.json",
			"junit:cucumber-report/cucumber.xml"}
			//dryRun=true
)
public class Checkout_TestRunner_Excel extends AbstractTestNGCucumberTests {

}

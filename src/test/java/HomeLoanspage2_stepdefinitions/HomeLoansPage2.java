package HomeLoanspage2_stepdefinitions;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import com.pages.HomeEligibilityPage;
import com.pages.HomePage;
import com.pages.LandingPage;
import com.pages.LoginPage;
import com.utility.Utility;
import com.aventstack.extentreports.Status;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomeLoansPage2 extends Utility {
	public  LandingPage ldp;
	public LoginPage lp;
	public HomePage hp;
	public HomeEligibilityPage hep;
	
	public void objectMethod() throws IOException{
		ldp= new LandingPage();
		hp=new HomePage();
		lp=new LoginPage();
		hep=new HomeEligibilityPage();
	}
	@Given("Chrome is opened and Magic Bricks App is opened")
	public void chrome_is_opened_and_magic_bricks_app_is_opened() throws IOException, InterruptedException {
		objectMethod();
		String actualtitle=ldp.validatePageTitle();
		System.out.println(actualtitle);
		Thread.sleep(3000);
    
	}
	@Then("user navigates to Landing Page")
	public void user_navigates_to_landing_page() throws IOException, InterruptedException {
		objectMethod();
		String actualtitle = ldp.validatePageTitle();
		String expectedtitle = "Real Estate | Property in India | Buy/Sale/Rent Properties | MagicBricks";
		assertEquals(expectedtitle, actualtitle);
		System.out.println(actualtitle);
		Thread.sleep(2000);
	}
	@When("user clicks on HomeLoans")
	public void user_clicks_on_home_loans() throws IOException, InterruptedException {
		objectMethod();
  	    hp.Homeloans();
  	    driver.manage().window();
	    Thread.sleep(4000);
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    
	}
	@When("clicks on Home loan Eligibility")
	public void clicks_on_home_loan_eligibility() throws IOException, InterruptedException {
		objectMethod();
    	hp.LoanEligible();
   	    Thread.sleep(4000);
    
	}
	@Then("user navigates to home loans eligibility calculator")
	public void user_navigates_to_home_loans_eligibility_calculator() throws IOException, InterruptedException {
		objectMethod();
		Thread.sleep(3000);
		String actualtitle = hep.validatePageTitle();
		System.out.println(actualtitle);
    }
	@When("user enters valid Income {string}")
	public void user_enters_valid_income(String netMonthlyIncome) throws IOException, InterruptedException {
		objectMethod();
		Utility.WindowHandle();
         	hep.netMonthlyIncome(netMonthlyIncome);
	              	hep.Ongoingemi("5000");
	        		Thread.sleep(3000);
	}
	@When("user check the Eligibility")
	public void user_check_the_eligibility() throws InterruptedException {
		hep.checkEligibility();
		Thread.sleep(3000);	
	}
	@Then("it shows Eligibility criteria")
	public void it_shows_eligibility_criteria() {
    System.out.println("Eligibility criteria is shown");
	}
	@When("user enters invalid Income {string}")
	public void user_enters_invalid_income(String netMonthlyIncome ) throws IOException, InterruptedException {
		objectMethod();
		Utility.WindowHandle();
  	    hep.netMonthlyIncome(netMonthlyIncome);
	              	hep.Ongoingemi("5000");
	        		Thread.sleep(3000);
	}
	
	@Then("user get error message")
	public void user_get_error_message() {
	System.out.println("Please enter valid income per month between 10,000 - 10 crores");
	 }
}
	



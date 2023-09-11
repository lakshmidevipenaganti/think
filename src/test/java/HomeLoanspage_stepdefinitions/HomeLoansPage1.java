package HomeLoanspage_stepdefinitions;
import static org.testng.Assert.assertEquals;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;

import com.aventstack.extentreports.Status;
import com.pages.HomeEligibilityPage;

//import com.pages.HomeLoanspage;
import com.pages.HomePage;
import com.pages.LandingPage;
import com.pages.LoginPage;
import com.utility.Utility;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomeLoansPage1 extends Utility{
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
	
	@Given("Chrome is opened and magic bricks app is opened")
	public void chrome_is_opened_and_magic_bricks_app_is_opened() throws IOException, InterruptedException {
		objectMethod();
		logger = report.createTest("test01");
		logger.log(Status.INFO, "MagicBricks is opened");
		String actualtitle=ldp.validatePageTitle();
		System.out.println(actualtitle);
		Thread.sleep(3000);
	}
	@Then("user navitages on Landing Page")
	public void user_navitages_on_landing_page() throws IOException, InterruptedException {
		objectMethod();
		
		String actualtitle = ldp.validatePageTitle();
		logger.log(Status.INFO, "Validating Landing page title");
		
		String expectedtitle = "Real Estate | Property in India | Buy/Sale/Rent Properties | MagicBricks";
		try {
			
			logger.log(Status.INFO, "Step1 is executed");
            assertEquals(actualtitle, expectedtitle);
            logger.log(Status.PASS, "Test is passed");
            System.out.println(actualtitle);
            assert true;
        } 
		catch (AssertionError e) {
		e.printStackTrace();
		logger.log(Status.FAIL, "Test is failed");
		captureScreenshotOnFailure();
		assert false;
	   	}
	    Utility.implicitWait();
		
	}
	@When("user clicks  on login button and login with EmialID and password")
	public void user_clicks_on_login_button_and_login_with_emial_id_and_password() throws IOException, InterruptedException {
	System.out.println("login");
		objectMethod();
		
		ldp.login1();
		Thread.sleep(3000);
		ldp.Loginbutton();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));objectMethod();	                                                                                                           
 		lp.EmailId();
 		Thread.sleep(4000);
 		lp.nextButton();
 		lp.Password();
 		lp.loginButton();
 		Thread.sleep(1000);
 		lp.continueButton();
 		Thread.sleep(2000);
 		logger.log(Status.INFO, "step2 is executed");
	}       		


	@Then("user  navigates to Home page")
	public void user_navigates_to_home_page() throws InterruptedException, IOException {
		objectMethod();
		Thread.sleep(3000);
		String actualtitle = ldp.validatePageTitle();
		String expectedtitle ="Real Estate | Property in India | Buy/Sale/Rent Properties | MagicBricks";
		assertEquals(expectedtitle, actualtitle);
		System.out.println(actualtitle);
		try {
			
			logger.log(Status.INFO, "Step3 is executed");
            assertEquals(actualtitle, expectedtitle);
            logger.log(Status.PASS, "Test is passed");
            System.out.println(actualtitle);
            assert true;
        } 
		catch (AssertionError e) {
		e.printStackTrace();
		logger.log(Status.FAIL, "Test is failed");
		captureScreenshotOnFailure();
		assert false;
	   	}
		Thread.sleep(2000);
	}	
	@When("user clicks on Home loans")
	public void user_clicks_on_home_loans() throws InterruptedException, IOException{
		objectMethod();
  	    ldp.homeloans();
  	    driver.manage().window();
	    Thread.sleep(4000);
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	    logger.log(Status.INFO, "step4 is executed");
		}
		   
	
	@When("clicks on Home loan eligibility")
	public void clicks_on_home_loan_eligibility() throws InterruptedException, IOException {
		objectMethod();
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
   	    ldp.LoanEligible();
   	    Thread.sleep(2000);
   	    logger.log(Status.INFO, "step5 is executed");
	}
	@Then("User navigates to Home Loan Eligibility calculator")
	public void user_navigates_to_home_loan_eligibility_calculator() throws IOException, InterruptedException {
		objectMethod();
		Thread.sleep(3000);
		String actualtitle = hep.validatePageTitle();
		System.out.println(actualtitle);
		logger.log(Status.INFO, "step6 is executed");
	}
	
	@Then("user enters NetMontly income,ongoing emi")
	public void user_enters_net_montly_income_ongoing_emi() throws IOException, InterruptedException {
	    objectMethod();
	    
		String MainWindow=driver.getWindowHandle();		
 		Set<String> s1=driver.getWindowHandles();		
	    Iterator<String> i1=s1.iterator();		
	        while(i1.hasNext())			
	        {		
	           String ChildWindow=i1.next();	
	           
	           if(!MainWindow.equalsIgnoreCase(ChildWindow))			
	            {    		
	               // Switching to Child window
	              driver.switchTo().window(ChildWindow);
	              	hep.netMonthlyIncome("100000");
	                Thread.sleep(1000);
	                hep.Ongoingemi("5000");
	                Thread.sleep(1000);
	                logger.log(Status.INFO, "step7 is executed");	
	            }	
	        }
	    }
 	    @Then("user enters Loan Tenure and Interest Rate")
		public void user_enters_loan_tenure_and_interest_rate() throws IOException, InterruptedException {
			objectMethod();
			hep.InterestRate("");
			logger.log(Status.INFO, "step8 is executed");
			Thread.sleep(2000);
		}	
		@Then("click on check Eligibility button")
		public void click_on_check_eligibility_button() throws IOException, InterruptedException {
			hep.checkEligibility();
			logger.log(Status.INFO, "step9 is executed");
			Thread.sleep(2000);
	    }
		@Then("shows pop up box")
		public void shows_pop_up_box() throws IOException, InterruptedException {
			objectMethod();
			System.out.println("show pop up box");
			Thread.sleep(5000);
			logger.log(Status.INFO, "step12 is executed");
			
		}
}

package com.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utility.Utility;

public class HomeEligibilityPage extends Utility{
	@FindBy(xpath="/html/body/header/section[2]/div/ul/li[4]/a")
	public WebElement Homeloans;
	
	@FindBy(xpath="//*[@id=\"homeloanDrop\"]/div/div[3]/ul/li[2]/a")
	public WebElement HomeLoanEligibility;
	
	@FindBy(xpath="//*[@id='incomePerMonthEliCal']")
	public WebElement NetMonthlyIncome;
	
	@FindBy(xpath="//*[@id='existingLoanEliCal']")
	public WebElement OngoingEMI;
	
	@FindBy(xpath="//*[@type=\"text\"]")
	public WebElement LoanTenure;
	

	@FindBy(xpath="//*[@id=\"interestRateEliCal\"]")
	WebElement Interestrate;
	
	
	//@FindBy(xpath="//a[@id='submitbuttonEliCalid']")
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/form[1]/a[1]")
	WebElement checkbutton;
	
	public HomeEligibilityPage() throws IOException
	{
		PageFactory.initElements(driver, this);
	}
	
	public void homeLoans()
	{
		 Homeloans.click();
	}
	public void homeloaneligibility()
	{
		HomeLoanEligibility.click();
		
	}  
	public void netMonthlyIncome(String nI ) {
		//NetMonthlyIncome.click();
		NetMonthlyIncome.sendKeys(nI);
	  }
	
	public void Ongoingemi(String oe ) {
		OngoingEMI.sendKeys(oe);
	}
	public void Loantenture() {
		LoanTenure.click();
    }
	public void InterestRate(String IR) {
		Interestrate.click();
		Interestrate.sendKeys(IR);
	}
	public void checkEligibility()
	{
		checkbutton.click();
	}


}

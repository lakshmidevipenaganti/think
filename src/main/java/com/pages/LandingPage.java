package com.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utility.Utility;

public class LandingPage extends Utility {
	@FindBy(xpath="//*[@id=\"commercialIndex\"]/header/section[1]/div/div[2]/div[2]/a")
	WebElement Login1; 

	@FindBy(xpath="//*[@id=\"commercialIndex\"]/header/section[1]/div/div[2]/div[2]/div/div[2]/a")
	WebElement Login2;

	@FindBy(xpath="/html/body/header/section[2]/div/ul/li[4]/a")
	WebElement Homeloans;
	
	@FindBy(xpath="//*[@id='homeloanDrop']/div/div[3]/ul/li[2]/a")
	WebElement homeloaneligibility;
	
	
	public LandingPage() throws IOException
	{
		PageFactory.initElements(driver, this);
	}
	
	public String validateTitle()
	{
		return driver.getTitle(); 
	}
	public void login1()
	{
	Login1.click();
	}
	public LoginPage Loginbutton() throws IOException
	{
	Login2.click();
	return new LoginPage();
	}

	public void homeloans() {
		Homeloans.click();
	}

	public void LoanEligible() {
		homeloaneligibility.click();
		
	}
}

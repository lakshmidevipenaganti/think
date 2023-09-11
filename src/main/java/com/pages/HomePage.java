package com.pages;
import java.io.IOException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.utility.Utility;
public class HomePage extends Utility{
	
	@FindBy(xpath="/html/body/header/section[2]/div/ul/li[4]/a")
	private WebElement HomeLoans;
	
	@FindBy(xpath="/html/body/header/section[2]/div/ul/li[4]/div/div/div[3]/ul/li[2]/a")
	private WebElement HomeLoanEligibility;
	
	public HomePage() throws IOException
	{
		PageFactory.initElements(driver, this);
	} 
	public void Homeloans()
	{
		HomeLoans.click();
	}
	public void LoanEligible()
	{
		HomeLoanEligibility.click();
	}
	
	public  String validateHomePageTitle()
	{
		return driver.getTitle(); 
	}  

}

package com.pages;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utility.Utility;

public class LoginPage  extends Utility  {
	@FindBy(xpath="//*[text()='Login']")
	WebElement Login1; 
	
	@FindBy(xpath="//*[@id=\"commercialIndex\"]/header/section[1]/div/div[2]/div[2]/div/div[2]/a")
	WebElement Login2;
	
	@FindBy(xpath="//button[@id='btnStep1']")
	WebElement Next;
			
	@FindBy(xpath="//input[@id='password']")
 	WebElement Password; 
	
	@FindBy(xpath="//*[@id='btnLogin']")
	WebElement login;
	
	@FindBy(xpath="//*[@id=\"emailIdVerificationLinkDiv\"]/div[2]/button")
	WebElement Continue;

	public LoginPage() throws IOException
	{
		PageFactory.initElements(driver, this);
	}
	public String validateLoginPageTitle()
	{
		return driver.getTitle(); 
	}
	public void EmailId() {
        String mainWindowHandle = driver.getWindowHandle();
        Set<String> handles = driver.getWindowHandles();
         Iterator<String> it = handles.iterator();
          String parentpage = (String) it.next();
          String childpage = (String) it.next();
          driver.switchTo().window(childpage);
          driver.findElement(By.xpath("//*[@id=\"emailOrMobile\"]")).sendKeys("lakshmidevipenaganti@gmail.com");
    }
	
	public void nextButton() {
		Next.click();
	}
	
	public void Password() {
		//Password.click();
		Password.sendKeys("devidevil@1234");
	}
	public void loginButton()
	{
		login.click();
	}
	
	public  void continueButton()
	{
		Continue.click();

	}
}

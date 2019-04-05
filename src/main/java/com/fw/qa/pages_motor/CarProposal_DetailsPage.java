package com.fw.qa.pages_motor;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.fw.qa.baseclass.TestBase;

public class CarProposal_DetailsPage extends TestBase{

	
	@FindBy(id="name")
	public
	static WebElement fullname;
	
	@FindBy(id="mobileNo")
	public
	static WebElement mobileno;
		
	
	@FindBy(id="email")
	public
	static WebElement email;
	
	@FindBy(xpath="//*[@id='btnLeadDetails']/span")
	public
	static WebElement continuebtn;
	
	
	
	public CarProposal_DetailsPage(){
		
		PageFactory.initElements(driver, this);
		
	}
	
	public void filldetails(){
		try{
			fullname.sendKeys("Test");
			Thread.sleep(2000);
			mobileno.sendKeys("9777777777");
			Thread.sleep(2000);
			email.sendKeys("test@policybazaar.com");
			Thread.sleep(2000);
			continuebtn.click();
			Thread.sleep(5000);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
		

}

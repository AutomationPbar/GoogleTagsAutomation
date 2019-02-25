package com.fw.qa.pages_tw;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fw.qa.baseclass.TestBase;


public class TW_Home extends TestBase {
	
	@FindBy(id="regNo")
	public
	static WebElement regno;
	
	@FindBy(xpath="//*[@id='action']/button/span")
	public
	static WebElement getdetails;
	
	@FindBy(id="renewal")
	public
	static WebElement uploadrc;
	
	@FindBy(xpath="//*[@id='action']/div[2]/a")
	public
	static WebElement newbike;
	
	@FindBy(xpath="//*[@id='action']/a")
	public
	static WebElement dontknowreg;
	
	public TW_Home(){
		
		PageFactory.initElements(driver, this);
		
	}
	
	public String validateHomePageTitle(){
		
		return driver.getTitle();
		
	}
	
	public void twpage(){
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//return new FillDetailsPage();
	}

}

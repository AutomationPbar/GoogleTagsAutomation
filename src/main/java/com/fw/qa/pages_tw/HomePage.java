package com.fw.qa.pages_tw;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fw.qa.baseclass.TestBase;


public class HomePage extends TestBase {
	
	@FindBy(xpath="//*[@class='towwheeler subp']")
	static
	WebElement tw;
	
	public HomePage(){
		
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
		tw.click();
		//return new FillDetailsPage();
	}

}

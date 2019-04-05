package com.fw.qa.pages_motor;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fw.qa.baseclass.TestBase;


public class HomePage extends TestBase {
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div[1]/ul/li[4]/a")
	static
	WebElement motor;
	
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
		motor.click();
		//return new FillDetailsPage();
	}

}

package com.fw.qa.pages_motor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fw.qa.baseclass.TestBase;
import com.sun.mail.iap.Argument;


public class Car_Home extends TestBase {
	
	@FindBy(id="regNoTextBox")
	public
	static WebElement regno;
	
	@FindBy(id="spanGetQuote")
	public
	static WebElement getquotes;
	
	@FindBy(className="btn-proceed")
	public
	static WebElement withouthregno;
	
	@FindBy(className="btn-newCar")
	public
	static WebElement brandnew;
	
	
	
	public Car_Home(){
		
		PageFactory.initElements(driver, this);
		
	}
	
	public String validateHomePageTitle(){
		
		return driver.getTitle();
		
	}
	
	public void carpage(){
		
		
										// DL9CW9624 = With_FLA // DL9CW9623 = Without_FLA // HR26BV7938 = Renewal
		try {
			
			regno.clear();
			regno.sendKeys("DL9CW9624");    				
			getquotes.click();	
		
			Thread.sleep(3000);
			System.out.println("going for fla");
			driver.navigate().back();
			Thread.sleep(3000);
			System.out.println("navigating back");
			regno.clear();
			regno.sendKeys("DL9CW9623");    				
			getquotes.click();	
		
			Thread.sleep(3000);
			System.out.println("going for without_fla");
			driver.navigate().back();
			Thread.sleep(3000);
			System.out.println("navigating back");
			regno.clear();
			regno.sendKeys("HR26BV7938");    				
			getquotes.click();
			Thread.sleep(3000);
			System.out.println("going for renewal");
			driver.navigate().back();
			
			System.out.println("navigating back");
			Thread.sleep(3000);
			System.out.println("clicking brandnew");
			brandnew.click();
			
			Thread.sleep(10000);
			driver.navigate().back();
			Thread.sleep(3000);
			System.out.println("clicking proceed without regno");
			proceed();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}									
	}
		
		public static void proceed(){

			
		
			try {
				Actions action = new Actions(driver);
				action.moveToElement(withouthregno, 10,20).click().build().perform();
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

   }

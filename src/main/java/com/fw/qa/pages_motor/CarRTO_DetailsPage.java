package com.fw.qa.pages_motor;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fw.qa.baseclass.TestBase;

public class CarRTO_DetailsPage extends TestBase{
	
	@FindBy(xpath="//*[@id='searchInput']/div/input")
	public
	static WebElement RTO;
	
	@FindBy(xpath="//*[@id='react-autowhatever-1--item-0']")
	public
	static WebElement selectRTO;
	
	
	@FindBy(id="spn2")
	public
	static WebElement topRTO;
	
	@FindBy(id="searchOthers")
	public
	static WebElement others;
	
	@FindBy(xpath="//*[@id='section1']/ul/li[3]/span")
	public
	static WebElement rtonumber;
	
	@FindBy(xpath="//*[@id='dvRTO']/h3/span[1]")
	public
	static WebElement backbtn;
	
	@FindBy(xpath="//*[@id='dvRTO']/h3/span[3]")
	public
	static WebElement nextbtn;
	
	@FindBy(xpath="//*[@id='dvMake']/h3/span[1]")
	public
	static WebElement makebackbtn;
	
	public CarRTO_DetailsPage(){
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	public void rtodetails(){
		
		
		
		try {
			others.click();
			RTO.sendKeys("Nagpur");
			Thread.sleep(2000);
			selectRTO.click();
			Thread.sleep(2000);
			makebackbtn.click();
			Thread.sleep(2000);
			topRTO.click();
			Thread.sleep(2000);
			rtonumber.click();
			Thread.sleep(2000);
			makebackbtn.click();
			Thread.sleep(2000);
			backbtn.click();
			Car_Home.proceed();
			topRTO.click();
			Thread.sleep(2000);
			rtonumber.click();
			Thread.sleep(2000);
			makebackbtn.click();
			Thread.sleep(2000);
			nextbtn.click();
			Thread.sleep(3000);
			
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		
	}

}

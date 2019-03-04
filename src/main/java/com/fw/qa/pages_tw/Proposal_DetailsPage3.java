package com.fw.qa.pages_tw;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.fw.qa.baseclass.TestBase;

public class Proposal_DetailsPage3 extends TestBase{

	
	@FindBy(id="RegistrationNumber")
	public
	static WebElement Regisno;
	

	@FindBy(id="EngineNumber")
	public
	static WebElement engineno;
		
	
	@FindBy(id="ChasisNumber")
	public
	static WebElement chasisno;
	
	@FindBy(id="OldPolicyNum")
	public
	static WebElement previousno;
	
	@FindBy(xpath="//*[@id='app']/div/div[2]/div[1]/div/div[2]/div[2]/div[3]/div[1]/div[1]/button/span")
	public
	static WebElement continuestep2;
	
	@FindBy(xpath="//*[@id='app']/div/div[2]/div[1]/div/div[2]/div[2]/div[3]/h1/a")
	public
	static WebElement previousbtn1;
	
	@FindBy(xpath="//*[@id='app']/div/div[1]/div/div[1]/div/a[1]")
	public
	static WebElement backbtn1;
	
	@FindBy(id="ClaimedLastYearYes")
	public
	static WebElement oldclaim;
	
	
	
	@FindBy(xpath="//*[@id='vehicleDetailForm']/ul/li[10]/div[2]/ul/li[2]/div/div")
	public
	static WebElement ownerrc;
	
	
	@FindBy(xpath="//*[@id='app']/div/div[2]/div[1]/div/div[2]/div[2]/div[3]/div[1]/div[1]/button/span/em")
	public
	static WebElement saveproceed;
	
	
	public Proposal_DetailsPage3(){
		
		PageFactory.initElements(driver, this);
		
	}
	
	public static void filldetails(){
		try{
		
		Thread.sleep(2500);
		Regisno.sendKeys("1234");
		Thread.sleep(2000);
		engineno.sendKeys("123456");
		Thread.sleep(2500);
		chasisno.sendKeys("123456");
		Thread.sleep(2500);
		previousno.sendKeys("123456");
		Thread.sleep(2500);
		//oldclaim.click();
		//ownerrc.click();
		System.out.println("filled details clicking proceed");
		saveproceed.click();
		
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	

}

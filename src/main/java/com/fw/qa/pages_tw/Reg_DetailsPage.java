package com.fw.qa.pages_tw;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fw.qa.baseclass.TestBase;

public class Reg_DetailsPage extends TestBase{

	
	@FindBy(xpath="//*[@id='dvRegYear']/ul/div/li[2]/span")
	public
	static WebElement yearvalue;
	
	@FindBy(xpath="//*[@id='dvRegYear']/ul/span")
	public
	static WebElement brandnew;
		
	
	@FindBy(xpath="//*[@id='dvRegYear']/h3/a")
	public
	static WebElement regyearbackbtn;
	
	@FindBy(xpath="//*[@id='dvMake']/h3/a")
	public
	static WebElement insurerbackbtn;
	
	@FindBy(xpath="//*[@id='dvPrevInsurer']/ul/div/li[7]/span")
	public
	static WebElement previousinsurer;
	
	@FindBy(xpath="//*[@id='alertShow']/div/div[4]/ul/li[1]")
	public
	static WebElement covertype;
	
	@FindBy(xpath="//*[@id='alertShow']/div/div[4]/ul/li[1]")
	public
	static WebElement policyexpiry;
	
	@FindBy(xpath="//*[@id='alertShow']/div/div[5]/div[1]/label")
	public
	static WebElement expirydate;
	
	public Reg_DetailsPage(){
		
		PageFactory.initElements(driver, this);
		
	}
	

}

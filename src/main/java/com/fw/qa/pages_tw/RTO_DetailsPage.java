package com.fw.qa.pages_tw;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fw.qa.baseclass.TestBase;

public class RTO_DetailsPage extends TestBase{
	
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
	
	@FindBy(xpath="//*[@id='dvRTO']/h3/a")
	public
	static WebElement backbtn;
	
	
	public RTO_DetailsPage(){
		
		PageFactory.initElements(driver, this);
		
	}
	

}

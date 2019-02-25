package com.fw.qa.pages_tw;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fw.qa.baseclass.TestBase;

public class Make_DetailsPage extends TestBase{
	
	@FindBy(xpath="//*[@id='searchInput']/div/input")
	public
	static WebElement make;
	
	@FindBy(xpath="//*[@id='searchInput']/div/input")
	public
	static WebElement model;
	
	@FindBy(xpath="//*[@id='react-autowhatever-1--item-0']")
	public
	static WebElement selectmake;
	
	
	@FindBy(xpath="//*[@id='dvMake']/ul/div/li[2]/span")
	public
	static WebElement topmake;
	
	@FindBy(id="searchOthers")
	public
	static WebElement others;
	
	@FindBy(xpath="//*[@id='dvModel']/ul/div/li[33]/span/b")
	public
	static WebElement topmodel;
	
	@FindBy(xpath="//*[@id='dvModel']/h3/a")
	public
	static WebElement modelbackbtn;
	
	@FindBy(xpath="//*[@id='dvMake']/h3/a")
	public
	static WebElement makebackbtn;
	
	@FindBy(xpath="//*[@id='dvVariant']/ul/div/li/span/b")
	public
	static WebElement topvariant;
	
	@FindBy(xpath="//*[@id='dvVariant']/h3/a")
	public
	static WebElement variantbackbtn;
	
	
	public Make_DetailsPage(){
		
		PageFactory.initElements(driver, this);
		
	}
	

}

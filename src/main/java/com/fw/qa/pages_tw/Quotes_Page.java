package com.fw.qa.pages_tw;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fw.qa.baseclass.TestBase;

public class Quotes_Page extends TestBase{
	
	@FindBy(xpath="//*[@id='Quotes']/ul/li[1]/b/a")
	public
	static WebElement twedit;
	
	@FindBy(xpath="//*[@id='app']/div/div[1]/div[2]/div/div[1]/a")
	public
	static WebElement backVD;
	
	
	@FindBy(xpath="//*[@id='Quotes']/ul/li[2]/b/a")
	public
	static WebElement IDVedit;
	
	@FindBy(id="txtIDV")
	public
	static WebElement setidv;
	
	@FindBy(xpath="//*[@id='frmIDV']/div[2]/ul/li[3]/input")
	public
	static WebElement updateidv;
	
	@FindBy(xpath="//*[@id='frmIDV']/a")
	public
	static WebElement cancelidvbtn;
	
	@FindBy(xpath="//*[@id='IDVYes']")
	public
	static WebElement lowestidvbtn;
	
	@FindBy(xpath="//*[@id='app']/div/div[1]/div[2]/div/div[2]/div/div[1]/a")
	public
	static WebElement share;
	
	@FindBy(xpath="//*[@id='share']/ul/li[1]/label")
	public
	static WebElement shareemail;
	
	@FindBy(xpath="//*[@id='share']/ul/li[2]/label")
	public
	static WebElement sharesms;
	
	@FindBy(xpath="//*[@id='share']/ul/li[3]/label")
	public
	static WebElement sharelink;
	
	@FindBy(id="myidcomp")
	public
	static WebElement comprehensive;
	
	@FindBy(id="myIdzero")
	public
	static WebElement zerodep;
	
	@FindBy(id="//*[@id='Quotes']/div[1]/ul/li[3]")
	public
	static WebElement thirdparty;
	
	@FindBy(xpath="//*[@id='newcpachangesmob']/div/div[1]/ul/li/input")
	public
	static WebElement palink;
	
	@FindBy(xpath="//*[@id='151']/ul/li[5]/div/a/span")
	public
	static WebElement quoteslink;
	
	public Quotes_Page(){
		
		PageFactory.initElements(driver, this);
		
	}
	

}

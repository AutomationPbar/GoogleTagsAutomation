package com.fw.qa.pages_motor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fw.qa.baseclass.TestBase;

public class CarQuotes_Page extends TestBase{
	
	
	@FindBy(xpath="//*[@id='rightSection']/div[1]/div[1]/div/ul[2]/li[3]/a")
	public
	static WebElement previousinsurer;
	
	@FindBy(xpath="//*[@id='divmodifydetail']/div/h3/b")
	public
	static WebElement caredit;
	
	@FindBy(xpath="//*[@id='quotes-top']/div[3]/div[1]/div[1]/div[2]/div[1]/p[1]/span")
	public
	static WebElement expiryedit;
	
	
	@FindBy(xpath="//*[@id='quotes-top']/div[3]/div[1]/div[1]/div[2]/div[1]/p[2]/span")
	public
	static WebElement NCBedit;
	
	@FindBy(xpath="//*[@id='prevNCB']")
	public
	static WebElement NCBupdate;
	
	@FindBy(xpath="//*[@class='close-icon rounded']")
	public
	static WebElement NCBclose;
	
	@FindBy(xpath="//*[@id='prev-ncb']/div[1]/ul/li[5]")
	public
	static WebElement NCBupdatevalue;
	
	@FindBy(id="btnUpdate")
	public
	static WebElement updatebtn;
	
	@FindBy(id="addonaccessQuotetsTopLink")
	public
	static WebElement addon;
	
	@FindBy(xpath="//*[@id='tpFilter']/a/em")
	public
	static WebElement viewmore;
	
	@FindBy(xpath="//*[@id='tpFilter']/ul[1]/li[1]/label")
	public
	static WebElement selectaddon;
	
	@FindBy(xpath="//*[@id='tpFilter']/ul[2]/ul/li[2]/label")
	public
	static WebElement selectaccessories;
	
	@FindBy(className="inputField")
	public
	static WebElement accessoriesamt;
	
	@FindBy(className="btn-orange btn-green show")
	public
	static WebElement submitamt;
	
	@FindBy(className="getDiscount")
	public
	static WebElement clickdiscount;
	
	@FindBy(className="btn-orange apply-discount  ")
	public
	static WebElement applydiscount;
	
	@FindBy(xpath="//*[@id='planHeaderdiv']/ul/li[2]/ul[2]/li[2]/div/button")
	public
	static WebElement editidv;
	
	@FindBy(id="divApplyIDVButton")
	public
	static WebElement updateidv;
	
	@FindBy(id="close-idv")
	public
	static WebElement cancelidvbtn;
	
	@FindBy(xpath="//*[@id='dvQuoteList']/div[1]/div[2]/div/div/div/div[2]/span[1]/b")
	public
	static WebElement lowidvvalue;
	
	@FindBy(linkText="SET TO LOWEST")
	public
	static WebElement setlow;
	
	@FindBy(className="idv-display-value")
	public
	static WebElement idvinput;

	@FindBy(xpath="//*[@id='divCTC']/a")
	public
	static WebElement callback;
	
	@FindBy(xpath="//*[@id='divmodifydetail']/div/div[3]/div[1]/div[2]/a[1]")
	public
	static WebElement quotes_email;
	
	
	@FindBy(xpath="//*[@id='tab-content1']/button/span")
	public
	static WebElement submit_email;
	@FindBy(xpath="//*[@id='share']/div[1]/button/span")
	public
	static WebElement emailclose;
	
	
	@FindBy(xpath="//*[@id='dvQuoteList']/div[2]/div[1]/div/ul/li[3]/a[1]")
	public
	static WebElement compare;
	
	@FindBy(xpath="//*[@id='dvQuoteList']/div[2]/div[1]/div/ul/li[3]/a[1]")
	public
	static WebElement remove;
	
	@FindBy(xpath="//*[@id='rightSection']/div[1]/div[2]/div/div[4]/div/a[1]")
	public
	static WebElement comparenow;
	
	@FindBy(xpath="//*[@id='rightSection']/div[1]/div[2]/div/div[4]/div/a[2]")
	public
	static WebElement removeall;
	
	@FindBy(xpath="//*[@id='dvQuoteList']/div[2]/div[1]/div/ul/li[2]/div[2]/div/div/a")
	public
	static WebElement garages;
	
	@FindBy(id="//*[@id='liThirdParty']/label")
	public
	static WebElement thirdparty;
	
	@FindBy(id="//*[@id='liCommVehicle']/label")
	public
	static WebElement commercial;
	
	@FindBy(xpath="//*[@id='dvQuoteList']/div[2]/div/div/ul/li[5]/div/a/span")
	public
	static WebElement quoteslink;
	
	public CarQuotes_Page(){
		
		PageFactory.initElements(driver, this);
		
	}
	
	public void quotespage(){
		try{
			
			previousinsurer.click();
			Thread.sleep(2000);
			thirdparty.click();
			Thread.sleep(2000);
			thirdparty.click();
			Thread.sleep(2000);
			commercial.click();
			Thread.sleep(2000);
			commercial.click();
			Thread.sleep(2000);
			expiryedit.click();
			Thread.sleep(2000);
			NCBclose.click();
			Thread.sleep(2000);
			NCBedit.click();
			Thread.sleep(2000);
			NCBupdate.click();
			Thread.sleep(2000);
			NCBupdatevalue.click();
			Thread.sleep(2000);
			updatebtn.click();
			Thread.sleep(2000);
			NCBedit.click();
			Thread.sleep(2000);
			NCBclose.click();
			Thread.sleep(2000);
			addon.click();
			Thread.sleep(2000);
			selectaddon.click();
			Thread.sleep(2000);
			viewmore.click();
			Thread.sleep(2000);
			selectaccessories.click();
			Thread.sleep(2000);
			accessoriesamt.sendKeys("20000");
			Thread.sleep(2000);
			submitamt.click();
			
			Thread.sleep(9000);
			addon.click();
			Thread.sleep(2000);
			
			clickdiscount.click();
			Thread.sleep(2000);
			applydiscount.click();
			Thread.sleep(2000);
			editidv.click();
			Thread.sleep(2000);
			setlow.click();
			Thread.sleep(2000);
			updateidv.click();
			Thread.sleep(2000);
			editidv.click();
			Thread.sleep(2000);
			idvinput.sendKeys("20000");
			Thread.sleep(2000);
			cancelidvbtn.click();
			Thread.sleep(2000);
			compare.click();
			Thread.sleep(2000);
			comparenow.click();
			Thread.sleep(2000);
			removeall.click();
			Thread.sleep(2000);
			compare.click();
			Thread.sleep(2000);
			remove.click();
			Thread.sleep(2000);
			callback.click();
			Thread.sleep(2000);
			quotes_email.click();
			Thread.sleep(2000);
			submit_email.click();
			Thread.sleep(2000);
			emailclose.click();
			Thread.sleep(2000);
			quoteslink.click();
			
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	

}

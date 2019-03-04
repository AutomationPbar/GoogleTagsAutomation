package com.fw.qa.pages_tw;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.fw.qa.baseclass.TestBase;

public class Summary_Page extends TestBase{

	@FindBy(xpath="//*[@id='accordion']/h3[2]/a")
	public
	static WebElement vehicleedit;
	
	@FindBy(xpath="//*[@id='accordion']/h3[1]/a")
	public
	static WebElement personaledit;
	
	@FindBy(xpath="//*[@id='accordion']/h3[3]/a")
	public
	static WebElement additionaledit;
	
	
	@FindBy(xpath="//*[@id='app']/div/div[1]/div/div[2]/div[6]/div[1]/a")
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
	
	@FindBy(xpath="//*[@id='app']/div/div[2]/div[1]/div/div/div[1]/div[5]/input")
	public
	static WebElement termscomditions;
	
	@FindBy(xpath="//*[@id='btnPG1']/span")
	public
	static WebElement payonline;
	
	public Summary_Page(){
		
		PageFactory.initElements(driver, this);
		
	}
	
	public static void summaryedit(){
		try{
			
			Thread.sleep(2500);
			vehicleedit.click();
			driver.navigate().back();
			Thread.sleep(5000);
			personaledit.click();
			driver.navigate().back();
			Thread.sleep(5000);
			additionaledit.click();
			driver.navigate().back();
			Thread.sleep(5000);
			
			share.click();
			Thread.sleep(2000);
			shareemail.click();
			Thread.sleep(2000);
			sharesms.click();
			Thread.sleep(2000);
			sharelink.click();
			Thread.sleep(2000);
			share.click();
			Thread.sleep(2000);
			termscomditions.click();
			Thread.sleep(2000);
			termscomditions.click();
			Thread.sleep(2000);
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	

}

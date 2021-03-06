package com.fw.qa.pages_health;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.fw.qa.baseclass.TestBase;

public class FillDetails3 extends TestBase {
	
	
	@FindBy(xpath="//*[@id='idAbout']/section/div/div[1]/div[2]/form/div[1]/div/div[4]/div[1]/article/div[2]/select")
	WebElement selfage;
	@FindBy(xpath="//*[@id='idAbout']/section/div/div[1]/div[2]/form/div[1]/div/div[4]/div[2]/article/div[2]/select")
	WebElement spouseage;
	@FindBy(xpath="//*[@id='idAbout']/section/div/div[1]/div[2]/form/div[1]/div/div[4]/div[3]/article/div[2]/select")
	WebElement sonage;
	
	@FindBy(xpath="//*[@id='idAbout']/section/div/div[1]/div[2]/form/div[1]/div/div[4]/div[4]/article/div[2]/select")
	WebElement daughterage;
	

	@FindBy(xpath="//*[@id='idAbout']/section/div/div[1]/div[2]/form/div[1]/div/div[4]/div[5]/article/div[2]/select")
	WebElement fatherage;
	
	@FindBy(xpath="//*[@id='idAbout']/section/div/div[1]/div[2]/form/div[1]/div/div[4]/div[6]/article/div[2]/select")
	WebElement motherage;
	
	@FindBy(xpath="//*[@id='idAbout']/section/div/div[1]/div[2]/form/div[1]/div/div[6]/div[2]/button/span")
	WebElement continuebtn;
	
	
public FillDetails3(){
		
		PageFactory.initElements(driver, this);
	}
	
	
	public void filldetails(String sa,String spa,String soage,String dauage,String Fage,String Mage) throws Exception{
		
		Thread.sleep(6000);
		
		Select selfselect = new Select(selfage);
		selfselect.selectByValue(sa);
		
		Select spouseselect = new Select(spouseage);
		spouseselect.selectByValue(spa);
		
		Select sonselect = new Select(sonage);
		sonselect.selectByValue(soage);
		
		Select daughterselect = new Select(daughterage);
		daughterselect.selectByValue(dauage);
		
		Select fatherselect = new Select(fatherage);
		fatherselect.selectByValue(Fage);
		
		Select motherselect = new Select(motherage);
		motherselect.selectByValue(Mage);
					
	}
	
	public FillDetails4 proceed(){
		
		continuebtn.click();
		return new FillDetails4();
		
	}

}

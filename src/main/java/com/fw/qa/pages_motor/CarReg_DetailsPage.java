package com.fw.qa.pages_motor;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fw.qa.baseclass.TestBase;

public class CarReg_DetailsPage extends TestBase{

	
	@FindBy(xpath="//*[@id='dvRegYear']/ul/div/li[4]/span")
	public
	static WebElement yearvalue;
	
	@FindBy(xpath="//*[@id='dvRegYear']/ul/div/span")
	public
	static WebElement brandnew;
	
	@FindBy(xpath="//*[@id='dvVariant']/h3/span[1]")
	public
	static WebElement detailsbackbtn;
		
	
	@FindBy(xpath="//*[@id='dvRegYear']/h3/span[1]")
	public
	static WebElement regyearbackbtn;
	
	@FindBy(xpath="//*[@id='dvRegYear']/h3/span[3]")
	public
	static WebElement regyearnextbtn;
	
	
	@FindBy(xpath="//*[@id='otheroption']/ul/li[1]")
	public
	static WebElement policynotexpired;
	
	@FindBy(xpath="//*[@id='otheroption']/ul/li[2]")
	public
	static WebElement policy60days;
	
	@FindBy(xpath="//*[@id='otheroption']/ul/li[3]")
	public
	static WebElement policy6090;
	
	@FindBy(xpath="//*[@id='otheroption']/ul/li[4]")  //*[@id="rightSection"]/div[1]/div[1]/div/ul[2]/li[1]/a
	public
	static WebElement policymore90;
	
	@FindBy(xpath="//*[@id='dvclaimmade']/h3/span[1]")
	public
	static WebElement claimback;
	
	@FindBy(xpath="//*[@id='dvclaimmade']/h3/span[3]")
	public
	static WebElement claimnext;
	
	@FindBy(xpath="//*[@id='dvclaimmade']/ul/div/li[1]/span/b")
	public
	static WebElement claimyes;
	
	@FindBy(xpath="//*[@id='dvclaimmade']/ul/div/li[2]/span/b")
	public
	static WebElement claimno;
	
	@FindBy(xpath="//*[@id='dvclaimmade']/ul/div/li[3]/span/b")
	public
	static WebElement claimdontknow;
	
	
	@FindBy(xpath="//*[@id='datepicker']/div/div[2]/table/tbody/tr[2]/td[4]/a")
	public
	static WebElement expirydate;
	
	@FindBy(xpath="//*[@id='cal']/div[2]")
	public
	static WebElement dontknowexpiry;
	
	@FindBy(xpath="//*[@id='otheroption']/ul/div")
	public
	static WebElement knowexact;
	
	public CarReg_DetailsPage(){
		
		PageFactory.initElements(driver, this);
		
	}
	
	public void regdetails(){
		try{
			brandnew.click();
			Thread.sleep(3000);
			detailsbackbtn.click();
			Thread.sleep(2000);
			regyearnextbtn.click();
			Thread.sleep(3000);
			detailsbackbtn.click();
			Thread.sleep(2000);
			yearvalue.click();
			Thread.sleep(2000);
			expirydate.click();
			Thread.sleep(2000);
			claimback.click();
			Thread.sleep(2000);
			dontknow();
			Thread.sleep(2000);
			policynotexpired.click();
			Thread.sleep(2000);
			claimback.click();
			Thread.sleep(2000);
			dontknow();
			Thread.sleep(2000);
			policy60days.click();
			Thread.sleep(2000);
			claimback.click();
			Thread.sleep(2000);
			dontknow();
			Thread.sleep(2000);
			policy6090.click();
			Thread.sleep(2000);
			claimback.click();
			Thread.sleep(2000);
			dontknow();
			Thread.sleep(2000);
			policymore90.click();
			Thread.sleep(2000);
			claimback.click();
			Thread.sleep(2000);
			dontknow();
			Thread.sleep(2000);
			Actions action = new Actions(driver);
			action.moveToElement(knowexact, 20,10).click().build().perform();
			Thread.sleep(4000);
			Thread.sleep(2000);
			expirydate.click();
			Thread.sleep(2000);
			claimyes.click();
			Thread.sleep(2000);
			detailsbackbtn.click();
			Thread.sleep(2000);
			claimno.click();
			Thread.sleep(2000);
			detailsbackbtn.click();
			Thread.sleep(2000);
			claimdontknow.click();
			Thread.sleep(2000);
			detailsbackbtn.click();
			Thread.sleep(2000);
			claimnext.click();
			Thread.sleep(2000);
			
			
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public static void dontknow(){

		
		
		try {
			Actions action = new Actions(driver);
			action.moveToElement(dontknowexpiry, 20,10).click().build().perform();
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

}
}
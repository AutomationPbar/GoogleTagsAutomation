package com.qa.testscases_motor;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.fw.qa.baseclass.TestBase;
import com.fw.qa.pages_motor.CarMake_DetailsPage;
import com.fw.qa.pages_motor.CarProposal_DetailsPage;
import com.fw.qa.pages_motor.CarQuotes_Page;
import com.fw.qa.pages_motor.CarRTO_DetailsPage;
import com.fw.qa.pages_motor.CarReg_DetailsPage;
import com.fw.qa.pages_motor.Car_Home;
import com.fw.qa.utilities.DBManager;
import com.fw.qa.utilities.GetReports;
import com.fw.qa.utilities.GoogleAnalytics;
import com.fw.qa.utilities.ReadCookies;
import com.fw.qa.utilities.S3bucketurl;

public class Testcase1 extends TestBase {
	
	
	
	Car_Home car_home;
	CarRTO_DetailsPage rtodetailspage;
	CarMake_DetailsPage makedetailspage;
	CarReg_DetailsPage regdetailspage;
	CarQuotes_Page quotespage;
	CarProposal_DetailsPage proposaldetailspage;
	
	
	ReadCookies rc;
	
	
	String regnum = "HR551234";
	String Gtoken1;
	String Gtoken2;
	String Gtoken3;
	String Gtoken4;
	String Gtoken5;
	String Gtoken6;
	
	
	File file1 = new File("cookies1.data");
	File file2 = new File("cookies2.data");
	File file3 = new File("cookies3.data");
	File file4 = new File("cookies4.data");
	File file5 = new File("cookies5.data");
	File file6 = new File("cookies6.data");
	static String tableName = "Automation.GAReport";
	
	Date date;
	 String strDate ="" ;
	 static DBManager dbm = new DBManager();
	
	
	public Testcase1(){
		
		super();
	}
	
	@BeforeMethod
	
	public void setup(){
		
		initialization();
		driver.get(prop.getProperty("url_motor"));
		car_home = new Car_Home();
		
		rtodetailspage = new CarRTO_DetailsPage();
		makedetailspage = new CarMake_DetailsPage();
		regdetailspage = new CarReg_DetailsPage();
		quotespage = new CarQuotes_Page();
		
		proposaldetailspage = new CarProposal_DetailsPage();
		
		date = new Date();
		rc = new ReadCookies();
		
		SimpleDateFormat formDate = new SimpleDateFormat("yyyyMMdd");	      
	    strDate = formDate.format(date); // option 2
	}
	
	
	@Test(priority = 1)
	public void getquotestest(){
		
		System.out.println(driver.getTitle());
		
		
		try {
			//car_home.carpage();
			car_home.proceed();
			rtodetailspage.rtodetails();
			makedetailspage.makedetails();
			regdetailspage.regdetails();
			proposaldetailspage.filldetails();
			quotespage.quotespage();
			file1 =rc.readcookie(file1);
			System.out.println("cookie one path" + file1.getAbsolutePath());
			Gtoken1 = rc.returnvisitid(file1);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
			
	/*		try {
				Thread.sleep(2000);
				driver.navigate().back();
				Thread.sleep(2000);
				tw_home.uploadrc.click();
				file2 =rc.readcookie(file2);
				System.out.println("cookie one path" + file2.getAbsolutePath());
				Gtoken2 = rc.returnvisitid(file2);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
				
			try {

				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@id='RegistrationForm']/div[2]/div[2]/a")).click();
				Thread.sleep(2000);
				tw_home.newbike.click();
				Thread.sleep(2000);
				driver.navigate().back();
				Thread.sleep(2000);
				TW_Home.dontknowreg.click();
				Thread.sleep(2000);
				RTO_DetailsPage.rtoclose.click();
				Thread.sleep(2000);
				RTO_DetailsPage.RTOsearch.click();
				Thread.sleep(2000);
				
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			try {
				Thread.sleep(2000);
				RTO_DetailsPage.RTO.sendKeys("Nagpur");
				Thread.sleep(2000);
				RTO_DetailsPage.selectRTO.click();
				Thread.sleep(2000);
				makedetailspage.makebackbtn.click();
				Thread.sleep(2000);
				rtodetailspage.others.click();
				Thread.sleep(2000);
				rtodetailspage.backbtn.click();
				Thread.sleep(2000);
				driver.navigate().back();
				Thread.sleep(2000);
				TW_Home.dontknowreg.click();
				Thread.sleep(4000);
				rtodetailspage.topRTO.click();
				Thread.sleep(2000);
				rtodetailspage.rtonumber.click();
				Thread.sleep(2000);
				Make_DetailsPage.makeclose.click();
				Thread.sleep(2000);
				Make_DetailsPage.manufacturer.click();
				Thread.sleep(2000);
				System.out.println("selecting others make");
				Make_DetailsPage.others.click();
				Thread.sleep(2000);
				Make_DetailsPage.make.sendKeys("Hond");
				Make_DetailsPage.selectmake.click();
				Thread.sleep(2000);
				Make_DetailsPage.modelbackbtn.click();
				Thread.sleep(2000);
				Make_DetailsPage.topmake.click();
				Thread.sleep(2000);
				Make_DetailsPage.makeclose.click();
				Thread.sleep(2000);
				
				System.out.println("selecting model from leftpane");
				Make_DetailsPage.modelselect.click();
				Thread.sleep(2000);
				System.out.println("selecting others model ");
				Make_DetailsPage.others.click();
				Thread.sleep(2000);
				Make_DetailsPage.model.sendKeys("Pul");
				Thread.sleep(2000);
				Make_DetailsPage.selectmake.click();
				Thread.sleep(2000);
				Make_DetailsPage.variantbackbtn.click();
				Thread.sleep(2000);
				System.out.println("selecting model from top models");
				Make_DetailsPage.topmodel.click();
				Thread.sleep(2000);
				Make_DetailsPage.topvariant.click();
				Thread.sleep(2000);
				Reg_DetailsPage.brandnew.click();
				Thread.sleep(2000);
				
				driver.navigate().back();
				Thread.sleep(4000);
				Reg_DetailsPage.yearvalue.click();
				Thread.sleep(2000);
				regdetailspage.previousinsurer.click();
				Thread.sleep(3000);
				
				//driver.switchTo().alert();
				
				
				regdetailspage.policyexpiry.click();
				regdetailspage.expirydate.click();
				regdetailspage.covertype.click();
				
				Thread.sleep(4000);
				
				Quotes_Page.twedit.click();
				Thread.sleep(2500);
				driver.navigate().back();
				Quotes_Page.backVD.click();
				Thread.sleep(2500);
				driver.navigate().back();
				
				
				try{
				Quotes_Page.ncb.click();
				Thread.sleep(2000);
				Quotes_Page.ncbyes.click();
				Thread.sleep(2000);
				}catch(Exception e){
					driver.navigate().refresh();
				}
				
				Thread.sleep(4000);
				Quotes_Page.IDVedit.click();
				//Quotes_Page.updateidvvalue();
				//Quotes_Page.updateidv.click();
				//Quotes_Page.IDVedit.click();
				//Quotes_Page.lowestidvbtn.click();
				Quotes_Page.cancelidvbtn.click();
				
				Quotes_Page.share.click();
				Quotes_Page.shareemail.click();
				Quotes_Page.sharesms.click();
				Quotes_Page.sharelink.click();
				Quotes_Page.share.click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@id='Quotes']/div[1]")).click();
				Thread.sleep(3000);
				//Quotes_Page.thirdparty.click();
				//Thread.sleep(3000);
				Quotes_Page.zerodep.click();
				Thread.sleep(3000);
				Quotes_Page.comprehensive.click();
				Thread.sleep(3000);
				Quotes_Page.palink.click();
				Quotes_Page.palink.click();
				Thread.sleep(3000);
				System.out.println("clicking quotes");
				Quotes_Page.quoteslink.click();
				Thread.sleep(5000);
				
				Proposal_DetailsPage.backbtn1.click();
				Thread.sleep(7000);
				
				Quotes_Page.quoteslink.click();
				Proposal_DetailsPage.previousbtn1.click();
				Thread.sleep(7000);
				Quotes_Page.quoteslink.click();
				Thread.sleep(5000);
				Proposal_DetailsPage.ownername.sendKeys("test");
				Proposal_DetailsPage.mobileno.sendKeys("9777777777");
				Proposal_DetailsPage.email.sendKeys("test@policybazaar.com");
				Proposal_DetailsPage.address.sendKeys("abcdefgh");
				Proposal_DetailsPage.pincode.sendKeys("122003");
				Thread.sleep(4500);
				Proposal_DetailsPage.premiumbreakup.click();
				Thread.sleep(2500);
				Proposal_DetailsPage.popupclose.click();
				Thread.sleep(2500);
				Proposal_DetailsPage.continuestep2.click();
				Thread.sleep(3500);
				Proposal_DetailsPage.backbtn1.click();
				Thread.sleep(3500);
				Quotes_Page.quoteslink.click();
				Thread.sleep(7000);
				Proposal_DetailsPage.continuestep2.click();
				Thread.sleep(3500);
				Proposal_DetailsPage.previousbtn1.click();
				Thread.sleep(3500);
				Proposal_DetailsPage.continuestep2.click();
				Thread.sleep(3500);
				Proposal_DetailsPage.selectnomineedetails();
				Thread.sleep(5000);
				Proposal_DetailsPage.continuestep2.click();
				Thread.sleep(3500);
				Proposal_DetailsPage.backbtn1.click();
				Thread.sleep(3500);
				Quotes_Page.quoteslink.click();
				Thread.sleep(7000);
				Thread.sleep(3500);
				Proposal_DetailsPage.continuestep2.click();
				Thread.sleep(3500);
				Proposal_DetailsPage.continuestep2.click();
				Thread.sleep(3500);
				Proposal_DetailsPage.previousbtn1.click();
				Thread.sleep(3500);
				Proposal_DetailsPage.continuestep2.click();
				Thread.sleep(3500);
				Proposal_DetailsPage3.filldetails();
				Thread.sleep(5000);
				//Proposal_DetailsPage3.saveproceed.click();
				
				Summary_Page.summaryedit();
				file4 =rc.readcookie(file4);
				System.out.println("cookie one path" + file4.getAbsolutePath());
				Gtoken4 = rc.returnvisitid(file4);
				
				Thread.sleep(5000);
				Summary_Page.payonline.click();
				Thread.sleep(5000);
				file5 =rc.readcookie(file5);
				
				System.out.println("cookie one path" + file5.getAbsolutePath());
				Gtoken5 = rc.returnvisitid(file5);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
	
		GetReports.insertcookiedata(Gtoken4, "TW",strDate, false,true);*/
	}

	
}


package com.qa.testcases_tw;

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
import com.fw.qa.pages_tw.HomePage;
import com.fw.qa.pages_tw.Make_DetailsPage;
import com.fw.qa.pages_tw.Quotes_Page;
import com.fw.qa.pages_tw.RTO_DetailsPage;
import com.fw.qa.pages_tw.Reg_DetailsPage;
import com.fw.qa.pages_tw.TW_Home;
import com.fw.qa.utilities.DBManager;
import com.fw.qa.utilities.GetReports;
import com.fw.qa.utilities.GoogleAnalytics;
import com.fw.qa.utilities.ReadCookies;
import com.fw.qa.utilities.S3bucketurl;

public class Testcase2 extends TestBase {
	
	
	HomePage homepage;
	TW_Home tw_home;
	RTO_DetailsPage rtodetailspage;
	Make_DetailsPage makedetailspage;
	Reg_DetailsPage regdetailspage;
	Quotes_Page quotespage;
	
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
	
	
	public Testcase2(){
		
		super();
	}
	
	@BeforeMethod
	
	public void setup(){
		
		initialization();
		driver.get(prop.getProperty("url_tw"));
		homepage = new HomePage();
		tw_home = new TW_Home();
		rtodetailspage = new RTO_DetailsPage();
		makedetailspage = new Make_DetailsPage();
		regdetailspage = new Reg_DetailsPage();
		quotespage = new Quotes_Page();
		date = new Date();
		rc = new ReadCookies();
		
		SimpleDateFormat formDate = new SimpleDateFormat("yyyyMMdd");	      
	    strDate = formDate.format(date); // option 2
	}
	
	
	@Test(priority = 1)
	public void getquotestest(){
		
		System.out.println(driver.getTitle());
		
		
		try {
			TW_Home.regno.sendKeys(regnum);
			TW_Home.getdetails.click();
			file1 =rc.readcookie(file1);
			System.out.println("cookie one path" + file1.getAbsolutePath());
			Gtoken1 = rc.returnvisitid(file1);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
			
			try {
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
				file3 =rc.readcookie(file3);
				System.out.println("cookie one path" + file3.getAbsolutePath());
				Gtoken3 = rc.returnvisitid(file3);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			try {
				Thread.sleep(2000);
				driver.navigate().back();
				Thread.sleep(2000);
				TW_Home.dontknowreg.click();
				file4 =rc.readcookie(file4);
				System.out.println("cookie one path" + file4.getAbsolutePath());
				Gtoken4 = rc.returnvisitid(file4);
				
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
				makedetailspage.topmake.click();
				Thread.sleep(2000);
				makedetailspage.topmodel.click();
				Thread.sleep(2000);
				makedetailspage.topvariant.click();
				Thread.sleep(2000);
				regdetailspage.yearvalue.click();
				Thread.sleep(2000);
				regdetailspage.previousinsurer.click();
				Thread.sleep(3000);
				
				//driver.switchTo().alert();
				System.out.println("clicking alert");
				
				regdetailspage.policyexpiry.click();
				regdetailspage.expirydate.click();
				regdetailspage.covertype.click();
				System.out.println("clicked alert");
				Thread.sleep(4000);
				
				Quotes_Page.twedit.click();
				Thread.sleep(2500);
				driver.navigate().back();
				Quotes_Page.backVD.click();
				Thread.sleep(2500);
				driver.navigate().back();
				Quotes_Page.IDVedit.click();
				Quotes_Page.lowestidvbtn.click();
				Quotes_Page.setidv.clear();
				Quotes_Page.setidv.sendKeys("54678");
				//Quotes_Page.updateidv.click();
				//Quotes_Page.IDVedit.click();
				Quotes_Page.cancelidvbtn.click();
				
				Quotes_Page.share.click();
				Quotes_Page.shareemail.click();
				Quotes_Page.sharesms.click();
				Quotes_Page.sharelink.click();
				Quotes_Page.share.click();
				
				driver.switchTo().frame("/html/head/style/text()");
				Thread.sleep(3000);
				Quotes_Page.thirdparty.click();
				Thread.sleep(3000);
				Quotes_Page.zerodep.click();
				Thread.sleep(3000);
				Quotes_Page.comprehensive.click();
				Thread.sleep(3000);
				Quotes_Page.palink.click();
				Quotes_Page.quoteslink.click();
				
				
				file5 =rc.readcookie(file5);
				
				System.out.println("cookie one path" + file5.getAbsolutePath());
				Gtoken5 = rc.returnvisitid(file5);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
	
		//GetReports.insertcookiedata(Gtoken4, "TW",strDate, false,true);
	}

	
}


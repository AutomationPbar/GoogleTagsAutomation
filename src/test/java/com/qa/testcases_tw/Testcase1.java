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
import com.fw.qa.pages_tw.TW_Home;
import com.fw.qa.utilities.DBManager;
import com.fw.qa.utilities.GetReports;
import com.fw.qa.utilities.GoogleAnalytics;
import com.fw.qa.utilities.ReadCookies;
import com.fw.qa.utilities.S3bucketurl;

public class Testcase1 extends TestBase {
	
	
	HomePage homepage;
	TW_Home tw_home;
	
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
		driver.get(prop.getProperty("url_tw"));
		homepage = new HomePage();
		tw_home = new TW_Home();
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
			
			
			
	
		GetReports.insertcookiedata(Gtoken4, "TW",strDate, false,true);
	}

	
}


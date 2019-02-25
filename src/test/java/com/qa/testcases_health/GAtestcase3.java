
package com.qa.testcases_health;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.fw.qa.baseclass.TestBase;
import com.fw.qa.pages_health.FillDetails2;
import com.fw.qa.pages_health.FillDetails3;
import com.fw.qa.pages_health.FillDetails4;
import com.fw.qa.pages_health.FillDetailsPage;
import com.fw.qa.pages_health.HomeScreen;
import com.fw.qa.pages_health.QuotesDetailsPage;
import com.fw.qa.pages_health.QuotesPage;
import com.fw.qa.utilities.DBManager;
import com.fw.qa.utilities.GetReports;
import com.fw.qa.utilities.GoogleAnalytics;
import com.fw.qa.utilities.ReadCookies;
import com.fw.qa.utilities.S3bucketurl;

public class GAtestcase3 extends TestBase {
	
	String nam = "Automation GA Test";
	String city = "Gurgaon";
	HomeScreen homescreen;
	FillDetailsPage detailspage1;
	FillDetails2 detailspage2;
	FillDetails3 detailspage3;
	FillDetails4 detailspage4;
	QuotesPage quotespage;
	QuotesDetailsPage quotesdetails;
	ReadCookies rc;
	
	
	String m = "9777777777";
	String c = "Gurgaon";
	String selfage = "35";
	String spousea = "32";
	String sonage = "3";
	String daughterage = "6";
	String fatherage = "59";
	String motherage = "56";
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
	
	
	public GAtestcase3(){
		
		super();
	}
	
	@BeforeMethod
	
	public void setup(){
		
		initialization();
		driver.get(prop.getProperty("url_health"));
		homescreen = new HomeScreen();
		detailspage1 = new FillDetailsPage();
		rc = new ReadCookies();
		date = new Date();
		
		
		SimpleDateFormat formDate = new SimpleDateFormat("yyyyMMdd");

	       // String strDate = formDate.format(System.currentTimeMillis()); // option 1
	       strDate = formDate.format(date); // option 2
	}
	
	
	@Test(priority = 1)
	public void getquotestest(){
		
		System.out.println(driver.getTitle());
		try {
			FillDetailsPage.continuebtn.click();
			Thread.sleep(1000);
			detailspage1.filldetails(nam,m);
			file1 =rc.readcookie(file1);
			System.out.println("cookie one path" + file1.getAbsolutePath());
			Gtoken1 = rc.returnvisitid(file1);
			
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		try {
			detailspage2 = detailspage1.proceed();
			file2 =rc.readcookie(file2);
			System.out.println("cookie one path" + file2.getAbsolutePath());
			Gtoken2 = rc.returnvisitid(file2);
			detailspage2.selectdetails();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		try {
			detailspage3 = detailspage2.proceed();
			file3 =rc.readcookie(file3);
			System.out.println("cookie one path" + file3.getAbsolutePath());
			Gtoken3 = rc.returnvisitid(file3);
			detailspage3.filldetails(selfage, spousea, sonage, daughterage,fatherage,motherage);

			System.out.println("clicking continue after selecting age");
			detailspage4 = detailspage3.proceed();
			file4 =rc.readcookie(file4);
			System.out.println("cookie one path" + file4.getAbsolutePath());
			Gtoken4 = rc.returnvisitid(file4);
			detailspage4.filldetails(city);
			
			quotespage = detailspage4.proceed();
			file5 =rc.readcookie(file5);
			System.out.println("cookie one path" + file5.getAbsolutePath());
			Gtoken5 = rc.returnvisitid(file5);
			
			quotesdetails = quotespage.proceed();
			file6 =rc.readcookie(file6);
			System.out.println("cookie one path" + file6.getAbsolutePath());
			Gtoken6 = rc.returnvisitid(file6);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.close();
		
		try {
			System.out.println("setting is active 0 for all previous records");
			GetReports.UpdateQueryActiveStatus(tableName);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		GetReports.insertcookiedata(Gtoken2, "Health",strDate, false,true);
	}

	
}


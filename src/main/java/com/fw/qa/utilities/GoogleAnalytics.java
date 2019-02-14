package com.fw.qa.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.fw.qa.baseclass.TestBase;
import com.fw.qa.utilities.DBManager;
import com.fw.qa.utilities.GAPOM;


public class GoogleAnalytics {
	
	static String rawreporturl= ""; 
	static WebDriver driver;
	static WebDriverWait wait;
	static String baseURL = "https://analytics.google.com/analytics/web/";

	private static String GUser = "avani@policybazaar.com";
	private static String GPass = "PolicyB@1234";

	static String date1 = "";
	static String date2 = "";
	static String journey = "";
	static String localDate= "";
	static String newName = "";

	static String finalURLPart1 = "https://analytics.google.com/analytics/web/?authuser=0#/report/visitors-user-activity/";
	static String finalURLPart2 = "/_u.date00=";
	static String finalURLPart3 = "&_u.date01=";
	static String finalURLPart4 = "&_r.userId=";
	static String finalURLPart5 = "&_r.userListReportStates=%3F_u.date00=";
	static String finalURLPart6 = "%2526_u.date01=";
	static String finalURLPart7 = "%2526explorer-table.filter=";
	static String finalURLPart8 = "%2526explorer-table.plotKeys=%5B%5D&_r.userListReportId=visitors-legacy-user-id/";
	
	static String downloadLocation = "C:\\GoogleAnalyticsProject\\GA\\";
	
	static String visitid = "735642638.1548999298";
	
	static String filepath = "C:\\GoogleAnalyticsProject\\GA\\user-report-export.json";
	static String reportpath = "C:\\GoogleAnalyticsProject\\GA\\";
	
	//@BeforeTest
	
	public static void setProperties() {
		
		
		try {

			System.setProperty("webdriver.chrome.driver", "C:/eclipse/chromedriver.exe");
			

			HashMap<String, Object> prefs = new HashMap<String, Object>();
			prefs.put("profile.default_content_settings.popups", 0);
			prefs.put("download.default_directory", downloadLocation);

			ChromeOptions options = new ChromeOptions();
			options.setExperimentalOption("prefs", prefs);
			DesiredCapabilities cap = DesiredCapabilities.chrome();
			cap.setCapability(ChromeOptions.CAPABILITY, options);
			prefs.put("download.prompt_for_download", false);

			FileUtils.cleanDirectory(new File(downloadLocation));
			
			driver = new ChromeDriver(cap);

			// d = new FirefoxDriver();

			wait = new WebDriverWait(driver, 30);

			driver.manage().window().maximize();

		} catch (Exception e) {

			// System.out.println(e);
		}

	}
//@Test	
	public static String getExcelReportData(String id,String date,String cj) throws InterruptedException, IOException {
	
		System.out.println("opening google analytics website ");
		setProperties();
		
		System.out.println("opened google analytics website");
		Thread.sleep(2000);
		
		visitid = id;
		date1 = date;
		date2 =  date;
		localDate = date;
		journey = cj;

		driver.get(baseURL);

		Thread.sleep(2000);

		try {

		

			wait.until(ExpectedConditions.visibilityOf(GAPOM.googleUsername(driver))).sendKeys(GUser);
			wait.until(ExpectedConditions.visibilityOf(GAPOM.googleNextButton(driver))).click();

			Thread.sleep(2000);

			wait.until(ExpectedConditions.visibilityOf(GAPOM.googlePassword(driver))).sendKeys(GPass);
			wait.until(ExpectedConditions.visibilityOf(GAPOM.googleNextButton2(driver))).click();

			Thread.sleep(10000);

			String currURL = driver.getCurrentUrl();

			int indexOfSlash = currURL.lastIndexOf("/");

			System.out.println("Current URL : " + currURL);
			String encodedPart = "a4743078w116032314p121329761";

			System.out.println("Encoded Part : " + encodedPart);

			//Campaign 1
			
			try{
			
			String finalURL = finalURLPart1 + encodedPart + finalURLPart2 + date1 + 
					finalURLPart3 + date2 + finalURLPart4 +visitid+ finalURLPart5+date1+finalURLPart6+date2+
					finalURLPart7+visitid+finalURLPart8;

			System.out.println("Final URL : " + finalURL);

			driver.navigate().to(finalURL);

			Thread.sleep(30000);

			driver.switchTo().frame("galaxyIframe");

			Thread.sleep(4000);
			
			driver.findElement(By.xpath("//*[@id='ID-activity-userActivityTable']/div/div[2]/span[6]/button")).click();
			
			
			}catch(Exception e){
				e.printStackTrace();
			}
			
			
			JsonReader.readjsonfile(filepath);
			
			System.out.println("file converted to excel successfully");
			
			driver.close();
			
			//unzip("C:\\GoogleAnalyticsProject\\GA\\user-report-export.zip\\", "C:\\GoogleAnalyticsProject\\GA\\");
			
			File folder = new File("C:\\GoogleAnalyticsProject\\GA\\");
			File[] listOfFiles = folder.listFiles();
			
			System.out.println("size of files" + listOfFiles.length);
			File oldFile = null;
			for (File file : listOfFiles) {
			   
			       // System.out.println(file.getName());
			        if (file.getName().endsWith((".xlsx"))) {
			        	System.out.println("the excel file name is " +file.getName());
			        	oldFile = file;
			    }    
			}
			
			 newName = "GA_Actual_Report_"+journey+localDate+".xlsx";
			    String newFilePath = oldFile.getAbsolutePath().replace(oldFile.getName(), "") + newName;
			    File newFile = new File(newFilePath);

			    try {
			      FileUtils.moveFile(oldFile, newFile);
			    } catch (IOException e) {
			      e.printStackTrace();
			    }
		} catch (Exception e) {

			e.printStackTrace();

		}
		
		reportpath = reportpath+newName;
		rawreporturl=S3bucketurl.GetUrl(newName, "", "","xlsx","Excel","PortalAutomation", reportpath);
		
		
		 return newName;
		 
	}


private static void unzip(String zipFilePath, String destDir) {
    File dir = new File(destDir);
    // create output directory if it doesn't exist
    if(!dir.exists()) dir.mkdirs();
    FileInputStream fis;
    //buffer for read and write data to file
    byte[] buffer = new byte[1024];
    try {
        fis = new FileInputStream(zipFilePath);
        ZipInputStream zis = new ZipInputStream(fis);
        ZipEntry ze = zis.getNextEntry();
        while(ze != null){
            String fileName = ze.getName();
            File newFile = new File(destDir + File.separator + fileName);
            System.out.println("Unzipping to "+newFile.getAbsolutePath());
            //create directories for sub directories in zip
            new File(newFile.getParent()).mkdirs();
            FileOutputStream fos = new FileOutputStream(newFile);
            int len;
            while ((len = zis.read(buffer)) > 0) {
            fos.write(buffer, 0, len);
            }
            fos.close();
            //close this ZipEntry
            zis.closeEntry();
            ze = zis.getNextEntry();
        }
        //close last ZipEntry
        zis.closeEntry();
        zis.close();
        fis.close();
    } catch (IOException e) {
        e.printStackTrace();
    }
    
}

}

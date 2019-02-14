package com.gareport;


import org.testng.annotations.Test;

import com.fw.qa.utilities.DBManager;
import com.fw.qa.utilities.GetReports;
import com.fw.qa.utilities.GoogleAnalytics;
import com.fw.qa.utilities.JsonReader;

public class ApiTest {
	String Datareport[]= null;
	
	String finalreporturl = "http://myaccountpb.s3.ap-south-1.amazonaws.com/PortalAutomation/961c0a1c-666b-4a4f-86f8-80e6f55d1876-FinalResult_12_02_2019_12_01.xlsx";
	String rawreporturl = "http://myaccountpb.s3.ap-south-1.amazonaws.com/PortalAutomation/09609eeb-e713-4b68-b9e9-6c3f7c2d74d9-GA_ReportHealth20190208.xlsx";
	String expectedreporturl = "http://myaccountpb.s3.ap-south-1.amazonaws.com/PortalAutomation/9acc8230-c02c-446a-b514-ccb88a673e4e-refrence.xlsx";
	static String tableName = "Automation.GAReport";
	static String filepath = "C:\\GoogleAnalyticsProject\\GA\\user-report-export.json";
	
	@Test
	public void returnapi() throws Exception{
		
		
		
		GetReports.getRawReport();
		
	}

}

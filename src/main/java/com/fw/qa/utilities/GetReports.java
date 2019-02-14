package com.fw.qa.utilities;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.fw.qa.utilities.DBManager;
import com.fw.qa.utilities.ExcelComapre;
import com.fw.qa.utilities.GoogleAnalytics;
import com.fw.qa.utilities.S3bucketurl;
import com.microsoft.sqlserver.jdbc.SQLServerException;

public class GetReports {
	
	static String QADB_Path = "jdbc:sqlserver://10.0.10.43:1433;DatabaseName=PBCroma";
	private static String QAusename = "UATUser";
	private static String QApassword = "UAT123User";
	
	static String tableName = "Automation.GAReport";
	static DBManager dbm = new DBManager();
	
	static String DBQuery = "Select ID,GATag, ProductName,CookieDate from Automation.GAReport where IsActive = 1";
	
	static String Gaid = "";
	static String CJ = "";
	static String CJDate = "";
	static String rawreporturl = "";
	static String expectedreporturl = "";
	static int uniqueID ;
	
	static String expectedreportpath = "C:\\GoogleAnalyticsProject\\compare\\";
	static String expectedreportName = "Ga_Expected.xlsx";
	static String rawreportpath = "C:\\GoogleAnalyticsProject\\GA\\";
	static String rawReportName = "";
	static String FinalReportData[] = null;
	
	static String finalreportpath = "C:\\GoogleAnalyticsProject\\GA\\";
	static String finalreportname = "";
	static String finalreporturl = "";
	static String status = "";
	
	static boolean result = true;
	
	public static void connect(){
		
		try {
			
			dbm.DBConnection(QADB_Path, QAusename, QApassword);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	
	
	public static void insertcookiedata(String gaid, String CJ,String cjdate,boolean status,boolean active){
		
		try {
			connect();
			System.out.println("inserting data");
			dbm.SetGAData(gaid,"", 0, 0, 0, CJ, "", "", "", status,active,cjdate, "", "", "", tableName);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	public static void getRawReport(){
		
		connect();
		
		try{
		ArrayList<Integer> id = new ArrayList<Integer>();
		ArrayList<String> gaid = new ArrayList<String>();
		ArrayList<String> journey = new ArrayList<String>();
		ArrayList<String> cjdate = new ArrayList<String>();
		ResultSet resultSet = dbm.GetResultSet(DBQuery);
		int resultSetSize = 0;

		do {
			resultSet.beforeFirst();
			resultSet.last();
			resultSetSize = resultSet.getRow();
		} while (resultSet.next());

		System.out.println("Result Count :" + resultSetSize);
		int resultCounter = 0;
		resultSet.first();
		if (resultSetSize > 0) {
			do {
				resultCounter = resultCounter + 1;
				
				System.out.println("GAID" + resultSet.getString(1));
				
				int ID_1 = resultSet.getInt(1);
				String GAID_1 = resultSet.getString(2);
				String Journey1 = resultSet.getString(3);
				String cjdate1 = resultSet.getString(4);
				
				if (!GAID_1.equals(null)) {
					id.add(ID_1);
					gaid.add(GAID_1);
					journey.add(Journey1);
					cjdate.add(cjdate1);
		
				}

			} while (resultSet.next());

		}
		
		for(int i = 0;i<gaid.size();i++){
			
			System.out.println("The unique is id" + id.get(i));
			System.out.println("the gaid is " + gaid.get(i));
			System.out.println("the journey is " + journey.get(i));
			System.out.println("the date is " + cjdate.get(i));
			
		}
		
		uniqueID = id.get(0);
		Gaid = gaid.get(0);
		CJ = journey.get(0);
		CJDate = cjdate.get(0);
		
		System.out.println(uniqueID + Gaid + CJ + CJDate);
		
		rawReportName=GoogleAnalytics.getExcelReportData(Gaid, CJDate, CJ);
		rawreportpath = rawreportpath+rawReportName;
		
		rawreporturl = S3bucketurl.GetUrl(rawReportName, "","","xlsx","Excel","PortalAutomation", rawreportpath);
		
		System.out.println("rawreport report url " + rawreporturl);
		expectedreportpath = expectedreportpath+expectedreportName;
		
		expectedreporturl = S3bucketurl.GetUrl(expectedreportName, "","","xlsx","Excel","PortalAutomation", expectedreportpath);
		
		System.out.println("expected report url " + expectedreporturl);
		rawReportName = rawReportName.split("\\.")[0];
		System.out.println("the rawreportname is " + rawReportName);
		FinalReportData= ExcelComapre.reportsheet(rawReportName);
		
		status = FinalReportData[0];
		
		if(status.equalsIgnoreCase("false")){
			result = false;
		}
		System.out.println("the status is " + status);
		
		finalreportname = FinalReportData[1];
		System.out.println("the final file is " + finalreportname);
		
		finalreportpath = finalreportpath+finalreportname;
		
		finalreporturl = S3bucketurl.GetUrl(finalreportname, "","","xlsx","Excel","PortalAutomation",finalreportpath);
		
		System.out.println("final report url " + finalreporturl);
		
		DBManager.UpdateGAData(Gaid, "",0,0,0,CJ, rawreporturl,expectedreporturl,finalreporturl,result, false,"",null,null,null,tableName,uniqueID);

	} catch (Exception e) {
		e.printStackTrace();
	}
		
	}
	

}

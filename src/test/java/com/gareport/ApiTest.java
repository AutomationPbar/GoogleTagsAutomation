package com.gareport;


import org.testng.annotations.Test;

import com.fw.qa.utilities.DBManager;
import com.fw.qa.utilities.GetReports;
import com.fw.qa.utilities.GoogleAnalytics;
import com.fw.qa.utilities.JsonReader;

public class ApiTest {
	String Datareport[]= null;
	
	
	@Test
	public void returnapi() throws Exception{
		
		
		
		GetReports.getRawReport();
		
	}

}

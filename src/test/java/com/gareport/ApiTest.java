package com.gareport;


import org.testng.annotations.Test;

import com.fw.qa.utilities.GetReports;


public class ApiTest {
	String Datareport[]= null;
	
	
	@Test
	public void returnapi() throws Exception{
		
		
		
		GetReports.getRawReport();
		
	}

}

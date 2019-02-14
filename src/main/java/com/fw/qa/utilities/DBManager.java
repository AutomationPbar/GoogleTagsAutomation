package com.fw.qa.utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DBManager {

	private static Connection con = null;
	private static Statement stmt = null;
	ResultSet res;

	public void DBConnection(String DBPath, String Username, String Password) throws Exception {
		try {

			//DriverManager.registerDriver(new com.microsoft.sqlserver.jdbc.SQLServerDriver());

			System.out.println("Driver Registered");
			con = DriverManager.getConnection(DBPath, Username, Password);
			System.out.println("Database Connected");
			stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			System.out.println("Stm created");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public ResultSet GetResultSet(String DBQuery) throws Exception {

		try {

			res = stmt.executeQuery(DBQuery);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return res;
	}

	public String[][] GetResultSet1(String DBQuery, int bookingCount, String[] ColumnNames) throws Exception {

		String[][] ResultSets = new String[bookingCount][5];

		try {

			res = stmt.executeQuery(DBQuery);

			int j = 0;

			while (res.next()) {
				int i = 1;

				System.out.println(" ");

				for (i = 1; i <= 5; i++) {

					ResultSets[j][i - 1] = res.getString(i);
					System.out.print(res.getString(i) + " ");

				}
				j++;
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return ResultSets;
	}

	public ArrayList<String> GetResultSetArrayList(String DBQuery, String[] ColumnNames) throws Exception {

		ArrayList<String> ResultSets = new ArrayList<String>();

		try {

			res = stmt.executeQuery(DBQuery);

			while (res.next()) {

				for (int i = 0; i < ColumnNames.length; i++) {

					ResultSets.add(res.getString(ColumnNames[i]));

				}
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return ResultSets;
	}

	public void InsertData(ArrayList<String> data, String tableName) throws SQLException {

		String val = "";
		for (int i = 0; i < data.size(); i++) {

			val = val + "," + data.get(i);

		}

		stmt.executeUpdate("INSERT INTO " + tableName + " values " + val);

	}

	public void SetData(String PRINumber, String spamScore, String remarks, String currDate,
			 String tableName) throws SQLException {

		int isProcessed = 1;
		int isActive = 1;

		try {
			String datam = "(" + PRINumber + ", " + spamScore + ", " + remarks + ", "
					+ currDate + "');";

			System.out.println("DataM " + datam);

		} catch (Exception e) {
			System.out.println(e);
		}

		stmt.executeUpdate("INSERT INTO " + tableName
				+ "(PRINumber, SpamCount, Remarks, CreatedOn) values ('"
				+ PRINumber + "','" + spamScore + "','" + remarks + "','" + currDate + "');");

		tear();

	}
	
	
	public static void UpdateGAData(String GAtag, String custID, int visitid, int LeadID, int ProductId,
			String ProductName,String expectedURL,String rawreporturl,String FinalReportUrl,boolean passed,boolean IsActive,
			String date,String Remarks,String missingInActual,String missingInExpected,String tableName,int uniqueid)
			throws SQLException {

		try {
			String datam = "('" +uniqueid +"," +GAtag+ "','" + custID + "','" + visitid + "','" + LeadID + "','" +
					ProductId + "','" + ProductName + "','" + expectedURL +"','"+
					rawreporturl + "','" + FinalReportUrl + "','" + passed +"','"+
					IsActive + "','" + Remarks +"','" + missingInActual + "','" + missingInExpected +"','"+ date +"');";

			System.out.println("DataM " + datam);

		} catch (Exception e) {
			System.out.println(e);
		}

		try{
			 System.out.println("UPDATE " + tableName
						+ " SET ExpectedDataURL ='"+expectedURL+"',RawReportURL ='"+ rawreporturl+"',FinalReportURL ='" +FinalReportUrl+"', IsPassed ="+passed+",IsActive="+IsActive+",Remarks="+Remarks+",TagsMissingInActual="+missingInActual+",TagsMissingInExpected="+missingInExpected +" where ID ="+uniqueid);
				
			 stmt.executeUpdate("UPDATE " + tableName
					+ " SET ExpectedDataURL ='"+expectedURL+"',RawReportURL ='"+ rawreporturl+"',FinalReportURL ='" +FinalReportUrl+"', IsPassed ='"+passed+"',IsActive='"+IsActive+"',Remarks="+Remarks+",TagsMissingInActual="+missingInActual+",TagsMissingInExpected="+missingInExpected +" where ID ="+uniqueid); 
			
		}catch( Exception e){
			e.printStackTrace();
			
		}
		tear();

	}
	
	public void SetGAData(String GAtag, String custID, int visitid, int LeadID, int ProductId,
			String ProductName,String expectedURL,String rawreporturl,String FinalReportUrl,boolean passed,boolean IsActive,
			String date,String Remarks,String missingInActual,String missingInExpected,String tableName)
			throws SQLException {

		try {
			String datam = "('" + GAtag+ "','" + custID + "','" + visitid + "','" + LeadID + "','" +
					ProductId + "','" + ProductName + "','" + expectedURL +"','"+
					rawreporturl + "','" + FinalReportUrl + "','" + passed +"','"+
					IsActive + "','" + Remarks +"','" + missingInActual + "','" + missingInExpected +"','"+ date +"');";

			System.out.println("DataM " + datam);

		} catch (Exception e) {
			System.out.println(e);
		}

		try{
			
				stmt.executeUpdate("INSERT INTO " + tableName
					+ "(GATag,CustIDTag,VisitorIDTag, LeadID,ProductID,ProductName,ExpectedDataURL,RawReportURL,FinalReportURL,IsPassed,IsActive,Remarks,TagsMissingInActual,TagsMissingInExpected,CookieDate) values ('" + GAtag+ "','" + custID + "','" + visitid + "','" + LeadID + "','" +
					ProductId + "','" + ProductName + "','" + expectedURL +"','"+
					rawreporturl + "','" + FinalReportUrl + "','" + passed +"','"+
					IsActive + "','" + Remarks +"','" + missingInActual + "','" + missingInExpected +"','"+ date+"');");
		}catch(Exception e){
			
			e.printStackTrace();
		}
		tear();

	}

	public int UpdateQuery(String DBQuery) throws Exception {

		int i = 0;
		try {
			i = stmt.executeUpdate(DBQuery);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return i;
	}

	public static void tear() {
		con = null;
	}

}

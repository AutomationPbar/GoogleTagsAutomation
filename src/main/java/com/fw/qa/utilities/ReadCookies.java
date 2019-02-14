package com.fw.qa.utilities;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;

import org.openqa.selenium.Cookie;

import com.fw.qa.baseclass.TestBase;

public class ReadCookies extends TestBase{
	
	ParseCookie pc = new ParseCookie();
	String token;
	File file = new File("Cookies.data");
	public File readcookie(File f) throws FileNotFoundException{
		
		
        try		
        {	  
            // Delete old file if exists
			f.delete();		
            f.createNewFile();			
            FileWriter fileWrite = new FileWriter(f);							
            BufferedWriter Bwrite = new BufferedWriter(fileWrite);							
            // loop for getting the cookie information 		
            	
            // loop for getting the cookie information 		
            for(Cookie ck : driver.manage().getCookies())							
            {			
                Bwrite.write((ck.getName()+";"+ck.getValue()+";"+ck.getDomain()+";"+ck.getPath()+";"+ck.getExpiry()+";"+ck.isSecure()));																									
                Bwrite.newLine();             
            }			
            Bwrite.close();			
            fileWrite.close();	
            
        }
        catch(Exception ex)					
        {		
            ex.printStackTrace();			
        }	
        return f;
        
    }	
	
	
	public String returnvisitid(File f){
		String file_path = f.getAbsolutePath();
		System.out.println("file path is " +file_path);
       token = pc.parseFile(file_path ,"_ga;GA1.3.");
        return token;
	}
		
	}



package com.fw.qa.utilities;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ParseCookie {

	String visit_token = "";
    public String parseFile(String fileName,String searchStr){
    	try{
    	System.out.println("getting the string parsed");
        Scanner scan = new Scanner(new File(fileName));
        while(scan.hasNext()){
            String line = scan.nextLine().toString();
            if(line.contains(searchStr)){
                System.out.println("the line is " +line);
                String newline = line;
                String[] ss;
                ss= newline.split("\\_ga;GA1.3.");
                ss = ss[1].split("\\;");
      
                System.out.println("the GA visit Token is "+ss[0]);
                visit_token = ss[0];
                
            }
        }
        }catch(Exception e){
        	e.printStackTrace();
        
        }
        return visit_token;
    }


}

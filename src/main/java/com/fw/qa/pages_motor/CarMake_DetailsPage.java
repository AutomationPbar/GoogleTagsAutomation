package com.fw.qa.pages_motor;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fw.qa.baseclass.TestBase;

public class CarMake_DetailsPage extends TestBase{
	
	@FindBy(xpath="//*[@id='searchInput']/div/input")
	public
	static WebElement make;
	
	@FindBy(xpath="//*[@id='searchInput']/div/input")
	public
	static WebElement model;
	
	@FindBy(xpath="//*[@id='react-autowhatever-1--item-0']/span")
	public
	static WebElement selectmake;
	
	
	@FindBy(xpath="//*[@id='searchOthers']")
	public
	static WebElement others;
	
	
	@FindBy(xpath="//*[@id='dvMake']/ul/div/li[1]/span")
	public
	static WebElement topmake;
	
	
	@FindBy(xpath="//*[@id='dvModel']/ul/div/li[1]/span/b")
	public
	static WebElement topmodel;
	
	@FindBy(xpath="//*[@id='dvModel']/h3/span[1]")
	public
	static WebElement modelbackbtn;
	
	@FindBy(xpath="//*[@id='dvModel']/h3/span[3]")
	public
	static WebElement modelnextbtn;
	
	@FindBy(xpath="//*[@id='dvMake']/h3/span[1]")
	public
	static WebElement makebackbtn;
	
	@FindBy(xpath="//*[@id='dvMake']/h3/span[3]")
	public
	static WebElement makenextbtn;
	
	@FindBy(xpath="//*[@id='dvFuelType']/ul/div/li[2]/span")
	public
	static WebElement fueltype;
	
	@FindBy(xpath="//*[@id='dvFuelType']/h3/span[1]")
	public
	static WebElement fuelbackbtn;
	
	@FindBy(xpath="//*[@id='dvFuelType']/h3/span[3]")
	public
	static WebElement fuelnextbtn;
	
	@FindBy(xpath="//*[@id='variantScroll']/li[2]/span/b")
	public
	static WebElement variant;
	
	@FindBy(xpath="//*[@id='dvVariant']/h3/span[1]")
	public
	static WebElement variantbackbtn;
	
	@FindBy(xpath="//*[@id='dvVariant']/h3/span[3]")
	public
	static WebElement variantnextbtn;
	
	@FindBy(xpath="//*[@id='dvRegYear']/h3/span[1]")
	public
	static WebElement regyearbackbtn;
	
	
	public CarMake_DetailsPage(){
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	public void makedetails(){
		
		try{
			 others.click();
			 Thread.sleep(2000);
			 make.clear();
			 make.sendKeys("Maruti");
			 Thread.sleep(2000);
			 selectmake.click();
			 Thread.sleep(2000);
			 fuelbackbtn.click();
			 Thread.sleep(3500);
			 modelbackbtn.click();
			 Thread.sleep(2000);
			 topmake.click();
			 Thread.sleep(2000);
			 modelbackbtn.click();
			 Thread.sleep(3500);
			 makenextbtn.click();
			 Thread.sleep(2000);
			 others.click();
			 Thread.sleep(2000);
			 model.sendKeys("Alto");
			 Thread.sleep(2000);
			 selectmake.click();
			 Thread.sleep(2000);
			 fuelbackbtn.click();
			 Thread.sleep(2000);
			 topmodel.click();
			 Thread.sleep(2000);
			 fuelbackbtn.click();
			 Thread.sleep(2000);
			 modelnextbtn.click();
			 Thread.sleep(2000);
			 fueltype.click();
			 Thread.sleep(2000);
			 variantbackbtn.click();
			 Thread.sleep(2000);
			 modelnextbtn.click();
			 System.out.println("model next button click");
			 Thread.sleep(4000);
			 fuelnextbtn.click();
			 System.out.println("fuel next button click");
			 Thread.sleep(4000);
			 System.out.println("select variant");
			 variant.click();
			 Thread.sleep(2000);
			 regyearbackbtn.click();
			 Thread.sleep(2000);
			 fuelnextbtn.click();
			 Thread.sleep(2000);
			 variantnextbtn.click();
			 Thread.sleep(2000);
			 
			 
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	

}

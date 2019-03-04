package com.fw.qa.pages_tw;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.fw.qa.baseclass.TestBase;

public class Proposal_DetailsPage extends TestBase{

	
	@FindBy(xpath="//*[@id='personalInfoForm']/ul/li[1]/div/div[2]/div/input")
	public
	static WebElement ownername;
	
	@FindBy(xpath="//*[@id='personalInfoForm']/ul/li[2]/div[2]/div/div[1]/input")
	public
	static WebElement mobileno;
		
	
	@FindBy(xpath="//*[@id='personalInfoForm']/ul/li[3]/div[2]/div/div[1]/input")
	public
	static WebElement email;
	
	@FindBy(xpath="//*[@id='commAddress']")
	public
	static WebElement address;
	
	@FindBy(xpath="//*[@id='app']/div/div[2]/div[1]/div/div[2]/div[2]/div[3]/div[1]/div[1]/button/span")
	public
	static WebElement continuestep2;
	
	@FindBy(xpath="//*[@id='app']/div/div[2]/div[1]/div/div[2]/div[2]/div[3]/h1/a")
	public
	static WebElement previousbtn1;
	
	@FindBy(xpath="//*[@id='app']/div/div[1]/div/div[1]/div/a[1]")
	public
	static WebElement backbtn1;
	
	@FindBy(xpath="//*[@id='personalInfoForm']/ul/li[4]/div[3]/div[2]/div/input")
	public
	static WebElement pincode;
	
	@FindBy(linkText="Premium Breakup")
	public
	static WebElement premiumbreakup;
	
	@FindBy(xpath="//*[@id='app']/div/div[2]/div[1]/div/div[2]/div[2]/div[1]/div[1]/div[2]/div/a")
	public
	static WebElement popupclose;
	

	@FindBy(xpath="//*[@id='app']/div/div[2]/div[1]/div/div[2]/div[2]/div[3]/form/ul/li[2]/div/div/input")
	public
	static WebElement nominee;
	
	@FindBy(xpath="//*[@id='app']/div/div[2]/div[1]/div/div[2]/div[2]/div[3]/form/ul/li[3]/div[2]/div[1]/div/div/div[1]")
	public
	static WebElement nomineerelation;
	
	@FindBy(xpath="//*[@id='app']/div/div[2]/div[1]/div/div[2]/div[2]/div[3]/form/ul/li[4]/div[2]/div[1]/div/div/div[1]")
	public
	static WebElement nomineeage;
	
	@FindBy(xpath="//*[@id='app']/div/div[2]/div[1]/div/div[2]/div[2]/div[3]/form/ul/li[5]/div[2]/ul/li[2]/input")
	public
	static WebElement financed;
	
	@FindBy(xpath="//*[@id='app']/div/div[2]/div[1]/div/div[2]/div[2]/div[3]/div[1]/div[1]/button/span")
	public
	static WebElement continuestep3;
	
	
	public Proposal_DetailsPage(){
		
		PageFactory.initElements(driver, this);
		
	}
	
	public static void selectnomineedetails(){
		try{
		
		Thread.sleep(2500);
		nominee.clear();
		nominee.sendKeys("testspouse");
		Thread.sleep(2000);
		nomineerelation.click();
		Thread.sleep(3000);
		WebElement r = driver.findElement(By.xpath("//*[@id='app']/div/div[2]/div[1]/div/div[2]/div[2]/div[3]/form/ul/li[3]/div[2]/div[1]/div/div[2]/div/div[2]"));
		System.out.println(driver.findElement(By.xpath("//*[@name='nomineeRelation']/div/input")).getAttribute("value"));
		
		System.out.println("sending value");
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		System.out.println(driver.findElement(By.xpath("//*[@name='nomineeRelation']/div/input")).getAttribute("value"));
		Thread.sleep(1500);
		jse.executeScript("arguments[0].click();", r);
		System.out.println(driver.findElement(By.xpath("//*[@name='nomineeRelation']/div/input")).getAttribute("value"));
		
		nomineeage.click();
		Thread.sleep(2500);
		WebElement age = driver.findElement(By.xpath("//*[@id='app']/div/div[2]/div[1]/div/div[2]/div[2]/div[3]/form/ul/li[4]/div[2]/div[1]/div/div[2]/div/div[28]"));
		
		JavascriptExecutor jse2 = (JavascriptExecutor)driver;
		
		System.out.println(driver.findElement(By.xpath("//*[@name='nomineeAge']/div/input")).getAttribute("value"));
		Thread.sleep(1500);
		jse2.executeScript("arguments[0].click();", age);
		System.out.println(driver.findElement(By.xpath("//*[@name='nomineeAge']/div/input")).getAttribute("value"));
		
		
		//financed.click();
		
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	

}

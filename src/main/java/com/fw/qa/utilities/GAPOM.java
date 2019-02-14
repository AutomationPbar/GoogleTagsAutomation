package com.fw.qa.utilities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GAPOM {

	public static WebElement googleUsername(WebDriver d) {

		WebElement we = d.findElement(By.xpath(".//*[@name='identifier']"));
		return we;

	}

	public static WebElement googleNextButton(WebDriver d) {

		WebElement we = d.findElement(By.xpath(".//*[@id='identifierNext']/content"));
		return we;

	}

	public static WebElement googlePassword(WebDriver d) {

		WebElement we = d.findElement(By.xpath(".//*[@name='password']"));
		return we;

	}

	public static WebElement googleNextButton2(WebDriver d) {

		WebElement we = d.findElement(By.xpath(".//*[@id='passwordNext']/content"));
		return we;

	}

	public static List<WebElement> listElementCount(WebDriver d) {

		List<WebElement> we = d.findElements(By.xpath("//*[@id='gaw-2']/div"));
		return we;

	}

	public static WebElement listElementName(WebDriver d, int row) {

		WebElement we = d.findElement(By.xpath("//*[@id='gaw-2']/div[" + row + "]/div"));
		return we;

	}

	public static WebElement totalEvents(WebDriver d, int row) {

		WebElement we = d.findElement(By.xpath(".//*[@id='ID-rowTable']/tbody/tr[" + row + "]/td[4]/div"));
		return we;

	}

	public static WebElement uniqueEvents(WebDriver d, int row) {

		WebElement we = d.findElement(By.xpath(".//*[@id='ID-rowTable']/tbody/tr[" + row + "]/td[5]/div"));
		return we;

	}

	public static WebElement eventValue(WebDriver d, int row) {

		WebElement we = d.findElement(By.xpath(".//*[@id='ID-rowTable']/tbody/tr[" + row + "]/td[6]/div"));
		return we;

	}

	public static WebElement avgValue(WebDriver d, int row) {

		WebElement we = d.findElement(By.xpath(".//*[@id='ID-rowTable']/tbody/tr[" + row + "]/td[7]/div"));
		return we;

	}

	public static WebElement exportButton(WebDriver d) {

		WebElement we = d.findElement(By.xpath(".//*[@id='ID-reportHeader-reportToolbar']/div[1]/div[2]/span[2]"));
		return we;

	}

	public static WebElement exportToExcelButton(WebDriver d) {

		WebElement we = d
				.findElement(By.xpath("//*[@id='ID-reportHeader-reportToolbar-exportControl']/div/ul/li[3]/span[2]"));
		return we;

	}

}

package com.agilecrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.agileCrmAutomation.BaseClass;

public class DealsPage extends BaseClass {
	public void changeDealsStatus(String srcStatus, String dstStatus) throws Exception {
	// Wait UntilElementToBeClickable
	waitElementToBeClickable(By.xpath("//ul[@milestone='"+srcStatus+"']/li[1]"));
	//locate sourc element
	WebElement srcElement = driver.findElement(By.xpath("//ul[@milestone='"+srcStatus+"']/li[1]"));
	//get the name of secure deels
	String dealsName = driver.findElement(By.xpath("//ul[@milestone='"+srcStatus+"']/li[1]/descendant::a[1]")).getText();
	//locat destination element
	WebElement dstElement = driver.findElement(By.xpath("//ul[@milestone='"+dstStatus+"']/li[1]"));
	
	Actions action = new Actions(driver);
	//Perform drag and droup between source and destination elemet 
	action.dragAndDrop(srcElement, dstElement).build().perform();
	System.out.println("Change the status of " + dealsName + "From " +srcStatus+ "to" + dstStatus);
	
	//get the name of dst deal
	WebElement dstDealName = driver.findElement(By.xpath("//ul[@milestone='" + dstStatus +"']/li[1]/descendant::a[1]"));
	verifyDealsStatus(dstStatus, dstDealName);
	}
	 public void verifyDealsStatus(String expectedStatus, WebElement element) throws Exception {
		 //wait until dst element to be clickable
		 waitElementToBeClickable(element);
		 element.click();
		 String actualStatsus = driver.findElement(By.xpath("//div[@class='panel-body']/descendant::span[2]")).getText();
		 if (actualStatsus.equals(actualStatsus));
		 { 
		System.out.println("Successfull drag and droup operation");
	 } 
		 //else {
		 throw new Exception("drag and droup did work from source element");
	 }
			

}

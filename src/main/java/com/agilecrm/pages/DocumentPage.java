package com.agilecrm.pages;

import org.openqa.selenium.By;

import com.agileCrmAutomation.BaseClass;

public class DocumentPage  extends BaseClass {
	  
	  public void addDocument() {
		  click(By.id("documentsmenu"), "click on document menu");
		 // driver.findElement(By.id("//i[@class='fa fa-plus-circle]")).click();
		 //waitElementToBeClickable(By.xpath("documentsmenu"));
		  click(By.xpath("//i[@class='material-icons add v-sub']"), "click on add documents");
		  click(By.xpath("//*[@id=\"docmsg\"]/i"), "click on update documents");
		//  waitElementToBeClickable(By.xpath("//input[@placeholder=\\\"Document Name\\\"]"));
		  driver.findElement(By.xpath("//input[@placeholder=\"Document Name\"]")).sendKeys("Adhar");
		  click(By.xpath("//i[@class=\"icon-desktop icon-2x\"]"), "Click on choose document");
		  
		  
		  
	  }
	} 



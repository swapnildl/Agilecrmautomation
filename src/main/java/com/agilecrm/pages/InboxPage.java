package com.agilecrm.pages;

import org.openqa.selenium.By;

import com.agileCrmAutomation.BaseClass;

public class InboxPage extends BaseClass{
	
	public void composeMail() {
		click(By.id("inboxmenu"), "click on inbox menu");
	
		//click(By.xpath("//div[@class=\"wrapper b-b bg\"]/a"), "Click ");
		waitElementToBeClickable(By.xpath("//a[@class=\"btn btn-sm btn-danger w-xs font-bold btn-lg-imp mail-compose]"));
		click(By.xpath("//a[@class=\"btn btn-sm btn-danger w-xs font-bold btn-lg-imp mail-compose]"), "Click on");
	}

}

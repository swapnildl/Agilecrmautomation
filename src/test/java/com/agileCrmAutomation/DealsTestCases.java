package com.agileCrmAutomation;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.agilecrm.pages.DealsPage;
import com.agilecrm.pages.LoginPage;

public class DealsTestCases extends BaseClass {
	@Test
	public void main() throws Exception {
		launchBrowser("Chrome");
		driver.navigate().to("https://mtesting.agilecrm.com");
		LoginPage loginpage=new LoginPage();
		loginpage.login("coding@yopmail.com", "Qqqq1234");
		click(By.id("dealsmenu"), "Click on deals menu");
		DealsPage dealspage=new DealsPage();
		dealspage.changeDealsStatus("New", "Praposal");
	}

}

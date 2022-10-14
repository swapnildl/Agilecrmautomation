package com.agileCrmAutomation;

import org.testng.annotations.Test;

import com.agilecrm.pages.InboxPage;
import com.agilecrm.pages.LoginPage;

public class InboxTestCase extends BaseClass {
@Test
	public  void main() {
		launchBrowser("chrome");
		  driver.navigate().to("https://mtesting.agilecrm.com");
		  LoginPage Loginpage = new LoginPage();
		  Loginpage.login("Atesting@yopmail.com","eye1234");
		  InboxPage ip=new InboxPage();
		  ip.composeMail();
		  
		  
		  

	}

}

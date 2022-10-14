package com.agileCrmAutomation;

import org.testng.annotations.Test;

import com.agilecrm.pages.DocumentPage;
import com.agilecrm.pages.LoginPage;

public class DocumentTestCases extends BaseClass {
  @Test
  public void Document() {
	  launchBrowser("chrome");
	  driver.navigate().to("https://mtesting.agilecrm.com");
	  LoginPage Loginpage = new LoginPage();
	  Loginpage.login("Atesting@yopmail.com","eye1234");
	  DocumentPage dc=new DocumentPage();
	  dc.addDocument();
	 
  }
}

package com.agileCrmAutomation;

import org.testng.annotations.Test;

import com.agilecrm.pages.LoginPage;

public class LogintestCases extends BaseClass {
@Test
	public void main() {
		launchBrowser("chrome");
		driver.navigate().to("https://mtesting.agilecrm.com");
		LoginPage login = new LoginPage();
		//invalid username and invalid password
		login.login("abcdef", "123456");
		LoginPage.validmsg();
		//invalid usename valid password
		login.login("swapnil", "Qqqq1234");
		LoginPage.validmsg();

	//valid username and invalid password
		login.login("coding@yopmail.com", "123456");
		LoginPage.validmsg();
	   
	
	//blank username and valid password
		login.login("", "Qqqq1234");
		LoginPage.validmsg();
	
	//blank username and invalid password
		login.login(" ", "Qqqq1234567");
		LoginPage.validmsg();
	
	//valid username and blank password
		login.login("coding@yopmail.com", " ");
		LoginPage.validmsg();
		
	//invalid username and blank password
		login.login("abcdegfjl", " ");
		LoginPage.validmsg();
	
	//blank username and blank password
		login.login(" ", " ");
		LoginPage.validmsg();
	
	//valid username and valid password
		login.login("Atesting@yopmail.com", "eye1234");
		LoginPage.validmsg();
		
		LoginPage.logout();
		System.out.println("Logout Successful");
}
}

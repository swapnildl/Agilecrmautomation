package com.agileCrmAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.agilecrm.pages.ContactPage;
import com.agilecrm.pages.LoginPage;

public class LoginAgileCRMTestCase extends BaseClass {	
	@Test
	public void main() throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver", "D:\\softwaretesting\\chromedriver_win32\\chromedriver.exe");
	//WebDriver driver=new ChromeDriver();
		
		LoginAgileCRMTestCase login=new LoginAgileCRMTestCase();
		login.launchBrowser("Chrome");
		driver.navigate().to("https://mtesting.agilecrm.com");
		LoginPage Loginpage=new LoginPage();
		Loginpage.login("coding@yopmail.com", "Qqqq1234");
		ContactPage contact=new ContactPage();
		contact.addContact();
		
	/*	//click on contact menu
		driver.findElement(By.id("contactsmenu")).click();
		WebElement deleteButton=driver.findElement(By.xpath("//button[text()='Delete']"));
		//locate delete button
		if(deleteButton.isEnabled())
		{deleteButton.click(); // if it is eneable then click on delete button
		}else {
			//locate all chake box
			WebElement selectAllChackBox=driver.findElement(By.id("contacts-list-view-checkbox"));
			selectAllChackBox.click();
					}
		*/
		
		
		
		
		
		//WebElement username=driver.findElement(By.name("email"));
		//username.sendKeys("cst6@yopmail.com");
		//WebElement password=driver.findElement(By.name("password"));
		//password.sendKeys("Test1234");
		//WebElement signIn=driver.findElement(By.xpath("//input[@type='submit']"));
		//signIn.click();
		
	}

}

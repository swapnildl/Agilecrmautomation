package com.agileCrmAutomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.agilecrm.pages.ContactPage;
import com.agilecrm.pages.LoginPage;

public class contactTest extends BaseClass {
	@Test
	public void main() throws InterruptedException {
		launchBrowser("chrome");
		driver.navigate().to("https://mtesting.agilecrm.com");
		LoginPage Loginpage = new LoginPage();
		Loginpage.login("coding@yopmail.com", "Qqqq1234");
		driver.findElement(By.xpath("//i[@class='material-icons people']")).click();
		//ContactPage con =new ContactPage();
		//con.addContact();
		//con.searchContact();
		//con.updateContact();
		//con.deleteContact();
		/*driver.findElement(By.xpath("//span[@class='thumb-small avatar pull-right m-t-n-sm']")).click();
		driver.findElement(By.xpath("//a[contains(@class,'logout-in']")).click();
		System.out.println("Logout ");
		driver.close();*/
		
		
		
	//	launchBrowser("chrome");
	//	driver.navigate().to("https://mtesting.agilecrm.com");
		//driver.findElement(By.xpath("//li[@id='contactsmenu']")).click();
		//List<WebElement> contactNames= driver.findElements(By.xpath("//*[@id=\"contacts-list-view\"]/div/div/div"));
		//List<WebElement> applianccesPrice= driver.findElements(By.xpath("//div[@class='sg-row']/descendant::a[@target='_blank']/span[@class='a-price']"));
	//	for (int i = 0; i<contactNames.size();i++) {
	//		String name = contactNames.get(i).getText();
			//String price =  applianccesPrice.get(i).getText();
		//	System.out.println(name);
		
		
		
		
		
		
		
		
		
		
	}

}

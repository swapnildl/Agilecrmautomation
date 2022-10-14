package com.agileCrmAutomation;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v102.network.model.SecurityIsolationStatus;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class AmazonApplianceserch extends BaseClass {
	@Test
	public void main() throws AWTException {
/*	launchBrowser("chrome");
	driver.navigate().to("https://www.amazon.in/");
	WebElement customerService = driver.findElement(By.xpath("//div[@id='nav-xshop']/a[5]"));
	Actions action =new Actions(driver);	
	//riht click on customer service link
	action.contextClick(customerService).build().perform();
	//Select Firest option i right click pannel
	Robot rb= new Robot();
	rb.keyPress(KeyEvent.VK_DOWN);
	rb.keyRelease(KeyEvent.VK_DOWN);
	rb.keyPress(KeyEvent.VK_ENTER);	
	rb.keyRelease(KeyEvent.VK_ENTER);	
	
	//get parent window id
	String parentWindowId =driver.getWindowHandle();
	System.out.println("Parent Window Id:" + parentWindowId );
	// get allwindow ids 
	Set<String> allWindowIds = driver.getWindowHandles();
	// iterate of all windows
	for (String windowId : allWindowIds) {
		// if window id is not presrnt then go inside if condition
		if (!windowId.equals(parentWindowId)) {
			System.out.println("Child Window id:" +windowId);
			//switch to another window
			driver.switchTo().window(windowId);
			//print the titel of the page
			System.out.println(driver.getTitle());
			
			
		}
	}*/
	
	
	
	
	
	
	
	
	
		launchBrowser("chrome");
		driver.navigate().to("https://www.amazon.in/");
		selectDroupDownValByText(driver.findElement(By.id("searchDropdownBox")),"Appliances");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Washing Machine");
		click(By.id("nav-search-submit-button"), "click on search button");
		List<WebElement> applianccesNames= driver.findElements(By.xpath("//div[@class='sg-row']/descendant::h2/a/span"));
		List<WebElement> applianccesPrice= driver.findElements(By.xpath("//div[@class='sg-row']/descendant::a[@target='_blank']/span[@class='a-price']"));
		for (int i = 0; i<applianccesNames.size();i++) {
			String name = applianccesNames.get(i).getText();
			String price =  applianccesPrice.get(i).getText();
			System.out.println(name + " : " + price);
		/*launchBrowser("chrome");
		driver.navigate().to("https://www.amazon.in/");
		selectDroupDownValByText(driver.findElement(By.id("searchDropdownBox")),"Electronics");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Laptops");
		click(By.id("nav-search-submit-button"), "click on search button");
		List<WebElement> ElectronicsNames= driver.findElements(By.xpath("//div[@class='sg-row']/descendant::h2/a/span"));
		waitElementToBeClickable(By.xpath("//div[@class='sg-row']/descendant::h2/a/span"));
		List<WebElement> ElectronicsPrice= driver.findElements(By.xpath("//div[@class='sg-row']/descendant::a[@target='_blank']/span[@class='a-price']"));
		for (int i = 0; i<ElectronicsNames.size();i++) {
			String name = ElectronicsNames.get(i).getText();
			String price =  ElectronicsPrice.get(i).getText();
			System.out.println(name + " : " + price);*/
		
		
		
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}
		

	}}

//}

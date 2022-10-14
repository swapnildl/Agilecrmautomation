package com.agileCrmAutomation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class AlertExamples extends BaseClass {
@Test
	public void main() {
		launchBrowser("Chrome");    //information alert
		driver.get("https://www.amazon.in");
		JavascriptExecutor  js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,700)");
		js.executeScript("window.scrollBy(0,-700)");
		/*js.executeScript("alart('This is  sampal alert');");
		Alert alart=driver.switchTo().alert();
		alart.accept();*/

		js.executeScript("confirm('This is  sampal alert');");
		Alert confirm=driver.switchTo().alert();
		confirm.accept();
		
		js.executeScript("prompt('This is  sampal alert');");
		Alert prompt=driver.switchTo().alert();
		prompt.accept();
		//Information , confirm , prompt all popup massage displyed
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

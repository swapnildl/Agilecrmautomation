package com.agilecrm.pages;

import org.openqa.selenium.By;
import com.agileCrmAutomation.BaseClass;

public class ContactPage extends BaseClass {
	String firstName;
	String lastName;
	String emailId;
	String mobNom;

	public void addContact() throws InterruptedException {
		firstName = "abc";
		lastName = "xyz";
		emailId = "test@ac.com";
		mobNom = "654654654";
		click(By.id("contactsmenu"), "click on contact menu");
		click(By.xpath("//*[@id=\"view-list\"]/div/button"), "click on add contact");
		waitElementToBeClickable(By.id("fname"));
		driver.findElement(By.xpath("//*[@id=\"fname\"]")).sendKeys("guj");
		driver.findElement(By.xpath("//*[@id=\"person_validate\"]")).click();

	}

	public void searchContact() {
	driver.findElement(By.xpath("//button[contains(@class,'search material-icons')]")).click();
	waitElementToBeClickable(By.xpath("//button[contains(@class,'search material-icons')]"));
	driver.findElement(By.xpath("//input[@name='all']/following-sibling::i")).click();
	driver.findElement(By.xpath("//input[@name='person']/following-sibling::i")).click();
	fluentWait(By.xpath("//input[@id=\"searchText\"]"));
	driver.findElement(By.xpath("//input[@id=\"searchText\"]")).sendKeys("Gunjan");
	driver.findElement(By.id("//button[@id='search-results']")).click();
	System.out.println("Contact search Succesfully");
	}

	public void deleteContact() // throws InterruptedException
	{//waitElementToBeClickable(By.xpath("//tbody[@id=\"contacts-list-view-model-list\"]/tr[1]/td[1]/label/i"));
	driver.findElement(By.xpath("//tbody[@id=\"contacts-list-view-model-list\"]/tr[1]/td[1]/label/i")).click();
	waitElementToBeClickable(By.xpath("//button[text()='Delete']"));
	driver.findElement(By.xpath("//button[text()='Delete']")).click();
	System.out.println("click on Button");
	driver.findElement(By.id("success-callback")).click();
	waitElementToBeClickable(By.id("success-collback"));
	}

	public void updateContact() {
		//driver.findElement(By.id("contactsmenu")).click();
		//waitElementToBeClickable(By.id("contact-td-more dropdown-toggle"));
		//driver.findElement(By.id("contact-td-more dropdown-toggle")).click();
		driver.findElement(By.xpath("//*[@id=contacts-list-view-model-list\"]/tr[1]"));
		
	
	
	
	
	
	}

}

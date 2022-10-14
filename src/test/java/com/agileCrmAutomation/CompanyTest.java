package com.agileCrmAutomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.agilecrm.pages.CompanyPage;
import com.agilecrm.pages.LoginPage;
import org.openqa.selenium.WebElement;

public class CompanyTest extends BaseClass {
	@Test
	public void main() throws InterruptedException {
		CompanyTest company = new CompanyTest();
		company.launchBrowser("Chrome");
		driver.navigate().to("https://mtesting.agilecrm.com");
		LoginPage Loginpage = new LoginPage();
		Loginpage.login("coding@yopmail.com", "Qqqq1234");
		click(By.id("companiesmenu"), "Click on Company");
	//	CompanyPage companyPage=new CompanyPage();
	//	companyPage.addCompany();
		
		
		
		
		click(By.xpath("//button[contains(text(),'Add Company')]"), "click on add company buttonn");
		waitElementToBeClickable(By.id("company_name"));
		driver.findElement(By.id("company_name")).sendKeys("togo2");
		driver.findElement(By.xpath("//a[@id='continue-company']")).click();
		//Thread.sleep(5000);
		fluentWait(By.name("email-select"));
		Select select = new Select(driver.findElement(By.name("email-select")));
		List<WebElement> emailDropDownList = select.getOptions();
		for (WebElement element : emailDropDownList) {
			String text = element.getAttribute("value");
			System.out.println(text);
		Select select1 = new Select(driver.findElement(By.name("country")));
		List<WebElement> countrylDropDownList = select1.getOptions();
			for (WebElement element1 : countrylDropDownList) {
				String text1 = element1.getText();
				System.out.println(text1);
		  }
		}
	  }
	}
	



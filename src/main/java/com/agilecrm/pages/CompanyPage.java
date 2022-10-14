package com.agilecrm.pages;





import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.agileCrmAutomation.BaseClass;

public class CompanyPage extends BaseClass {
	By addCompanyButton = By.xpath("//button[contains (text(),'Add Company)]");
	By compnayName =By.id("company_name");
	By saveComapny = By.id("Company_validate");
	
	@FindBy(xpath="//button[text()='Delete']")
	public WebElement deleteButton;
	
	@FindBy(xpath="//span[@id='companies-list-view-checkbox']//input")
	public WebElement selectAllCheckbox;
	
	@FindBy(xpath="//span[@id='companies-list-view-checkbox']//input")
	public List<WebElement> AllCheckbox;
	
	public CompanyPage() {
		//initializing the factory elements of current page
		PageFactory.initElements(driver,this);
	}
	
	
	
	public void addCompany() {
		WebElement addCompanyButton=driver.findElement(By.xpath("//button[contains (text(),'Add Company)]"));
		Actions action =new Actions(driver);
		action.click(addCompanyButton).build().perform();
	}	
		//public void updateCompany() {
		//WebElement addCompanyButton=driver.findElement(By
			
			public void deleteCompany() {
				selectAllCheckbox.click();
				deleteButton.click();
			}
		}
		
	//}
	


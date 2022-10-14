package com.agilecrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.agileCrmAutomation.BaseClass;

public class LoginPage extends BaseClass {
	public void login(String username,String password)
		{
		WebElement uname=driver.findElement(By.name("email"));
		uname.clear();
		uname.sendKeys(username);
		WebElement pwd=driver.findElement(By.name("password"));
        pwd.clear();
		pwd.sendKeys(password);
		WebElement signIn=driver.findElement(By.xpath("//input[@type='submit']"));
		signIn.click();
		
		//if(driver.findElement(By.xpath("a[@class='close']/parent::*")).isDisplayed())
		//{System.out.println("Invalid username: "+ username+ "or password:"+ password);
	}//else
	//{
// driver.findElement(By.xpath("//*@id=\"fat-menu\"]/a/span/img")).click();
 //driver.findElement(By.xpath("//*[@id=\"fatMenuModel\"]/div[2]/div/div/div/div[3]/div/a")).click();
	public static void validmsg()
	{ try
	{ if (driver.findElement(By.xpath("//*[@id=\"agile\"]/div[1]/div[2]/input")).isDisplayed())
	{
		String errormessage=driver.findElement(By.xpath("//*[@id=\"agile\"]/div[1]/div[2]/input")).getText();
		System.out.println("Login failed");
	}
	}
	catch(Exception e)
	{
		System.out.println("Login successful");
	}
		}
		

public static  void logout()
{
   driver.findElement(By.xpath("//*[@id=\"fat-menu\"]/a/span/img")).click();
   driver.findElement(By.xpath("//*[@id=\"fatMenuModal\"]/div[2]/div/div/div/div[3]/div/a")).click();
}
}
	
	

	//}//}

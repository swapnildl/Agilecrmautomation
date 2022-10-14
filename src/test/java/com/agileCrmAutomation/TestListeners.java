package com.agileCrmAutomation;


import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class TestListeners extends BaseClass implements ITestListener, ISuiteListener {
	ExtentReports extentReport;
	ExtentSparkReporter sparkReport;
	
	//Onstart method of IsuiteListner Interfase
	public void onStart(ISuite suite) {
		LocalDateTime dateTime=LocalDateTime.now();//return the current date and time(long)
		//format the date time in
		String timeStamp=dateTime.format(DateTimeFormatter.ofPattern("dd_mm_yyyy_hh_mm"));
		String folderName="Report_"+timeStamp;
		System.out.println(folderName);
		
		String reportPath=System.getProperty("user.dir")+"//ExecutionResult//"+folderName;
		//creat file path instance to take  control of folder path
		File file=new File(reportPath);
		//chake if the folder exist; if not present then creat new
		if(!file.exists()) {
			file.mkdir();//creat new file or folder at the desired path
		}
		setExtentReportDetails();
	}
		
		
		public void setExtentReportDetails() {
			
		String reportPath=System.getProperty("user.dir")+"//ExecutionResult//Report//AutomationReport.html";
		sparkReport=new ExtentSparkReporter(reportPath);
		sparkReport.config().setDocumentTitle("AgileCrmAutomationReport");
		sparkReport.config().setReportName("Automation Report");
		// to add information into the html report, we need to create ExtentReports class instance
		extentReport=new ExtentReports();
		extentReport.attachReporter(sparkReport);
		extentReport.setSystemInfo("username", "cyber success");
		extentReport.setSystemInfo("environment", "test");
		extentReport.setSystemInfo("browser", "chrome");
		System.out.println("This is onStart method");
	}
	//Onfinish methode of ISuiteListenenr Interface
	public void onFinish(ISuite suite) {
		System.out.println("This is onFinish method of suite");
		driver.quit();
		extentReport.flush();
	}
	public void onStart(ITestContext context) {
		System.out.println("This is on start method of test");
	}
	public void onFinish(ITestContext context) {
		System.out.println("This is onfinish method of test");
	}
	public void onTestStart(ITestResult result) {
		String methodName=result.getMethod().getMethodName();
		String methodName1=result.getName();
		logger=extentReport.createTest(methodName1);
		System.out.println("This is on TestStart method");
	}
	public void onTestSuccess(ITestResult result) {
		//add success information into extent report using logger variable 
				logger.pass("Successfully executed the test:"+result.getName());
				System.out.println("This is onTestSuccess method");
				
	}
	public void onTestfailure(ITestResult result) {
	System.out.println("This is on Testfailure");
	
	TakesScreenshot takeSc=(TakesScreenshot)driver;
	File screenShotfile=takeSc.getScreenshotAs(OutputType.FILE);
	
	String FileName=result.getName();
	
	String outputPath=System.getProperty("user.dri")+"//ExecutionResut//Screenshot//"+FileName+".png";
	
	File outputFile=new File(outputPath);
	
	try {
		FileUtils.copyFile(screenShotfile, outputFile);
	} catch (IOException e) {
	e.printStackTrace();
	}
	
	}
	public void onTestSkipped(ITestResult result) {
		logger.skip("The test is skipped due to the :" + result.getSkipCausedBy());
		System.out.println("This is onTestSkipped method");
	}
	public void onTestFailedWithTimeout(ITestResult result) {
		System.out.println("This is onTestFaileWithTimeout method");
		onTestFailure(result);
	}
}


package com.OrangeHRM.Utilities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;



public class ExtentMansgerCls {

	public static ExtentReports extent;
	public static ExtentTest test;
	public static ExtentSparkReporter spark;
	public static WebDriver driver;
	
	public void startReport() {
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH-mm-ss");
		LocalDateTime now = LocalDateTime.now();
		String date = dtf.format(now).toString();
		System.out.println("Curr Date "+ date);
		
		extent = new ExtentReports();
		spark = new ExtentSparkReporter("./Reports/report"+date+".html");
		spark.config().setTheme(Theme.DARK);
		spark.config().setDocumentTitle("Suneratech Summary Report");
		extent.attachReporter(spark);
	}
	
	public void endExtent() {
		System.out.println("Flush Report");
		extent.flush();
	}
	
	public void createTest(String scenarioname) {
		test = extent.createTest(scenarioname).assignAuthor("Sateesh Janapana").assignCategory("Mobile Testing");
	}
	
	public void addlogs(String log) {
		
		test.info(log);
	}
	
	public void addErrorLog(Throwable throwable, String screenshot) {
		test.fail(throwable);
		System.out.println("Taking failed screenshot");
		test.addScreenCaptureFromBase64String(screenshot);
	}
	
	public void addScreenshotForStep(WebDriver driver, String msg) {

	}
	
	public void statusOnPass(String message) {
		//log(Status.INFO, "Test passed"); 
		//test.log(Status.INFO, message);
		test.pass(message);
	}
}

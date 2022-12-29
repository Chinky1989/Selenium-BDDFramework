package com.cucumberFramework.helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Waits {

	org.apache.log4j.Logger logger = Logger.getLogger(Waits.class);
	
	private WebDriver driver;
	
	public Waits(WebDriver driver){
		this.driver = driver;
	}
	
	public void WaitForElement(WebElement element,long timeOutInSeconds){
		logger.info("waiting for element visibilityOf..");
		WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
		wait.until(ExpectedConditions.visibilityOf(element));
		logger.info("element is visible..");
	}
	
}

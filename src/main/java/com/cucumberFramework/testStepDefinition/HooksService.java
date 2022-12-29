package com.cucumberFramework.testStepDefinition;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;

import com.cucumberFramework.enums.Browsers;
import com.cucumberFramework.helper.Logger;
import com.cucumberFramework.testSetup.BrowserOSSetup;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;


public class HooksService {

	BrowserOSSetup testBase;

	org.apache.log4j.Logger log = Logger.getLogger(HooksService.class);

	@Before
	public void initializeTest() {
		testBase = new BrowserOSSetup();
		testBase.selectBrowser(Browsers.CHROME.name());
	}

	@After
	public void endTest(Scenario scenario) {
		if (scenario.isFailed()) {

			try {
				log.info(scenario.getName() + " is Failed");
				final byte[] screenshot = ((TakesScreenshot) BrowserOSSetup.driver).getScreenshotAs(OutputType.BYTES);
				scenario.embed(screenshot, "image/png"); // ... and embed it in
			} catch (WebDriverException e) {
				e.printStackTrace();
			}

		} else {
			try {
				log.info(scenario.getName() + " is pass");
				scenario.embed(((TakesScreenshot) BrowserOSSetup.driver).getScreenshotAs(OutputType.BYTES), "image/png");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		BrowserOSSetup.driver.quit();
	}
}

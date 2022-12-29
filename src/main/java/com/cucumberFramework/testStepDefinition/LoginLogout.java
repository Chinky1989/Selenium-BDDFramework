package com.cucumberFramework.testStepDefinition;

import com.cucumberFramework.helper.Waits;
import com.cucumberFramework.testSetup.BrowserOSSetup;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class LoginLogout extends BrowserOSSetup {

	com.cucumberFramework.testPageObject.LoginLogout loginPage = new com.cucumberFramework.testPageObject.LoginLogout(driver);
	Waits waitHelper = new Waits(driver);
	
	@Given("^I am on the Login page URL \"([^\"]*)\"$")
	public void setLoginPage(String arg1) throws Throwable {
		driver.get(arg1);
	}

	@Then("^I should see Sign In Page$")
	public void verifySignInPage() throws Throwable {
		loginPage.userName.isDisplayed();
	}

	@When("^I enter username as \"([^\"]*)\"$")
	public void enterUserName(String username){
		loginPage.enterUserName(username);
	}

	@When("^I enter password as \"([^\"]*)\"$")
	public void enterPassword(String password) {
		loginPage.enterPassword(password);
	}

	@When("^click on login button$")
	public void clickLoginButton() {
		loginPage.clickLoginButton();
		waitHelper.WaitForElement(loginPage.logoutBtn, 60);
	}
	
	@When("^I am logged in$")
	public void verifyLoggedIn(){
	    loginPage.logoutBtn.isDisplayed();
	}

	@When("^I Click on Sign out$")
	public void clickSignOut(){
		waitHelper.WaitForElement(loginPage.logoutBtn, 60);
	    loginPage.clickLogoutButton();
	    waitHelper.WaitForElement(loginPage.userName, 60);
	}

	@Then("^I got log out from the application and land on sign in page$")
	public void verifyApplicationLandOnSignInPage(){
		loginPage.userName.isDisplayed();
	}

}
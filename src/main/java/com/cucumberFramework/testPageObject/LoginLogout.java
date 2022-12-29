package com.cucumberFramework.testPageObject;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.cucumberFramework.helper.Waits;

public class LoginLogout {
	
	private WebDriver driver;
	
	@FindBy(xpath="//input[@name='uid']")
	public WebElement userName;

	@FindBy(xpath="//input[@type='password']")
	public WebElement password;
	
	@FindBy(xpath="//input[@name='btnLogin']")
	WebElement loginButton;
	
	@FindBy(xpath="//a[contains(text(),'Log out')]")
	public WebElement logoutBtn;
	
	
	Waits waitHelper;
	
	public LoginLogout(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waitHelper = new Waits(driver);
	}
	
	public void enterUserName(String userName){
		this.userName.sendKeys(userName);
	}
	
	public void enterPassword(String password){
		this.password.sendKeys(password);
	}
	
	public void clickLoginButton(){
		loginButton.click();
	}

	public void clickLogoutButton(){
		JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("arguments[0].click();", logoutBtn);
		 driver.switchTo().alert().accept();
	}
}

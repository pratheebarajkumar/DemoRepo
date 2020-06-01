package com.crm.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.base.TestBase;

public class LoginPage extends TestBase{

	
	
	

	@FindBy(name="")
	WebElement username;
	
	@FindBy(name="")
	WebElement password;
	
	@FindBy(xpath="")
	WebElement loginBtn;
	
	public LoginPage() throws IOException {
		
		PageFactory.initElements(driver, this);
	}
	
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}
	public boolean validateCRMImage() {
		crmlogo.isDisplayed();
	}
	
	public HomePAge login(String un,String pwd) {
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginBtn.click();
		return new HomePAge();
	}
	

}

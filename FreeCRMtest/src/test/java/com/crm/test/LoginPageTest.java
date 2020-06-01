package com.crm.test;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.*;

import com.crm.base.TestBase;
import com.crm.qa.pages.HomePAge;
import com.crm.qa.pages.LoginPage;

import junit.framework.Assert;

public class LoginPageTest extends TestBase {
	LoginPage loginPage;
	HomePAge homepage;

	public LoginPageTest() throws IOException {
		super();
		
	}
	@BeforeMethod
	public  void setUp() throws IOException {
		initialization();
		loginPage= new LoginPage();
	}
	
	
	@Test
	public void loginPageTitleTest() {
		String title=loginPage.validateLoginPageTitle();
		Assert.assertEquals(title, CRMPRO);
	}
	
	@Test
	public void crmLogoImage() {
		boolean flag=loginPage.validateCRMImage();
		Assert.assertTrue(flag);
	}
	@Test
	public void loginTest() {
		homepage=loginPage.login(prop.getProperty(username), prop.getProperty(password));
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
		
	}

}

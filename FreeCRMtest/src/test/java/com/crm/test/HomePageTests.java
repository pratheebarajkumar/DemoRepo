package com.crm.test;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.Testutil.Testutil;
import com.crm.base.TestBase;
import com.crm.qa.pages.HomePAge;
import com.crm.qa.pages.LoginPage;

import junit.framework.Assert;

public class HomePageTests extends TestBase {
LoginPage loginPage;
HomePAge homePage;
Testutil testutil;
	public HomePageTests() throws IOException {
		super();
		
	}
	@BeforeMethod
	public  void setUp() throws IOException {
		initialization();
		loginPage=new LoginPage();
		testutil=new Testutil();
		homePage=loginPage.login(prop.getProperty(username), prop.getProperty(password));
		
	}
@Test
public void verifyhomePagetitle() {
	String homePagetitle=homePage.verifyHomePagetitle();
	Assert.assertEquals(homePagetitle, actual,"Homepage titlenot matched");
}
@Test
public  void verifyusernameTest() {
	testutil.switchtoframe();
	Assert.assertTrue(homePage.verifycorrectUsername);;
}

}

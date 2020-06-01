package com.crm.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.base.TestBase;

public class HomePAge extends TestBase{

	public HomePAge() throws IOException {
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(xpath="")
	WebElement useranmelabel;
	

public void verifyhomepage() {
	driver.getTitle();
}
public ContactsPage clickoncontactsLInk() {
	contactslink.click();
	return  new ContactsPage();
}
}
package com.crm.Testutil;

import java.io.IOException;

import com.crm.base.TestBase;

public class Testutil extends TestBase{
	 public Testutil() throws IOException {
		super();
		
	}


	public static long pageloadtimeout=20;
	 public  static long implicitwait=10;


public void switchtoframe() {
	driver.switchTo().frame("mainpanel");
}
}
package com.inetBanking.testCases;

import org.testng.annotations.Test;

import com.inetBanking.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass {
	
	@Test
	public void LoginTest() {
		LoginPage loginPage = new LoginPage();
		loginPage.setUserName(userName);
		loginPage.setPassword(password);
		loginPage.clickSubmit(btnlog);
	}
}

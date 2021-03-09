package com.inetBanking.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.inetBanking.testCases.BaseClass;

public class LoginPage extends BaseClass{


	public static final String txtBoxUserID = "//input[@name='uid']";
	public static final String txtBoxPassword = "//input[@name='password']";
	public static final String loginbtn = "//input[@name='btnLogin']";

	
	public void setUserName(String uname) {
		WebElement userName = driver.findElement(By.xpath("txtBoxUserID"));
		userName.sendKeys("mngr266311");
	}

	public void setPassword(String pwd) {
		WebElement password = driver.findElement(By.xpath("txtBoxPassword"));
		password.sendKeys("YvuzYtY");
	}

	public void clickSubmit(String btnlog) {
		WebElement login = driver.findElement(By.xpath("loginbtn"));
		login.click();
	}

}

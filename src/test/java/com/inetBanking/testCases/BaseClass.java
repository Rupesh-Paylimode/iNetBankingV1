package com.inetBanking.testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {

	
	public static final String baseURL = "http://demo.guru99.com/V4/";
	public static final String userName = "mngr266311";
	public static final String password = "YvuzYtY";
	public static WebDriver driver;
	public static final String btnlog = "loginbtn";

	@BeforeClass 
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers//chrome.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get(baseURL);
	}
		
		@AfterClass
		public void tearDown() {
			driver.quit();
		}
	
}

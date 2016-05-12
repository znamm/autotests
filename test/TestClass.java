package test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import pageObjects.AdminPage;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestClass {

	WebDriver driver;
	
	@Before
	public void setUp(){
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@After
	public void tearDown(){
		driver.close();
	}
	
	@Test
	public void incorrectLoginCheck(){
		AdminPage adminPage = new AdminPage(driver);
		Assert.assertEquals("Welcome, please sign in", adminPage.loginForm());
		
	}

}

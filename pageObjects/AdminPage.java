package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminPage extends BasePage{

	public String adminURL = "http://192.168.9.167/Magento_2.0_Sample/admin/";
	
	public AdminPage(WebDriver driver) {
		super(driver);
	}
	
	public AdminPage onAdminPage(){
		driver.navigate().to("http://192.168.9.167/Magento_2.0_Sample/admin/");
		String login, pass;
		login = "admin123";
		pass = "admin123";
		driver.findElement(By.xpath("//*[@id='username']")).sendKeys(login);
		driver.findElement(By.xpath("//*[@id='login']")).sendKeys(pass);
		driver.findElement(By.xpath("//*[contains(text(), 'Sign in')]")).click();
		return new AdminPage(driver);
	}
	
	public String loginForm(){
		driver.get(adminURL);
		return driver.findElement(By.xpath("//span[contains(text(), 'Welcome, please sign in')]")).getText();
	}
	
	
//	public AdminPage getMunuItems(){
//		driver.findElement(By.xpath(xpathExpression))
//		return new AdminPage(driver);
//	}
	
}

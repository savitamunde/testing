package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
	
	WebDriver driver;
	
	public Login(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}
	
//
	public Dashboard login_successful(String userName, String pass){
		driver.findElement(By.id("user_login")).sendKeys(userName);
		driver.findElement(By.id("user_pass")).sendKeys(pass);
		driver.findElement(By.id("wp-submit")).click();		
		return new Dashboard(driver);
		
	}
	

}

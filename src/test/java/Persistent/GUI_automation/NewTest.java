package Persistent.GUI_automation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.internal.PropertiesFile;

public class NewTest {
	WebDriver driver;
	
@BeforeTest
public void setUp(){
	 FirefoxBinary bin = new FirefoxBinary(new File("D:/Program Files (x86)/Mozilla Firefox/firefox.exe"));
	  
	 FirefoxProfile p = new FirefoxProfile();
	  
	 driver = new FirefoxDriver(bin,p);	  
	 
	 driver.get("http://localhost/wordpress/wp-login.php");
}
  @Test(description="testing login function")
  public void firstTest() throws FileNotFoundException, IOException {
	  //handling the property file
	  
	  Properties prop = new Properties();
	  
	  prop.load(new FileInputStream(new File("./src/main/Object_Repository.properties")));
	  
	  String userId = prop.getProperty("userpass.id");
	  System.out.println(userId);
	  	  
	  /*test is designed for login function
	   * tester- 
	   * date
	   */	  
	  WebElement loginId =driver.findElement(By.id("user_login")); 
	  WebElement pass = driver.findElement(By.id("user_pass"));
	  WebElement loginbtn =driver.findElement(By.id("wp-submit"));
	  //easy to read
	  loginId.sendKeys("admin");
	  pass.sendKeys("12345");
	  loginbtn.click(); 
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	  driver.findElement(By.xpath("//*[text()='Posts']"));
	  
	 // driver.findElement(By.className("continuebtn")).click();	  	    
  }
  
  @AfterTest
  public void tearDown(){
	  driver.quit();
  }
  
}
 
package Persistent.GUI_automation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.Test;

public class GetFromObjectRepo {
	WebDriver driver;
	Utility uti;
	
	
  @Test
  public void first() throws FileNotFoundException, IOException {
	  
	  Properties prop = new Properties();
	  
	  prop.load(new FileInputStream(new File("./src/main/Object_Repository.properties")));
	  
	  String userId = prop.getProperty("userpass.id");
	  String userpass = prop.getProperty("userpass.id");//value of parameter
	
	  
	  FirefoxBinary bin = new FirefoxBinary(new File("D:/Program Files (x86)/Mozilla Firefox/firefox.exe"));
	  
		 FirefoxProfile p = new FirefoxProfile();
		  
		 driver = new FirefoxDriver(bin,p);	  
		 
		 driver.get("http://localhost/wordpress/wp-login.php");
		 
		 uti= new Utility(driver);
		 
		 WebElement user_textbox = uti.getElement("user.id",userId);
		 
		 user_textbox.sendKeys("admin");
		 
		 //id, css, xpath
		 
		 WebElement userpass_textbox = uti.getElement("userpass.id",userpass);
	  
		 userpass_textbox.sendKeys("12345");
	  
		 
		 driver.quit();
	  
	  
  }
}

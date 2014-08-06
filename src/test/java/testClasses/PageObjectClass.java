package testClasses;

import java.util.NoSuchElementException;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.thoughtworks.selenium.SeleneseTestBase;

import pageObject.Dashboard;
import pageObject.Login;

public class PageObjectClass extends SeleneseTestBase {
	
	WebDriver driver;
	
	Login loginUser;
	
	Dashboard dash;
	
	private static Logger log = Logger.getLogger(PageObjectClass.class);
	
  @Test
  public void firstTest() {
	  driver = new FirefoxDriver();
	 
	  DOMConfigurator.configure("log4j.xml");
	  
	  log.info("Driver has initialized successfully.");
	  
	  driver.get("http://localhost/wordpress/wp-login.php");	  
	  //loginUser = new Login(driver);
	  
	  String name = "Paul";
	  
	  log.info("URL is fetched in the browser"+name);
	  
	  try{
		  
	  }catch(org.openqa.selenium.NoSuchElementException e){
		  log.error("", e);
	  }
	  
	 loginUser = PageFactory.initElements(driver, Login.class);
	  
	  dash = loginUser.login_successful("admin", "12345");
	  
	  loginUser = dash.logout();
	  
	  driver.quit();

	  
  }
}

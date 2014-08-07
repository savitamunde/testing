package Persistent.GUI_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Config_Class {
	WebDriver driver;
  @Test
  public void first() {
	  
	  driver = new FirefoxDriver();
	  driver.get("http://google.com");
	  driver.findElement(By.id("gbqfq")).sendKeys("paul");
	  driver.quit();
  }
}

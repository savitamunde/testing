package pageObject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Dashboard {
	WebDriver driver;
	
	@FindBy(xpath="//*[@id='user_info_links']/ul/li[2]/a")
	WebElement user_logout;
	
	@FindBy(how=How.ID, using="user_info_arrow")
	@CacheLookup
	WebElement user_arrow;
	
	
	public Dashboard(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver = driver;
		
	}
	
	public Login logout(){
		//driver.findElement(By.id("user_info_arrow")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("//*[@id='user_info_links']/ul/li[2]/a")).click();
		
		user_arrow.click();
		user_logout.click();
		//return new Login(driver);
		
		return PageFactory.initElements(driver, Login.class);
	}
	
	

}

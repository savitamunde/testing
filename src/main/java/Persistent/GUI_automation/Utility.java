package Persistent.GUI_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Persistent.Utility.PathType;

public class Utility {
	WebDriver driver;
	PathType p;
	WebElement element;
	String extractPath;
	
public Utility(WebDriver driver) {
	// TODO Auto-generated constructor stub
	this.driver = driver;
}
	
	public String getElementLocator(String elementType){
		int i = elementType.indexOf('.');
		extractPath = elementType.substring(i+1);
		return extractPath;
	}

	public WebElement getElement(String elementType, String elementName){
		String path = getElementLocator(elementType);
		p = PathType.valueOf(path);
		try{
			switch(p) {
			case id:
				element = driver.findElement(By.id(elementName));
				break;
			case xpath:
				element = driver.findElement(By.xpath(elementName));
				break;
			case name:
				element = driver.findElement(By.name(elementName));
				break;
			case css:
				//System.out.println("Element name :"+elementName);
				element = driver.findElement(By.cssSelector(elementName));
				break;					
			}
		}catch(NoSuchElementException e){
		
		}
		return element;
	}
}

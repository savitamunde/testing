package Persistent.GUI_automation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testngClass {

@BeforeSuite
public void beforesuit(){
	System.out.println("Before Suite");
}


@AfterSuite
public void Aftersuit(){
	System.out.println("After Suite");
}
	
 @BeforeMethod
 public void beforeMethod(){
	 System.out.println("Before method");
 }
 
@AfterMethod
public void afterMethod(){
	 System.out.println("after method");
}
 
  @BeforeClass
  public void beforeclassMethod(){
	  System.out.println("Before Testng class");
  }
	
  @BeforeTest
  public void beforeTestMethod(){
	  System.out.println("Before Test");
  }
  
  @Test(description="verifying login functionality")
  public void firstmethod() {
	  //method
	  System.out.println("Test Method");
  }
  
  @Test(groups="Smoke test")
  public void login(){
	  System.out.println("login");
  }
  
  
  @AfterClass
  public void afterclassMethod(){
	  System.out.println("After Testng class");
  }
	
  @AfterTest
  public void afterTestMethod(){
	  System.out.println("After Test");
  }
  
  
}

package Persistent.GUI_automation;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SecondTestngClass {
  @Test(dataProvider ="movieData")
  public void secondMethod(String movieName, String act, String Actress ) {
	  
	  System.out.println("Movie Details"+movieName+""+act+""+Actress);
	  
  }
  
  @DataProvider
  public Object[][] movieData(){
	  
	  Object[][] movieList = new Object[2][3];
	  movieList[0][0] = "Titanic";
	  movieList[0][1] = "De";
	  movieList[0][2] ="Kate";
	  
	  movieList[1][0] = "Top Gun";
	  movieList[1][1] = "Tom";
	  movieList[1][2] ="Kate1";  
	  
	  return movieList;
  }
  
}

package Persistent.GUI_automation;

import java.io.File;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

import org.testng.annotations.Test;

public class dataDrivenClass {
  @Test
  public void firstMethod() throws BiffException, IOException, RowsExceededException, WriteException {
	  /*
	  Workbook book = Workbook.getWorkbook(new File("./src/test/test.xls"));
	  
	  Sheet sheet = book.getSheet("Master");
	  
	  String value1 = sheet.getCell(0,0).getContents();
	  
	  System.out.println(value1);
	  
	  book.close();	 
	  
	  WritableWorkbook newBook = Workbook.createWorkbook(new File("./src/test/newExcel.xls"));
	  WritableSheet sheet = newBook.createSheet("Master", 0);
	  
	  Label l1 = new Label(0, 0, "One");
	  sheet.addCell(l1);
	  newBook.write();
	  newBook.close();*/
	  
	  Workbook oldCopy = Workbook.getWorkbook(new File("./src/test/test.xls"));
	  
	  //Sheet sheet = oldCopy.getSheet(0);
	  
	  WritableWorkbook newCopy = Workbook.createWorkbook(new File("./src/test/CopyTest.xls"), oldCopy);
	  
	  WritableSheet sheet1 = newCopy.getSheet(0);
	  
	  Label l2 = new Label(2, 2, "Copy Content");
	  
	  sheet1.addCell(l2);
	  
	  newCopy.write();
	  
	  oldCopy.close();
	  
	  newCopy.close();
	  
	  
	  
	  
	  
  }
}

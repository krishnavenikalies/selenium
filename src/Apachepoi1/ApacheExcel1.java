package Apachepoi1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ApacheExcel1 {

	public static void main(String[] args) throws IOException {
	
		
		//To Read file FileInputStream class used,
		
		FileInputStream file1=new FileInputStream("C://Excel apache//Excel Apache.xlsx");
		
		//To point the workbook,XSSFWorkbook class used ,all keywords case sensitive
		
		XSSFWorkbook workbook=new XSSFWorkbook(file1); //It ask for throws exception select IOException
		
		//XSSFSheet sheet=workbook.getSheet("Sheet1"); //sheet1 is my sheet name of ExcelApache
		
		XSSFSheet sheet=workbook.getSheetAt(0); //here 0 specifies 1st sheet so given as index 0 given
		
        int rowcount=sheet.getLastRowNum();  //to get total count of row values
        
        //To focus on row
        
       // sheet.getRow(0).getLastCellNum(); //returns row count
        int colcount=sheet.getRow(0).getLastCellNum(); //returns columns/cell count
        
        for(int i=0;i<rowcount;i++)
        {
        	XSSFRow currentrow=sheet.getRow(i); //focus on current row
       
        for(int j=0;j<colcount;j++)
        {
        	String value=currentrow.getCell(j).toString(); //Read value from cell
        
          System.out.print("  " +value);
          
        
        }
        System.out.println();
        
        }
        
        
        
	
	
	}

}

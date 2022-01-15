package Apachepoi1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class writedatainexcel {

	public static void main(String[] args) throws IOException {
		
		
		
		//No activity in browser ,so directly creating file 
		FileOutputStream file=new FileOutputStream("C:\\Excel apache\\write.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook();  //here connection between file and workbook not there
		
		XSSFSheet sheet=workbook.createSheet("Data");
		
		for(int i=0;i<=5;i++)
		{
			XSSFRow row=sheet.createRow(i);
			
			for(int j=0;j<3;j++)
			{
				row.createCell(j).setCellValue("abc");
				
			}
		}
		workbook.write(file);
		file.close();
		

	}

}

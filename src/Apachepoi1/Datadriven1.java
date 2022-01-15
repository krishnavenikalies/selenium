package Apachepoi1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Datadriven1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		 System.setProperty("webdriver.chrome.driver","C:\\Eclipse\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html?classic=true");

		 driver.manage().window().maximize();
		 FileInputStream file=new FileInputStream("C://Excel apache//Inte.xlsx");
		 XSSFWorkbook workbook=new XSSFWorkbook(file);
		 
		XSSFSheet sheet=workbook.getSheet("Sheet1");
	
	       int rowcount=sheet.getLastRowNum();
	       
	       for(int i=1;i<=rowcount;i++)      //get from 1 ,because we dont need header text of excel file
	       {
	    	   XSSFRow row=sheet.getRow(i);
	    	   
	    	   XSSFCell principlecell=row.getCell(0);
	    	   
	    	   int princ=(int)principlecell.getNumericCellValue();
	    	   
	    	  
	    	  // int princ=(int)row.getCell(0).getNumericCellValue();  //type casting
	    	   
	    	   XSSFCell roi=row.getCell(1);
	    	     
	    	   int rateofinterest=(int)roi.getNumericCellValue();
	    	   
	    	   
	    	   XSSFCell period=row.getCell(2);
	    	   int per=(int) period.getNumericCellValue();
	    	   
	    	   
	    	   XSSFCell frequency=row.getCell(3);
	    	   
	    	  String freq=frequency.getStringCellValue();  //no need to cascade ,as o/p value itself string
;	    	   
	    	   
	    	   XSSFCell MaturityValue=row.getCell(4);
	    	   
	    	   int mat=(int)MaturityValue.getNumericCellValue();  //can also be double ,for comparing with actual value
	    	   
	    	   
	    	   
	    	   
	    	   driver.findElement(By.id("principal")).sendKeys(String.valueOf(princ));
	    	   
	    	   driver.findElement(By.id("interest")).sendKeys(String.valueOf(rateofinterest));
	    	   
	    	   
	    	   driver.findElement(By.id("tenure")).sendKeys(String.valueOf(per));
	    	   
	    	   Select periodcombo=new Select(driver.findElement(By.id("tenurePeriod")));
	    	   periodcombo.selectByVisibleText("year(s)");
	    	   
	    	   Select freq1=new Select(driver.findElement(By.id("frequency")));
	    	   freq1.selectByVisibleText(freq);
	    	   
	    	   
	    	   driver.findElement(By.xpath(".//*[@id=\"fdMatVal\"]/div[2]/a[1]/img")).click();
	    	   
	    	String actualMvalue = driver.findElement(By.xpath(".//*[@id=\"resp_matval\"]/strong")).getText();
	    	
	    	if((Double.parseDouble(actualMvalue))==mat)  
	    	{
	    		System.out.println("Test passed");
	    	}
	    	else
	    	{
	    		System.out.println("Test failed");
	    	}
	    	
	    	
	    	   driver.findElement(By.xpath("//*[@id=\"fdMatVal\"]/div[2]/a[2]/img")).click();
	    	   
	    	   
	    	   
	    	   
	       }
	       
	      // driver.findElement(By.id("principal")).clear();
	       //driver.findElement(By.id("interest")).clear();
	      // driver.findElement(By.id("tenure")).clear();
           driver.close();
           driver.quit();
	
	
	}

}

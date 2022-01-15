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

public class newtoursdatadriven {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Eclipse\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/newtours/register.php");
				
        FileInputStream file=new FileInputStream("C://Excel apache//newtours.xlsx");
        
        XSSFWorkbook workbook=new XSSFWorkbook(file);
        
        XSSFSheet sheet=workbook.getSheet("Sheet1");
        
        int rowcount=sheet.getLastRowNum();
        
       System.out.println(rowcount);
        
        for(int i=1; i<=rowcount;i++)
        	
        {
        	
        	XSSFRow row=sheet.getRow(i);
        	
        	
          String FirstName=row.getCell(0).getStringCellValue();
         String LastName=row.getCell(1).getStringCellValue();
          int  phone=(int)row.getCell(2).getNumericCellValue();
          String Email=row.getCell(3).getStringCellValue();
          String Address=row.getCell(4).getStringCellValue();
          String city=row.getCell(5).getStringCellValue();
          String State=row.getCell(6).getStringCellValue();
          int Postalcode=(int)row.getCell(7).getNumericCellValue();
          String country=row.getCell(8).getStringCellValue();
          String userName=row.getCell(9).getStringCellValue();
          String password=row.getCell(10).getStringCellValue();
         String confirmpass=row.getCell(11).getStringCellValue();
          
          
          driver.findElement(By.name("firstName")).sendKeys(FirstName);
          
          driver.findElement(By.name("lastName")).sendKeys(LastName);
          
          driver.findElement(By.name("phone")).sendKeys(String.valueOf(phone));
          
          driver.findElement(By.name("userName")).sendKeys(Email);
          
          driver.findElement(By.name("address1")).sendKeys(Address);
          
          driver.findElement(By.name("city")).sendKeys(city);
          
          driver.findElement(By.name("state")).sendKeys(State);
          
          driver.findElement(By.name("postalCode")).sendKeys(String.valueOf(Postalcode));
          
          Select coun=new Select(driver.findElement(By.name("country")));
          
          coun.selectByVisibleText(country);
          
          driver.findElement(By.name("email")).sendKeys(userName);
          driver.findElement(By.name("password")).sendKeys(password);
          
          driver.findElement(By.name("confirmPassword")).sendKeys(confirmpass);
          
          
          //driver.findElement(By.name("submit")).click();
          
                   
        
        }
        
        driver.close();
        driver.quit();
        file.close();
        
        
	
	
	}

}

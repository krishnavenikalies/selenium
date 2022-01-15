package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datepicker {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Eclipse\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/");
		
		String date="29";
		String month="Apr";
		String yr="2022";
		driver.findElement(By.id("onward_cal")).click();
		
		while(true)
		{
			
		
		String monyr=driver.findElement(By.xpath("//td[@class='monthTitle']")).getText();
		
		  String arr[]=monyr.split(" ");
		 
		  String mon=arr[0];
		 String year=arr[1];
		  if(mon.equals(month) && year.equals(yr))
		  {
			 break; 
		  }
		  else
		  {
			  driver.findElement(By.xpath(" //button[normalize-space()='>']")).click();
		  }
		
		}
		
		
		 	 
		
		  
		  
	List<WebElement> alldate= driver.findElements(By.xpath("//table[@class='rb-monthTable first last']//td"));
		
		
		for(WebElement date1:alldate)
		{
			String Dat=date1.getText();
			
			
			if(Dat.equals(date))
			{
				date1.click();
				
			}
		}
		
		
		
		
		}

	}



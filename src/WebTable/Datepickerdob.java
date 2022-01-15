package WebTable;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Datepickerdob {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Eclipse\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/");
		
		
		driver.findElement(By.xpath(" //input[@id='dob']")).click();
		
		WebElement option=driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		
		
		Select month=new Select(option);
		
		month.selectByVisibleText("Apr");
		
		
	
	WebElement year=driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
	Select yr=new Select(year);
	yr.selectByVisibleText("1984");
	
	String date="29";
	
	List<WebElement> dates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tr//td"));
	
	for(WebElement element:dates)

	{
		String date1=element.getText();
		if(date1.equals(date))
		{
			element.click();
			
			
		}
	}
	
	
	}
}


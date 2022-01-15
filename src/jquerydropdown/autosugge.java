package jquerydropdown;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class autosugge {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","C:\\Eclipse\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
		//Thread.sleep(2000);
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("testing");
		
		Thread.sleep(10000);

	List<WebElement> option=driver.findElements(By.xpath("//li[@class='sbct']//div[@role='option']//div[1]/span"));
	  System.out.println(option.size());
	  
	  for(WebElement ele:option)
	  {
		  if(ele.getText().equals("testing centers near me")) // equals or contains can be used
		  {
			  ele.click();
		  }
	  }
	
	
	
	}

}

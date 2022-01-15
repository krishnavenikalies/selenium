package seleniumpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Getcommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver","C:\\Eclipse\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://facebook.com");
		System.out.println(driver.getTitle())
;
		System.out.println(driver.getCurrentUrl());
		
		//To check whether some text is present or not
		
		String text=driver.findElement(By.xpath("//*[@id='reg_pages_msg']")).getText();
		
	System.out.println(text);  //It returns the text in page
		
		//driver.close();  //to close the current window
	
	driver.quit();  // to close multiple window
	
	
	
	  
	
	}

}

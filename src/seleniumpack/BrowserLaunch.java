package seleniumpack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver","C:\\Eclipse\\chromedriver.exe");
		
		//System.setProperty("webdriver.chrome.verboseLogging", "true");      
		
	
		System.setProperty("webdriver.gecko.driver","C:\\Eclipse\\geckodriver.exe");
				
		WebDriver driver=new FirefoxDriver();  //launch ff
		//WebDriver driver=new ChromeDriver(); //launch chrome
		driver.get("http://www.google.com");
		
		String title=driver.getTitle();  //get title
		
		
		System.out.println(title);
		
		//validation testing
		
		if(title.equals("Google"))
			
		{
			System.out.println("CorrectTitle");
			
		}
		else
		{
			System.out.println("Title Mismatch");
		}
		
		
		System.out.println(driver.getCurrentUrl());  //returns url 
		
		System.out.println(driver.getPageSource());  //to get original page source code

	    // driver.quit();
	
	}

}
 
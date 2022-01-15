package seleniumpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class fbtest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","C:\\Eclipse\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
	//	driver.get("http://www.youtube.com");
		
		driver.get("http://www.facebook.com");
		
		driver.findElement(By.name("email")).sendKeys("informkalies@gmail.com");
	driver.findElement(By.name("pass")).sendKeys("harithra@2010");
		
		
		driver.findElement(By.name("login")).click();
		
	//	driver.findElement(By.cssSelector("css=#search-icon-legacy > .style-scope:nth-child(1)")).click();
		
			//driver.findElement(By.name("search_query")).sendKeys("The Royalty family");
			
			//driver.findElement(By.cssSelector("search-icon-legacy")).click();
			
			//driver.findElement(By.id("style-scope ytd-searchbox")).click();
		
		
		System.out.println(driver.getTitle());
		
		
		

	}

}

package seleniumpack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

public class fluentclass {

	public static void main(String[] args) {
		
System.setProperty("webdriver.gecko.driver","C:\\Eclipse\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver(); 
		
		driver.get("https://www.google.com");

		driver.findElement(By.name("q")).sendKeys("Ganesha");
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);  //It perform enter action of our keyboard
	
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
			       .withTimeout(Duration.ofSeconds(30))
			       .pollingEvery(Duration.ofSeconds(5))
			       .ignoring(NoSuchElementException.class);  //import from selenium.NoSuchElementException

			   WebElement element = wait.until(new Function<WebDriver, WebElement>() {
			     public WebElement apply(WebDriver driver) {
			       return driver.findElement(By.xpath("//h3[text()='Ganesha']"));
			       
			     }
			     
			   });
	  
	            element.click();
	}

}

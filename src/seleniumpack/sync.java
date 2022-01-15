package seleniumpack;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class sync {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver","C:\\Eclipse\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver(); 
		
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		//Implicit wait
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//implicitly wait available for all web elements,means applicable for this driver intracting elements
		
		
		driver.findElement(By.name("q")).sendKeys("Ganesha");
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);  //It perform enter action of our keyboard
		
		//driver.findElement(By.xpath("//h3[text()='Ganesha']")).click();
		
		//explicit wait
		
	//	WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));
		
		//WebElement myele=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[text()='Ganesha']")));
		
		//myele.click();
		
		//explicit wait using generic method
		
		
		By elelocator=By.xpath("//h3[text()='Ganesha']");
		
		waitForElementPresent(driver,elelocator,10).click();
		
		
		}
	
	
	
	public static WebElement waitForElementPresent(WebDriver driver,By locator,int timeout)
	{
        WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(timeout));
		
		mywait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		
		return driver.findElement(locator);
		
	}
			
			

}

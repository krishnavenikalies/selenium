package downloadfile;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Roclass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Eclipse\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.monsterindia.com/");
		
		driver.findElement(By.xpath("//span[@class='uprcse semi-bold']")).click();
	WebElement button=driver.findElement(By.xpath("//div[@class='engage w100 fl tc engage-desktop']//section[1]//div[1]//form[1]//div[1]//div[1]//div[1]//div[1]//input[1]"));

	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].click();", button);
	
	
	   Robot rb=new Robot();

	}

}

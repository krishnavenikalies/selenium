package Mouseactions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseclick {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Eclipse\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//Right click
		
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		WebElement button=driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
	
					
		Actions act=new Actions(driver);
		
		//Right click action
	  act.contextClick(button).perform();  //perform right click...can also give build().perform();where bulid create action perform method perform actions
	  
	  act.sendKeys(Keys.ARROW_DOWN);
	  Thread.sleep(2000);
	  act.sendKeys(Keys.ARROW_DOWN).click().perform();
	  Thread.sleep(5000);
	  
	/* driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	  
	  WebElement element= driver.findElement(By.xpath("//button[normalize-space()='Double-Click Me To See Alert']"));
	
	Actions act=new Actions(driver);
	act.doubleClick(element).perform();*/
	
	}

}

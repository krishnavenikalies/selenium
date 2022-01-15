package Screenshot;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class newtab {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Eclipse\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		Thread.sleep(2000);
		
		driver.get("https://jqueryui.com/tooltip/");
	
		//driver.findElement(By.xpath("//a[text()='Draggable']")).click();
		
		String tab=Keys.chord(Keys.CONTROL,Keys.ENTER);
		
	driver.findElement(By.xpath("//a[text()='Draggable']")).sendKeys(tab);
	
	
		
		
	}

}

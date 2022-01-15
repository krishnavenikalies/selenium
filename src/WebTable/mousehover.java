package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mousehover {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Eclipse\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		
	WebElement mainlink=driver.findElement(By.xpath("//a[normalize-space()='Desktops']"));
		
		WebElement harithra=driver.findElement(By.xpath("//a[normalize-space()='Mac (1)']"));
		
		Actions dharmik=new Actions(driver);
		
		dharmik.moveToElement(mainlink).moveToElement(harithra).click().perform();
		
		
		
	}

}

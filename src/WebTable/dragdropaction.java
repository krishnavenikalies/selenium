package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragdropaction {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Eclipse\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		
		WebElement rome=driver.findElement(By.id("box6"));
		
		
		WebElement italy=driver.findElement(By.id("box106"));
		
		
		Actions act=new Actions(driver);
		
		act.dragAndDrop(rome, italy).perform();  //dragdrop method with source and destination webelement
		
	}

}

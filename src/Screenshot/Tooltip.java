package Screenshot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tooltip {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Eclipse\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://jqueryui.com/tooltip/");
		driver.switchTo().frame(0);
		
		WebElement input=driver.findElement(By.xpath("//input[@id='age']"));
		
		String tooltip=input.getAttribute("title");
		
		System.out.println(tooltip);

	}

}

package Screenshot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locationandsize {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Eclipse\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		WebElement logo=driver.findElement(By.xpath("//div[@id='divLogo']//img"));
		
		//Method 1 for finding location
		
		System.out.println("Location of x and y"+logo.getLocation());
		System.out.println("Location of x "+logo.getLocation().getX());
		System.out.println("Location of y"+logo.getLocation().getY());
		
		//2.Method
		
		System.out.println("Location of x "+logo.getRect().getX());  //Rect method gets location of element
		System.out.println("Location of y"+logo.getRect().getY());  //getx and gety gives location for x and y axis
		
		//Method 1 for Size(width and Height)
		
		
		System.out.println("Size of width and height"+logo.getSize());
		System.out.println("Location of x "+logo.getSize().getWidth());
		System.out.println("Location of y"+logo.getSize().getHeight());
		
		//Method 2
		
		
		
		System.out.println("Location of x "+logo.getRect().getDimension().getWidth());
		System.out.println("Location of y"+logo.getRect().getDimension().getHeight());
	
	
	
	
	
	
	}

}

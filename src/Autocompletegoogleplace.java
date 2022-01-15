import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autocompletegoogleplace {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Eclipse\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.twoplugs.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Live Posting']")).click();
		
		
		WebElement element=driver.findElement(By.id("autocomplete"));
		
		element.clear();
		element.sendKeys("Toronto");
		String text;
		
		do
		{
			element.sendKeys(Keys.ARROW_DOWN);
			text=element.getAttribute("value");
			Thread.sleep(2000);
			
			if(text.equals("Toronto NSW, Australia"))
			{
				element.sendKeys(Keys.ENTER);
				break;
				
			}
			
		
		}while(!text.isEmpty());
		
		
		
		
		

	}

}

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bootstrapdrop {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Eclipse\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=12.0_5");
		
	
		
	driver.findElement(By.xpath("//button[@class='btn btn-danger dropdown-toggle']")).click();
       
		//driver.findElement(By.xpath("//a[(@class,'btn-primary dropdown-toggle btn-block']")).click();
		
	List<WebElement> prod=driver.findElements(By.xpath("//ul[@class='dropdown-menu']/li"));
	
	System.out.println("NO Of Option"+prod.size());
	
	for(WebElement ptype:prod)
	{
		
		String option=ptype.getText();
/*		if(ptype.getText().equals("jQuery"))
		{
			ptype.click();
			
			break;
			
		}*/
		
		
	
	//System.out.println(driver.getTitle());
	
	System.out.println(option);
	}
	}
	
	}



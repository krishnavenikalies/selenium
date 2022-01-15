package sorteddropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Autosuggestedddown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","C:\\Eclipse\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		driver.manage().window().maximize();
		
		
		driver.get("https://www.bing.com/");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("sb_form_q")).sendKeys("selenium");
		Thread.sleep(2000);
		
		List<WebElement> lis=driver.findElements(By.xpath("//li[@class='sa_sg']//div[@class='sa_tm']/span"));
		System.out.println("list of items"+lis.size());
		
		for(WebElement opt:lis)
		{
			if(opt.getText().contains("ide"))
			{
				opt.click();
				break;
				
			}
		}
	}

}

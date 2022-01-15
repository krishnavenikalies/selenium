package headless;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class headlesschrome {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Eclipse\\chromedriver.exe");
		
		//WebDriver driver=new ChromeDriver();
		
		ChromeOptions option=new ChromeOptions();
		//option.addArguments("--headless");
		option.setHeadless(true);
		WebDriver driver=new ChromeDriver(option);
		
		driver.get("http://demo.nocommerce.com");
		
		System.out.println("Title of the page"+driver.getTitle());
     
	}

}

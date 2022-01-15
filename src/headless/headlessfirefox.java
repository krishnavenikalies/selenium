 package headless;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class headlessfirefox {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\Eclipse\\geckodriver.exe");
		
		FirefoxOptions option=new FirefoxOptions();
		option.setHeadless(true);
		
		WebDriver driver=new FirefoxDriver(option);
		driver.get("http://demo.nopcommerce.com");
		System.out.println("Title of page"+ driver.getTitle());
		

	
	
	}

}

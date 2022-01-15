package seleniumpack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Navigate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Eclipse\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://facebook.com");
		System.out.println(driver.getTitle());
		
		driver.navigate().to("http://demo.guru99.com/test/newtours/");
		
		System.out.println(driver.getTitle());
		driver.navigate().back();
		
		System.out.println(driver.getTitle());
		
		driver.navigate().forward();
		
		System.out.println(driver.getTitle());
		
		driver.navigate().refresh();
		
		driver.close();

	}

}

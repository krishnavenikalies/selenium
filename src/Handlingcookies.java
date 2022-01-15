import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlingcookies {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\Eclipse\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.nopcommerce.com/en/demo");
		
		Set<Cookie> cookie=driver.manage().getCookies();
		
		System.out.println("Size of cookies"+cookie.size());
		
		
		//print cookie from browser
		
		for(Cookie cook:cookie)
		{
			System.out.println(cook.getName()+"  "+cook.getValue());
		}
		
		
		//How to add cookie from browser
		
		Cookie mycookie=new Cookie("hari123","23457");
		
		driver.manage().addCookie(mycookie);
		
		cookie=driver.manage().getCookies();
		
		System.out.println("Size of cookies after adding mycookie"+cookie.size());
		
		
		
		//driver.manage().deleteCookie(mycookie);
		
		driver.manage().deleteCookieNamed("hari123");
		
        cookie=driver.manage().getCookies();
		
		System.out.println("Size of cookies after deleting mycookie"+cookie.size());
		
		
		driver.manage().deleteAllCookies();
		
		  cookie=driver.manage().getCookies();
			
			System.out.println("Size of cookies after deleting ALL cookie"+cookie.size());
			
		
		 driver.quit();

	}

}

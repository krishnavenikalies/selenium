package headless;

//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import com.gargoylesoftware.htmlunit.BrowserVersion;

public class headlesshtmlunitdriver {

	public static void main(String[] args) {
		//HtmlUnitDriver driver=new HtmlUnitDriver();
		
		
		//HtmlUnitDriver is fastest in all driver as it is without GUI
		HtmlUnitDriver driver=new HtmlUnitDriver(BrowserVersion.EDGE);//execution environment can be given as Edge or chrome or firefox
		//System.setProperty("webdriver.chrome.driver","C:\\Eclipse\\chromedriver.exe");
		//WebDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
		System.out.println("Title of page"+driver.getTitle());
		
		System.out.println("current url of page"+driver.getCurrentUrl());
		
		
		

	}

}
 
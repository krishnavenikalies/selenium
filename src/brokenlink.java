import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class brokenlink {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Eclipse\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("http://www.deadlinkcity.com/");
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		int brokenlinks=0;
		
		for(WebElement link:links)
		{
			String url=link.getAttribute("href");
			
			if(url=="null"  || url.isEmpty())
			{
				System.out.println("Normal Link");
				
			}
			URL link1=new URL(url);
			
			try
			{
				HttpURLConnection httpurlconn=(HttpURLConnection) link1.openConnection();
				
				httpurlconn.connect();
				if(httpurlconn.getResponseCode()>=400)
				{
					System.out.println(httpurlconn.getResponseCode()+url+"is"+"Broken links");
					
					brokenlinks++;
				}
				
				else
				{
					System.out.println(httpurlconn.getResponseCode()+url+"is"+"valid link");
				}
			}
				
				
				catch(Exception e)
				{
				}
				System.out.println(brokenlinks);
				}
			}
			
}
			
			
			
			
			
			
		
		
	
	
	
	



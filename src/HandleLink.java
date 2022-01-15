import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleLink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Eclipse\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	
	  driver.get("https://www.amazon.in/");
	  
	//  driver.findElement(By.linkText("Today's Deals")).click();
	
	//driver.findElement(By.partialLinkText("Deals")).click();  //partial text can be given
	//How to capture all links inpage
	  
	  List<WebElement> links=driver.findElements(By.tagName("a"));
	
	System.out.println(links.size());
	
	//Normal for loop
	
/*	for(int i=0;i<links.size();i++)
	{
		System.out.println(links.get(i).getText());
		System.out.println(links.get(i).getAttribute("href"));
	}*/
	
	//foreach loop
	
	for(WebElement links1:links)
	{
		System.out.println(links1.getText());
		System.out.println(links1.getAttribute("href"));
	}
	
	
	
	
	
	
	
	}

}

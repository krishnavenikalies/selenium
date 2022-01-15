package seleniumpack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class sortedddown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Eclipse\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.twoplugs.com/");
		driver.findElement(By.xpath("//a[text()='Live Posting']")).click();
		driver.findElement(By.xpath("//div[@class='jq-selectbox jqselect']")).click();
		
		//List<WebElement> options=driver.findElements(By.name("category_id"));
		
		WebElement drpele=driver.findElement(By.name("category_id"));
		Select drp=new Select(drpele);
		List<WebElement> options=drp.getOptions(); 
		
        ArrayList originallist=new ArrayList();
        ArrayList templist=new ArrayList();
        
	     for(WebElement opt:options)
	     {
	    	 originallist.add(opt.getText());
	    	 templist.add(opt.getText());
	     
	     }
	     
	     //System.out.print("original list"+originallist);
	     //System.out.print("temp list"+templist);
	    Collections.sort(templist);
	    System.out.println("original list"+originallist);
	     System.out.println("After sort temp list"+templist);
	     
	     
	     if(originallist.equals(templist))
	     {
	    	 System.out.println("Dropdown options sorted");
	    	 
	     }
	     else
	    	 System.out.println("Not sorted");
	     
	   
	
	}
	  
	}
	




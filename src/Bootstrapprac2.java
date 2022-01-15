import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bootstrapprac2 {
	


	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Eclipse\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.jquery-az.com/jquery/demo.php?ex=152.0_1");
		WebElement dbox=driver.findElement(By.id("btndropdown"));
		dbox.click();
		List<WebElement> opt=driver.findElements(By.xpath("//ul[@class='dropdown-menu']/li/label"));
		
		//ArrayList<WebElement> opt=new ArrayList(driver.findElements(By.xpath("//ul[@class='dropdown-menu']/li/label")));
		
		
		//driver.findElement(By.xpath("//button[@value='Clear']")).click(); //to clear options
		
		for(WebElement option:opt)
			
			
		{
			
			String hat  =option.getText();
			//To select 2 option and unselect 1
			
			if(option.getText().equals("Bootstrap") || option.getText().equals("HTML")) {
			
				option.click();
				
			}
			
			if(hat.equals("CSS") && option.findElement(By.tagName("input")).isSelected())
			{
				option.click();
			}
			

				
			//To print only selected options
			
			/*String hat  =option.getText();
		     
		    if(option.findElement(By.tagName("input")).isSelected())
			{
				System.out.println(hat);
				
				
			}*/
			//To select all options
		     
			/*if(option.findElement(By.tagName("input")).isSelected())
			{
				
				
				
			}
			else
			{
				option.click();
				//System.out.println(hat);
			}
			
			String hat  =option.getText();
		     
		     System.out.println(hat);*/
		  
			
		     //To unselect ALL OPTIONS
		     
		     /*if(option.findElement(By.tagName("input")).isSelected())
					{
				
					
					option.click();
					
					}*/
		     
		     
		     
		     
		     
		}
		//System.out.println(hat);
		
		if(Boolean.valueOf(dbox.getAttribute("aria-expanded")))
		{
			dbox.click();
		}
		
	}

	
}
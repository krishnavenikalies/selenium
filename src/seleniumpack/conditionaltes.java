package seleniumpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class conditionaltes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver","C:\\Eclipse\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://facebook.com");
		
		WebElement email=driver.findElement(By.xpath("//*[@id='email']"));
		
		WebElement pass=driver.findElement(By.xpath("//*[@id='pass']"));
		
        if(email.isDisplayed() && email.isEnabled())
        {
        	email.sendKeys("informkalies@gmail.com");
        }
       if(pass.isDisplayed() && pass.isEnabled())
       {
    	   pass.sendKeys("aaaaa");
       }
	
	
	}

}

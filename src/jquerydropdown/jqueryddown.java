package jquerydropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class jqueryddown {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\Eclipse\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		
	driver.findElement(By.id("justAnInputBox")).click();
	
	//selectchoice(driver,"choice 1");
	//selectchoice(driver,"choice 1","choice 2","choice 6 1");
	
	selectchoice(driver,"all");
	
	}
	
	public static void selectchoice(WebDriver driver,String...value)  //This ...after string accepts 1choice,many choice or all choice
	{
		List<WebElement> option=driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']"));
		
		if(!value[0].equalsIgnoreCase("All"))  //It execute if value is not equal to all,it can have single or multiple choice
		{
			for(WebElement opt:option)
			{
				String drop=opt.getText();
				
				for(String val:value)
				{
					if(drop.equals(val))
					{
						opt.click();
					}
				}
			}
		}
			else
			{
				for(WebElement opt:option)
					opt.click();
			}
		}
	}



package Mouseactions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class multiplekeyboardaction {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Eclipse\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://text-compare.com/");
		
		WebElement input=driver.findElement(By.xpath(" //textarea[@id='inputText1']"));
		
		WebElement output=driver.findElement(By.xpath("//textarea[@id='inputText2']"));
		
		input.sendKeys("welcome to automation");
		
		Actions act=new Actions(driver);
		
		
		//Ctrl+A action
		
		act.keyDown(Keys.CONTROL);
		act.sendKeys("a");
		act.keyUp(Keys.CONTROL);
		act.perform();
		
		//ctrl+c action
		
		
		act.keyDown(Keys.CONTROL);
		act.sendKeys("c");
		act.keyUp(Keys.CONTROL);
		act.perform();
		
		
		act.sendKeys(Keys.TAB);
		
		act.perform();
		
		
		//ctrl+v action
		
		

		act.keyDown(Keys.CONTROL);
		act.sendKeys("v");
		act.keyUp(Keys.CONTROL);
		act.perform();
		
		if(input.getAttribute("value").equals(output.getAttribute("value")))
		
		{
			System.out.println("Text matched");
		}
		else
			System.out.println("Text mismatch");
		
		
	}

}

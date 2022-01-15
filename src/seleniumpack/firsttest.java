package seleniumpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firsttest {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver","C://Eclipse//geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver(); //invoke firefox browser
		driver.get("http://demo.guru99.com/test/newtours/?rp=/login");
		
		
		driver.manage().window().maximize();  //to maximize the window
		driver.findElement(By.name("userName")).sendKeys("mercury");  //right click username textbox and click inspect
		
		driver.findElement(By.name("password")).sendKeys("mercury");    //in code name is given ,give same here in double quotes here
		
		driver.findElement(By.name("submit")).click();  //It clicks login button
		
		String actual=driver.getTitle(); //to get the title of page
		
		System.out.println(actual);
		
		String expected="Login: Mercury Tours";
		
		if(expected.equals(actual))
		{
			System.out.println("Accepted Title");
			
		}
		else
		{
			System.out.println("Not Accepted Title");
		}

		//driver.quit();
	}

}

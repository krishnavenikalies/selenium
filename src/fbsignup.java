import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class fbsignup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	System.setProperty("webdriver.chrome.driver","C:\\Eclipse\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.fb.com");
	
	String urlfromwebpage=driver.getCurrentUrl();
	
	if(urlfromwebpage.equals("https://www.facebook.com/"))
			{
		System.out.println("Pass Url");
		
			}else
			{
				System.out.println("fail url");
				
			}
	//click Create New Account
	
	driver.findElement(By.xpath("//*[contains(@id,'u_0_2_')]")).click();  //id is dynamic so used contains
	
	Set<String> handler=driver.getWindowHandles();
	Iterator<String> it=handler.iterator();
	String a=it.next();
	System.out.println("Parent window"+a);
	//String c=it.next();
	//System.out.println("Child window"+c);
	//driver.switchTo().window(c);
	
	Thread.sleep(2000);
	
	
	//driver.findElement(By.cssSelector("fbIndex").findElement(By.name("firstname"))
	driver.findElement(By.name("firstname")).sendKeys("krishi");
	driver.findElement(By.name("lastname")).sendKeys("Kumaresan");
	driver.findElement(By.xpath("//*[contains(@id,'u_2_f_')]")).click();
	
	driver.findElement(By.name("reg_email__")).sendKeys("kkumaresanvlogs@gmail.com");
	
	driver.findElement(By.name("reg_email_confirmation__")).sendKeys("kkumaresanvlogs@gmail.com");
	
	driver.findElement(By.name("reg_passwd__")).sendKeys("krishnaveni84");
	
	//WebElement dayele= driver.findElement(By.name("birthday_day"));
	       // Select dayDropdown= new Select(dayele);
		//	dayDropdown.selectByVisibleText("29");
	
	//without storing in webelement,we can directly use locator in select
			
			 Select dayDropdown= new Select(driver.findElement(By.name("birthday_day"))); 
				dayDropdown.selectByVisibleText("29");
				
				
				
	
	driver.findElement(By.xpath("//*[(@id='month')]")).click();
			//driver.findElement(By.xpath("//*[(@name='birthday_month')]")).click();
	WebElement monthele= driver.findElement(By.id("month"));
	Select monthDropdown= new Select(monthele);
	monthDropdown.selectByVisibleText("Apr");
	
	WebElement  yearele= driver.findElement(By.name("birthday_year"));
		
	Select yearDropdown= new Select(yearele);
	
	
	yearDropdown.selectByVisibleText("1984");
	
	/*boolean radio1=driver.findElement(By.xpath("//*[(@type='radio' and @value='1')]")).isSelected();
	System.out.println(radio1);*/   // This check whether radio button is selected default or not
	
	driver.findElement(By.xpath("//*[(@type='radio' and @value='1')]")).click();
	
	
	driver.findElement(By.name("websubmit")).click();
	

	
	//driver.findElement(By.name("birthday_month")).sendKeys("09");
	
	//driver.findElement(By.name("year")).sendKeys("2013");
	
	
	
	
	}

}

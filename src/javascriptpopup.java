import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascriptpopup {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Eclipse\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		/*driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button")).click();
		
		driver.switchTo().alert().accept();*/
		
		
		//2.Alert with ok and cancel
		
	/*	driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button")).click();
		
		//driver.switchTo().alert().accept();  to click ok
		
		driver.switchTo().alert().dismiss();*/
		
		
		//3.Alert with Textbox and ok,cancel
		
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button")).click();
		
		Alert alerttext=driver.switchTo().alert();
		
		System.out.println("Message displayed"+alerttext.getText());  
		
		alerttext.sendKeys("Selenium");
		alerttext.accept();
		
		

	}

}

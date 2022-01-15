package downloadfile;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

public class uploadfile {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Eclipse\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://omayo.blogspot.com/");
		
		//Upload by sendKeys Method ...Only when in html attribute type=file
		//File uploaded from project
		/*String projpath=System.getProperty("user.dir");
		driver.findElement(By.xpath("//input[@id='uploadfile']")).sendKeys(projpath+"\\screenshot\\DownloadDemo-master.zip");
		
		//File uploaded from system
		
		//driver.findElement(By.xpath("//input[@id='uploadfile']")).sendKeys("C:\\upload.docx");*/
		
		
		
		
	}

}

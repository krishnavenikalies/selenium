import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascriptexec {

	public static void main(String[] args) throws IOException, InterruptedException {
System.setProperty("webdriver.chrome.driver","C:\\Eclipse\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.opencart.com/");
	
	/*WebElement logo=driver.findElement(By.xpath("//img[@title='OpenCart - Open Source Shopping Cart Solution']"));
	
	JavaScripUtil.drawBorder(logo, driver);
	
	TakesScreenshot ts=(TakesScreenshot)driver;
	File src=ts.getScreenshotAs(OutputType.FILE);
	
	File target=new File(".\\screenshot\\screen.png");
	
	FileUtils.copyFile(src, target);
	
	//get title with js
	
	String title=JavaScripUtil.getTitle(driver);
	
	System.out.println(title);
	
	//click with js
	
	WebElement down=driver.findElement(By.xpath("//ul[@class='nav navbar-nav']//a[normalize-space()='Download']"));
	
	JavaScripUtil.clickElement(down, driver);
	
	
	
	JavaScripUtil.generateAlert(driver,"This is my message");
	
	
	JavaScripUtil.refreshBrowser(driver);
	
	
	
	JavaScripUtil.Scrolldown(driver);
	
	Thread.sleep(2000);
	JavaScripUtil.Scrollup(driver);
	
	JavaScripUtil.zoombyjs(driver);  //zoom out is 100%*/
	
	
	WebElement logo=driver.findElement(By.xpath("//img[@title='OpenCart - Open Source Shopping Cart Solution']"));
	
	JavaScripUtil.flash(logo, driver);
	

	//driver.close();
	
	
	}



}

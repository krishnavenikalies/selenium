package Screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class capturescreen {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Eclipse\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

	driver.get("https://www.nopcommerce.com/en");
	
	//Capture full page as screenshot
	/*TakesScreenshot ts=(TakesScreenshot)driver;
	
	File src=ts.getScreenshotAs(OutputType.FILE);
	
	File target=new File(".\\screenshot\\homepage.png");
	
	FileUtils.copyFile(src, target);*/
	
	//Capture only portion of page
	
	/*WebElement element=driver.findElement(By.xpath("//body/div[@class='master-wrapper-page']/section/div[@class='master-wrapper-content']/div[@class='container']/div[@class='master-column-wrapper']/div[@class='center-1']/div[@class='page home-page']/div[@class='page-body']/div[@class='testimonial']/div[@class='testimonial-slider']/div[@class='container']/div[@class='testimonial-carousel owl-carousel owl-theme owl-loaded owl-drag']/div[@class='owl-stage-outer owl-height']/div[@class='owl-stage']/div[6]/div[1]"));
		
		File src=element.getScreenshotAs(OutputType.FILE);
		
		File target=new File(".\\screenshot\\feature.png");
		
		FileUtils.copyFile(src, target);*/
		
		
		//capture a webelement
		
WebElement ele=driver.findElement(By.xpath("//img[@title='nopCommerce']"));
		
		File src=ele.getScreenshotAs(OutputType.FILE);
		
		File target=new File(".\\screenshot\\logo.png");
		
		FileUtils.copyFile(src, target);
		
		
	
	
	driver.close();
	
	
	
	
	}

}

package Mouseactions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class slider {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Eclipse\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.get("http://demo.automationtesting.in/Slider.html");
		
	
		
		driver.get("https://www.flipkart.com/mobile-phones-store?fm=neo%2Fmerchandising&iid=M_8e0ce160-3ef3-4d3d-a4ed-eea02af52e8a_2_372UD5BXDFYS_MC.ZRQ4DKH28K8J&otracker=hp_rich_navigation_3_2.navigationCard.RICH_NAVIGATION_Mobiles_ZRQ4DKH28K8J&otracker1=hp_rich_navigation_PINNED_neo%2Fmerchandising_NA_NAV_EXPANDABLE_navigationCard_cc_3_L0_view-all&cid=ZRQ4DKH28K8J");
		
		
		//WebElement minslider=driver.findElement(By.xpath("//a[@class='ui-slider-handle ui-state-default ui-corner-all']"));
		
		WebElement minslider=driver.findElement(By.xpath("//div[@class='_31Kbhn _28DFQy']//div[@class='_3FdLqY']"));
		
		
		System.out.println("Min slider location"+minslider.getLocation());//Min slider location(230, 282)
		
						
		
		System.out.println("Min side of slider size"+minslider.getSize());//Min side of slider size(18, 38)
		
		Actions act=new Actions(driver);
		
		act.dragAndDropBy(minslider,10, 0).release().perform();
		
		
		System.out.println("Min slider location"+minslider.getLocation());//Min slider location(241, 282)
		
		//System.out.println("Min side of slider size"+minslider.getSize());//Min side of slider size(19, 38)
		
		
		Thread.sleep(2000);
		
		//Explicit wait
		
		WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(30));
		mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='_31Kbhn WC_zGJ']//div[@class='_3FdLqY']")));
	
		//	WebElement maxslide=driver.findElement(By.xpath("//span[2]"));
		
		WebElement maxslide=driver.findElement(By.xpath("//div[@class='_31Kbhn WC_zGJ']//div[@class='_3FdLqY']"));
		Thread.sleep(3000);
		
		act.dragAndDropBy(maxslide, -10, 0).perform();
		
		//System.out.println("Min slider location"+maxslide.getLocation());
		
		System.out.println("Min side of slider size"+maxslide.getSize());
		
		
	}

}

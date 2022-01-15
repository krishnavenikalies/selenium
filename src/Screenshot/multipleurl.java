package Screenshot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class multipleurl {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Eclipse\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.opencart.com/");
		
		//driver.switchTo().newWindow(WindowType.TAB);  //diplays in diff tabs
		
		driver.switchTo().newWindow(WindowType.WINDOW);//displays in diff windows
		driver.get("https://jqueryui.com/tooltip/");
		
	}

}

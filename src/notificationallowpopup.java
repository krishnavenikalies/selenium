import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class notificationallowpopup {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Eclipse\\chromedriver.exe");
		
		ChromeOptions option=new ChromeOptions();
		
		option.addArguments("--disable-notifications");
		
		WebDriver driver=new ChromeDriver(option);  //This will discard the notifications popup
		
		driver.get("https://www.hdfc.com/");
		
		
		
		
		
		
		
		
	}

}

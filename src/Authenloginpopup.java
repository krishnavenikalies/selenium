import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Authenloginpopup {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Eclipse\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//driver.get("https://the-internet.herokuapp.com/basic_auth");
		
		//syntax
		
		//https://username:password@url
		
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		

	}

}

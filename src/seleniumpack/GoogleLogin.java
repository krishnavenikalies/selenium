package seleniumpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class GoogleLogin {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\Eclipse\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?continue=https%3A%2F%2Fmyaccount.google.com%3Futm_source%3Daccount-marketing-page%26utm_medium%3Dcreate-account-button&flowName=GlifWebSignIn&flowEntry=SignUp");
		
		System.out.println(driver.getTitle());
		
		driver.findElement(By.name("firstName")).sendKeys("Dharmik");
		
		driver.findElement(By.name("lastName")).sendKeys("Kumaresan");
		
		driver.findElement(By.name("Username")).sendKeys("dharmikkumaresan");
		
		driver.findElement(By.name("Passwd")).sendKeys("krishnaveni84");
		
		driver.findElement(By.name("ConfirmPasswd")).sendKeys("krishnaveni84");
		
		driver.findElement(By.id("i3")).click();

		//driver.findElement(By.xpath("//button[@id='accountDetailsNext']")).click();
		
		driver.findElement(By.cssSelector("button.VfPpkd-LgbsSe-OWXEXe-k8QpJ > .VfPpkd-vQzf8d")).click(); //tagname and class css
		
		driver.findElement(By.cssSelector("input#phoneNumberId")).sendKeys("6472853793");
	
		driver.findElement(By.cssSelector("button.VfPpkd-LgbsSe-OWXEXe-k8QpJ > .VfPpkd-RLmnJb")).click();
	
		
		//driver.findElement(By.xpath("//*[@id=\"view_container\"]/div/div/div[2]/div/div[2]/div/div[1]/div/div/button]")).click();
		
		
		WebElement monthele= driver.findElement(By.id("month"));
		//WebElement dayele= driver.findElement(By.id("day"));
		//WebElement  yearele= driver.findElement(By.id("year"));
		
		//Select dateDropdown= new Select(monthele);
		Select monthDropdown= new Select(monthele);
		//Select yearDropdown= new Select(yearele);
		
		//dateDropdown.selectByVisibleText(09);
		
		monthDropdown.selectByVisibleText("December");
		//yearDropdown.selectByVisibleText(09);
		driver.findElement(By.name("day")).sendKeys("09");
		
		driver.findElement(By.name("year")).sendKeys("2013");
		
		
		WebElement gene= driver.findElement(By.id("gender"));
		
		Select gender1=new Select(gene);
		
		gender1.selectByVisibleText("Female");
		
		
		
		
		
		
	
	
	}


	}



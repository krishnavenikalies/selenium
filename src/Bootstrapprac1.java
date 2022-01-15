import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bootstrapprac1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Eclipse\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.get("https://www.jquery-az.com/bootstrap4/demo2.php?ex=91.0_2");
		
		driver.get("https://www.jquery-az.com/bootstrap4/demo.php?ex=79.0_12");
		driver.findElement(By.id("btnDropdownDemo")).click();
		
		//driver.findElement(By.id("navbarDropdown")).click();
		 
		 
		
		//List<WebElement> element=driver.findElements(By.xpath("//div[@class='dropdown-menu show']/a"));
		
		List<WebElement> element=driver.findElements(By.xpath("//div[@class='dropdown-menu show']/a"));  //instead of a ,if we give dot ( .) we can get all options with header
		
		for(WebElement option:element) {
       	 String opt=option.getText();
       	 System.out.println(opt);
       	 
       	 if(option.getText().equals("HTML"))
       	 {
       		 option.click();
       		 break;
       	 }
		}
		
               /*  for(WebElement option:element) {
                	 String opt=option.getText();
                	 System.out.println(opt);
                	 
                	 if(option.getText().equals("CSS Tutorials"))
                	 {
                         
                		 option.click();
                		 break;
                		 
                	 }
                	 
                   //System.out.println(opt);
                   
                 
                 
                 }*/
                	 
                	 
	}

}

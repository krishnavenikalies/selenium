import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframeexample {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\Eclipse\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width");
	
              
       driver.switchTo().frame("iframeResult");  //outer frame with frame name
       
       WebElement inner=driver.findElement(By.xpath("/html/body/iframe")); //innerframe with webelement
       
       driver.switchTo().frame(inner);
     //  driver.switchTo().frame(0)  //innerframe can also be given as frame(0), one innerframe is there ,firstindex is 0
       
     System.out.println(driver.findElement(By.xpath("//h1")).getText());
     
     driver.switchTo().parentFrame();   //to go to parent frame and get text from there
     
    String text= driver.findElement(By.xpath("//p[contains(text(),'You can use the height')]")).getText();
     System.out.println(text);
       
       
	
	
	
	
	}

}

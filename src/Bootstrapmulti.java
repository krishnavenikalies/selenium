
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bootstrapmulti {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Eclipse\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		
		WebElement dropdownbox=driver.findElement(By.xpath("//button[contains(@class,'multiselect')]"));
		dropdownbox.click();

		
		//driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click();

		
	//	List<WebElement>  options=driver.findElements(By.xpath("//ul[contains(@class,'multiselect-container')]/li/a/label"));  //This displays all options of dropdown with heading label

	   List<WebElement>  options=driver.findElements(By.xpath("//ul[contains(@class,'multiselect-container')]/li[not(@class='multiselect-item multiselect-group')]")); //This displays options leaving heading label 
	    
	    System.out.println("NO Of Option"+options.size());
		
		for(WebElement ptype:options)
		{
			/*if(ptype.findElement(By.tagName("input")).isSelected())  //This displays only options with default selected
				
			{
			
			String optiontext=ptype.getText();
			System.out.println(optiontext);
			}*/
			
			
			//To select 2 new options and deselect 1 option
			
			
			WebElement optionchk=ptype.findElement(By.tagName("input"));
			
			String optiontext=ptype.getText();
			
			if(optiontext.equals("Bootstrap"))
			{
				ptype.click();
			}
			if(optiontext.equals("Java"))
				ptype.click();
			if(optiontext.equals("CSS") && ptype.findElement(By.tagName("input")).isSelected())
				optionchk.click();
		
			
		
		}
	
		
		//driver.quit();
		//It close the dropdown after selection
		if(Boolean.valueOf(dropdownbox.getAttribute("aria-expanded")))  //It will change string result to boolean....when true comes as string o/p it changed to boolean
          dropdownbox.click();
	
	
	
}		
}		
	    
	
	



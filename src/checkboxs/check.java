package checkboxs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class check {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Eclipse\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		
		//1.select 1 checkbox
	
		
		//driver.findElement(By.xpath("//input[@id='wednesday']")).click();
		
		//2.To select all checkbox
		Thread.sleep(2000);
		
	List<WebElement> checkb=driver.findElements(By.xpath("//input[@type='checkbox' and contains(@id,'day')]"));

	 System.out.println("No of checkbox"+checkb.size()  );
/*	 for(WebElement box:checkb)
	 {
		 box.click();
	 }*/
	 
	 
	 //3.To click checkboxes of our own choices
	 
	 
	/* for(WebElement box:checkb)
	 {
		 String day=box.getAttribute("id");
				 
				 if(day.equals("monday") || day.equals("sunday"))
					 
				 {
					 box.click();   
					
				 }
	
	 }*/
	 //4 select last 2 checkbox
	 
/* int totalcheck=checkb.size(); //7
	 
	 for(int i=totalcheck-2;i<totalcheck;i++) //5 to 7
	 {
		 checkb.get(i).click();
	 }*/
	 
	 //5.select first 3 checkbox
	 
	 
	int totalcheck=checkb.size();
	 
	 for(int i=0;i<totalcheck;i++)
	 {
		 if(i<=2)
		 {
			checkb.get(i).click();
			
		 }
	 }
		 
	 
	 
	
	}

}

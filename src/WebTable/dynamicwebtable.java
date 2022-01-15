package WebTable;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamicwebtable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Eclipse\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.opencart.com/admin/");
		
		
		WebElement user=driver.findElement(By.id("input-username"));
		user.clear();
		user.sendKeys("demo");
		
		WebElement pass=driver.findElement(By.id("input-password"));
		pass.clear();
		pass.sendKeys("demo");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.findElement(By.xpath("//*[@id=\"menu-sale\"]/a")).click();
		
		driver.findElement(By.xpath("//*[@id='collapse26']/li[1]/a")).click();
		
		
		//Total no of pages
		
		String text=driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div/div[2]/div/div[2]/div/div[2]")).getText();
		
		System.out.println(text);//output is Showing 1 to 20 of 11098 (555 Pages)
		
		int total=Integer.valueOf(text.substring(text.indexOf("(")+1,text.indexOf("Pages")-1));
		
		System.out.println(total);//555
		
		
		
		
		for(int p=1;p<=3;p++)  //here p can be max of up to 'total' (total no of page)
		{
			WebElement active=driver.findElement(By.xpath("//ul[@class='pagination']//li//span"));
			
			System.out.println("Activepage"+active.getText());
			
			active.click();
			
			
             int rows=driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']//tbody/tr")).size();


             
             System.out.println("No of rows in a page"+rows);
             
           String nextpage=Integer.toString(p+1);
             
             
        driver.findElement(By.xpath("//ul[@class='pagination']/li/a[text()='"+nextpage+"']")).click();*/
        
        
        
        for(int r=1;r<=rows;r++)
        {
        	String orderid=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody/tr["+r+"]/td[2]")).getText();
       
        	
        	String customer=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody/tr["+r+"]/td[3]")).getText();
            
        	String Status=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody/tr["+r+"]/td[4]")).getText();
        	
        	
        	System.out.println(orderid+"   "+customer+"   "+Status);
            
        
        
        }
		
			
			
		}
	
	
	}

}

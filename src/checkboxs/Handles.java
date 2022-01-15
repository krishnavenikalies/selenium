package checkboxs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handles {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Eclipse\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
	String windowid=driver.getWindowHandle();
	System.out.println(windowid);  //displays id of single window id,it will dynamically change each and every time
		
     driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
     
    Set <String> windowids=driver.getWindowHandles();
	
        //First iterator method ,iterator method can be used with collections
    
   /* Iterator<String> it=windowids.iterator();
    
    String parentid=it.next();
    String childid=it.next();
    System.out.println("parent window id"+parentid);
    System.out.println("child window id"+childid); */
    
    
    
    //Second method using List interface/ArrayList
    
    List<String> window=new ArrayList(windowids);
      /*  String parentwindow=window.get(0);
        String childwindow=window.get(1);
        
        System.out.println("parent window id"+parentwindow);
        System.out.println("child window"+childwindow);
        
    
        //How to use windowid to switch between windows
        
        driver.switchTo().window(parentwindow);
        
        System.out.println("parent window title"+driver.getTitle());
        
        driver.switchTo().window(childwindow);
        System.out.println("childwindow title"+driver.getTitle());*/
        
        //For each loop
        /* for(String win:window)
         {
        	 
        	String windowtitle =driver.switchTo().window(win).getTitle();
        	 System.out.println(windowtitle);
         }*/
        //driver.close(); //close only 1 browser which driver pointing
        
        //driver.quit();
         
         //To close specific browser window
         
       /*  for(String win:window)
         {
        	 
        	String windowtitle =driver.switchTo().window(win).getTitle();
        	
        	if(windowtitle.equals("OrangeHRM")) //to close multiple windows ,can add conditions with || operator
        	{
        		driver.close();
        		
        	}
        	 
         }*/
		}

}

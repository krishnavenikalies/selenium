package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtable1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Eclipse\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		
		//How many rows in table
		
		int rowno=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr")).size();
		
		System.out.println(rowno);
		
		//How many columns in table
		
		int colomnno=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/th")).size();
		
		System.out.println(colomnno);
		
		//Retrieve specific row or column data
		
		 String data=driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[3]/td[2]")).getText();
		
        System.out.println(data);
        
        
        //To retrieve all values of table
        
        
      /*  for(int r=2;r<=rowno;r++)  //row starts from 2,since 1st is heading of table
        	
        {
        	for(int c=2;c<=colomnno;c++)  //row  and coloumn [1,1][1,2][1,3] are table heading
        			 {
        		
        		 String value=driver.findElement(By.xpath("//table[@id='customers']//tr["+r+"]/td["+c+"]")).getText();
        		 System.out.print(value+"   ");
        		 
        		
        	}
        	
        	System.out.println();
        
	}*/
        
        
        for(int r=2;r<=rowno;r++)
        {
        	String value=driver.findElement(By.xpath("//table[@id='customers']//tr["+r+"]/td[1]")).getText();
        	
        	if(value.equals("Meta"))
        	{
        		String company=driver.findElement(By.xpath("//table[@id='customers']//tr["+r+"]/td[2]")).getText();
        		String country=driver.findElement(By.xpath("//table[@id='customers']//tr["+r+"]/td[3]")).getText();
        	
        	System.out.println(value+"  "+company+"    "+country);
        	
        	
        	}
        }
	driver.quit();
	
	}
	

}

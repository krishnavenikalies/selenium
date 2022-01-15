package downloadfile;

import java.io.File;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

import net.jodah.failsafe.internal.util.Assert;

public class downloadfile {

	public static void main(String[] args) throws InterruptedException {

		String location=System.getProperty("user.dir")+"\\screenshot";
		
		
		//Chrome
	/*	HashMap preferences=new HashMap();
		
		preferences.put("download.default_directory", location);
		preferences.put("plugins.always_open_pdf_externally",true);  // only for pdf to download
		
		ChromeOptions option=new ChromeOptions();
		option.setExperimentalOption("prefs", preferences);
		
		System.setProperty("webdriver.chrome.driver","C:\\Eclipse\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(option);*/
		
		//Firefox
		
		FirefoxProfile profile=new FirefoxProfile();
		//profile.setPreference("pdfjs.disabled",true);//only for pdf
		profile.setPreference("browser.download.showWhenStarting", false);
		profile.setPreference("browser.helperApps.neverAsk.force",false);
		profile.setPreference("browser.helperApps.neverAsk.saveToDisk","multipart/x-zip,application/zip,application/pdf");//2nd parameter is mime type ,it varies based on file we downloading
		profile.setPreference("browser.download.folderList", 2);//0-desktop 1-download 2-specified location
		profile.setPreference("browser.download.dir", location);
		
		FirefoxOptions option=new FirefoxOptions();
		option.setProfile(profile);
		
		System.setProperty("webdriver.gecko.driver","C:\\Eclipse\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver(option);
		
		
		/*File downloadfile=new File(location+"\\DownloadDemo-master.zip");
		Assert.assertTrue;*///Not working
		
		
		//Edge
		
		
	/*	HashMap preferences=new HashMap();
		
		preferences.put("download.default_directory", location);
		
		EdgeOptions option=new EdgeOptions();
		option.setExperimentalOption("prefs", preferences);
		
		System.setProperty("webdriver.edge.driver","C:\\Eclipse\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver(option);*/
		
		
		
	 driver.get("https://omayo.blogspot.com/p/page7.html");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		
			
		driver.findElement(By.xpath("//a[normalize-space()='ZIP file']")).click();
		
	}

}

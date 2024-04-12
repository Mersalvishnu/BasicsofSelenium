package vishnu;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

public class IRCTCWebpage {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
            
	      ChromeOptions options =new ChromeOptions();
		  options.addArguments("--remote-allow-origins=*");
		  options.addArguments("--remote-allow-origins=*");
		  options.addArguments("--disable-notifications");
		WebDriver driver =new ChromeDriver(options);
		driver.get("https://www.epfindia.gov.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(45));
		
		driver.manage().window().maximize();
		String Title =driver.getTitle();
		System.out.println(Title);
		
		 TakesScreenshot ts =(TakesScreenshot)driver;
		 File src =ts.getScreenshotAs(OutputType.FILE);
		 File target =new File(".\\screenshots\\epfonew3.png");
		 
		 FileUtils.copyFile(src, target);
		 
		 Thread.sleep(10000);
		 driver.close();
		
		
		
		
		
	}

}
